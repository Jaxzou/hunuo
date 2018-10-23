package com.boot.security.server.service;


import com.boot.security.server.model.TProduct;

import java.util.Map;

public interface TProductService extends BaseService<TProduct> {

    void deleteById(Long id);

    /**
     * 根据id查询产品数据，产品列表
     * @param id
     * @return
     */
    Map<String,Object> findById(Long id);

    /**
     * 根据主键更新数据
     * @param tProduct
     */
    void updateById(TProduct tProduct);
}
