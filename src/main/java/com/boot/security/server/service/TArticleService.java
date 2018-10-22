package com.boot.security.server.service;

import com.boot.security.server.model.TArticle;
import com.boot.security.server.model.TArticleContent;

import java.util.Map;

/**
 * @author Jax.zou
 * @create 2018-10-21 15:04
 * @desc
 **/
public interface TArticleService {
    void save(TArticle tArticle);

    /**
     * 根据文章id查询数据
     * @param id  文章id
     */
    Map<String,Object> getById(Integer id);

    /**
     * 修改文章内容
     * @param tArticle
     */
    void update(TArticle tArticle);
}
