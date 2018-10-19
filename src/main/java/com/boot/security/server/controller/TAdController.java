package com.boot.security.server.controller;

import java.util.Date;
import java.util.List;

import com.boot.security.server.model.Ad;
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
import com.boot.security.server.dao.TAdDao;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tAds")
public class TAdController {

    @Autowired
    private TAdDao tAdDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public Ad save(@RequestBody Ad tAd) {
        tAd.setTime(new Date());
        tAdDao.save(tAd);
        return tAd;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public Ad get(@PathVariable Long id) {
        return tAdDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public Ad update(@RequestBody Ad tAd) {
        tAdDao.update(tAd);

        return tAd;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return tAdDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<Ad> list(PageTableRequest request) {
                return tAdDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        tAdDao.delete(id);
    }
}
