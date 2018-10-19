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
import com.boot.security.server.dao.TArticleclassificationDao;
import com.boot.security.server.model.TArticleclassification;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tArticleclassifications")
public class TArticleclassificationController {

    @Autowired
    private TArticleclassificationDao tArticleclassificationDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public TArticleclassification save(@RequestBody TArticleclassification tArticleclassification) {
        tArticleclassificationDao.save(tArticleclassification);

        return tArticleclassification;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public TArticleclassification get(@PathVariable Long id) {
        return tArticleclassificationDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public TArticleclassification update(@RequestBody TArticleclassification tArticleclassification) {
        tArticleclassificationDao.update(tArticleclassification);

        return tArticleclassification;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return tArticleclassificationDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<TArticleclassification> list(PageTableRequest request) {
                return tArticleclassificationDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        tArticleclassificationDao.delete(id);
    }
}
