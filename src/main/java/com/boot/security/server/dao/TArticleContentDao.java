package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.TArticleContent;

@Mapper
public interface TArticleContentDao {

    @Select("select * from t_article_content t where t.id = #{id}")
    TArticleContent getById(Long id);

    @Delete("delete from t_article_content where id = #{id}")
    int delete(Long id);

    int update(TArticleContent tArticleContent);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into t_article_content(content) values(#{content})")
    int save(TArticleContent tArticleContent);
    
    int count(@Param("params") Map<String, Object> params);

    List<TArticleContent> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("select max(id) from t_article_content")
    Integer getMaxId();
}
