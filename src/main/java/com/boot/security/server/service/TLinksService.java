package com.boot.security.server.service;


import com.boot.security.server.model.TLinks;

public interface TLinksService extends BaseService<TLinks>{

    /**
     * 根据主键修改数据
     * @param tLinks
     */
    void updateById(TLinks tLinks);
}
