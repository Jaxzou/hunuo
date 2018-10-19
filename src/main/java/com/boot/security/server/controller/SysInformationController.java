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
import com.boot.security.server.dao.SysInformationDao;
import com.boot.security.server.model.SysInformation;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/sysInformations")
public class SysInformationController {

    @Autowired
    private SysInformationDao sysInformationDao;

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public SysInformation get(@PathVariable Long id) {
        return sysInformationDao.getById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public SysInformation update(@RequestBody SysInformation sysInformation) {
        sysInformationDao.update(sysInformation);

        return sysInformation;
    }

}
