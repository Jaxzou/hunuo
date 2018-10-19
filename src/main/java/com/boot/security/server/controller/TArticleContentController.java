package com.boot.security.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.security.server.page.table.PageTableRequest;
import com.boot.security.server.page.table.PageTableHandler;
import com.boot.security.server.page.table.PageTableResponse;
import com.boot.security.server.page.table.PageTableHandler.CountHandler;
import com.boot.security.server.page.table.PageTableHandler.ListHandler;
import com.boot.security.server.dao.TArticleContentDao;
import com.boot.security.server.model.TArticleContent;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tArticleContents")
public class TArticleContentController {

    @Autowired
    private TArticleContentDao tArticleContentDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public TArticleContent save(@RequestBody TArticleContent tArticleContent) {
        tArticleContentDao.save(tArticleContent);

        return tArticleContent;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public TArticleContent get(@PathVariable Long id) {
        return tArticleContentDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public TArticleContent update(@RequestBody TArticleContent tArticleContent) {
        tArticleContentDao.update(tArticleContent);

        return tArticleContent;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return tArticleContentDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<TArticleContent> list(PageTableRequest request) {
                return tArticleContentDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        tArticleContentDao.delete(id);
    }
}
