package com.boot.security.server.service;

import com.boot.security.server.model.TProductKind;

import java.util.Map;

public interface TProductKindService extends BaseService<TProductKind>{

    void deleteById(Long id);

    /**
     * 根据id查询该分类数据及分类列表
     * @param id
     * @return
     */
    Map<String,Object> findById(Long id);

    /**
     * 根据主键更新数据
     * @param tProductKind
     */
    void updateById(TProductKind tProductKind);
}
