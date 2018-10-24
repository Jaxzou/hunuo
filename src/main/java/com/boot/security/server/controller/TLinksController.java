package com.boot.security.server.controller;

import java.util.Date;
import java.util.List;

import com.boot.security.server.service.TLinksService;
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
import com.boot.security.server.dao.TLinksDao;
import com.boot.security.server.model.TLinks;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tLinkss")
public class TLinksController {

    @Autowired
    private TLinksDao tLinksDao;

    @Autowired
    private TLinksService tLinksService;

    @PostMapping
    @ApiOperation(value = "保存")
    public TLinks save(@RequestBody TLinks tLinks) {
        if(tLinks.getStatus() == null ){
            tLinks.setStatus("off");
        }
        if(tLinks.getCreateTime() == null){
            tLinks.setCreateTime(new Date());
        }
        tLinksService.add(tLinks);
        return tLinks;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public TLinks get(@PathVariable Long id) {
        return tLinksDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public TLinks update(@RequestBody TLinks tLinks) {
        tLinks.setUpdateTime(new Date());
        if(tLinks.getStatus() == null){
            tLinks.setStatus("off");
        }
        tLinksService.updateById(tLinks);
        return tLinks;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return tLinksDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<TLinks> list(PageTableRequest request) {
                return tLinksDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        //tLinksDao.delete(id);
    }
}
