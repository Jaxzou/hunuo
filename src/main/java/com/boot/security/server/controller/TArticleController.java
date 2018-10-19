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
import com.boot.security.server.dao.TArticleDao;
import com.boot.security.server.model.TArticle;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tArticles")
public class TArticleController {

    @Autowired
    private TArticleDao tArticleDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public TArticle save(@RequestBody TArticle tArticle) {
        tArticleDao.save(tArticle);

        return tArticle;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public TArticle get(@PathVariable Long id) {
        return tArticleDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public TArticle update(@RequestBody TArticle tArticle) {
        tArticleDao.update(tArticle);

        return tArticle;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return tArticleDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<TArticle> list(PageTableRequest request) {
                return tArticleDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        tArticleDao.delete(id);
    }
}
