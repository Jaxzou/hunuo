package com.boot.security.server.service.impl;

import com.boot.security.server.dao.TProductDao;
import com.boot.security.server.dao.TProductKindDao;
import com.boot.security.server.model.TProduct;
import com.boot.security.server.model.TProductKind;
import com.boot.security.server.service.TProductService;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TProductServiceImpl extends BaseServiceImpl<TProduct> implements TProductService{

    @Autowired
    private TProductDao tProductDao;

    @Autowired
    private TProductKindDao tProductKindDao;

    @Override
    public void deleteById(Long id) {
        tProductDao.deleteByPrimaryKey(id);
    }

    @Override
    public Map<String, Object> findById(Long id) {
        Map<String,Object> map = new HashMap<>();

        TProduct product = new TProduct();
        product.setUpdateTime(null);
        product.setId(id);
        TProduct tProduct = tProductDao.selectOne(product);

        List<TProductKind> tProductKindList = tProductKindDao.selectAll();

        map.put("tProduct",tProduct);
        map.put("tProductKindList",tProductKindList);

        return map;
    }

    @Override
    public void updateById(TProduct tProduct) {
        Example example = new Example(TProduct.class);
        example.createCriteria().andEqualTo("id",tProduct.getId());
        tProductDao.updateByExampleSelective(tProduct,example);
    }
}
