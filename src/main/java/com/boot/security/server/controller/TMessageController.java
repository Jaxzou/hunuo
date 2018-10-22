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
import com.boot.security.server.dao.TMessageDao;
import com.boot.security.server.model.TMessage;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tMessages")
public class TMessageController {

    @Autowired
    private TMessageDao tMessageDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public TMessage save(@RequestBody TMessage tMessage) {
        tMessageDao.save(tMessage);

        return tMessage;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public TMessage get(@PathVariable Long id) {
        return tMessageDao.getById(id);
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return tMessageDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<TMessage> list(PageTableRequest request) {
                return tMessageDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        tMessageDao.delete(id);
    }
}
