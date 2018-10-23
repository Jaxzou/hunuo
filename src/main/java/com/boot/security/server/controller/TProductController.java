package com.boot.security.server.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.boot.security.server.service.TProductService;
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
import com.boot.security.server.dao.TProductDao;
import com.boot.security.server.model.TProduct;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tProducts")
public class TProductController {

    @Autowired
    private TProductDao tProductDao;

    @Autowired
    private TProductService tProductService;

    @PostMapping
    @ApiOperation(value = "保存")
    public TProduct save(@RequestBody TProduct tProduct) {
        tProduct.setAddTime(new Date());
        if(tProduct.getStatus() == null){
            tProduct.setStatus("off");
        }
        if (tProduct.getIsNew() == null){
            tProduct.setIsNew("off");
        }
        if(tProduct.getIsHot() == null){
            tProduct.setIsHot("off");
        }
        if(tProduct.getIsRecommend() == null){
            tProduct.setIsRecommend("off");
        }
        tProductService.add(tProduct);
        return tProduct;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取")
    public Map<String,Object> get(@PathVariable Long id) {
        return tProductService.findById(id);
    }

    @PutMapping
    @ApiOperation(value = "修改")
    public TProduct update(@RequestBody TProduct tProduct) {
        if(tProduct.getStatus() == null){
            tProduct.setStatus("off");
        }
        if (tProduct.getIsNew() == null){
            tProduct.setIsNew("off");
        }
        if(tProduct.getIsHot() == null){
            tProduct.setIsHot("off");
        }
        if(tProduct.getIsRecommend() == null){
            tProduct.setIsRecommend("off");
        }
        tProductService.updateById(tProduct);
        return tProduct;
    }

    @GetMapping
    @ApiOperation(value = "列表")
    public PageTableResponse list(PageTableRequest request) {
        return new PageTableHandler(new CountHandler() {

            @Override
            public int count(PageTableRequest request) {
                return tProductDao.count(request.getParams());
            }
        }, new ListHandler() {

            @Override
            public List<TProduct> list(PageTableRequest request) {
                return tProductDao.list(request.getParams(), request.getOffset(), request.getLimit());
            }
        }).handle(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除")
    public void delete(@PathVariable Long id) {
        tProductService.deleteById(id);
    }
}
