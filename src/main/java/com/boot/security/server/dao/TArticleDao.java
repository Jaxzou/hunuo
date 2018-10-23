package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.*;

import com.boot.security.server.model.TArticle;

@Mapper
public interface TArticleDao extends tk.mybatis.mapper.common.Mapper<TArticle> {

    @Select("select * from t_article t where t.id = #{id}")
    TArticle getById(Long id);

    int update(TArticle tArticle);
    
    int count(@Param("params") Map<String, Object> params);

    List<TArticle> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
