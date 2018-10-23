package com.boot.security.server.controller;


import java.util.Date;
import java.util.List;
import java.util.Map;

import com.boot.security.server.service.TProductKindService;
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
import com.boot.security.server.dao.TProductKindDao;
import com.boot.security.server.model.TProductKind;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tProductKinds")
public class TProductKindController {

    @Autowired
    private TProductKindService tProductKindService;

    @Autowired
    private TProductKindDao tProductKindDao;

    @PostMapping
    @ApiOperation(value = "保存")
    public TProductKind save(@RequestBody TProductKind tProductKind) {
        tProductKind.setCreateTime(new Date());
        tProductKindService.add(tProductKind);
        return tProductKind;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public Map<String,Object> get(@PathVariable Long id) {
        return tProductKindService.findById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public TProductKind update(@RequestBody TProductKind tProductKind) {
        if(tProductKind.getStatus() == null){
            tProductKind.setStatus("off");
        }
        if(tProductKind.getIsIndex() == null){
            tProductKind.setIsIndex("off");
        }
        tProductKindService.updateById(tProductKind);
        return tProductKind;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return tProductKindDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<TProductKind> list(PageTableRequest request) {
                return tProductKindDao.list(request.getParams(), request.getOffset()==null?0:request.getOffset(), request.getLimit()==null?100:request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        tProductKindService.deleteById(id);
    }
}
