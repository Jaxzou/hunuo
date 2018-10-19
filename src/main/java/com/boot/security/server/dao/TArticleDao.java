package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.TArticle;

@Mapper
public interface TArticleDao {

    @Select("select * from t_article t where t.id = #{id}")
    TArticle getById(Long id);

    @Delete("delete from t_article where id = #{id}")
    int delete(Long id);

    int update(TArticle tArticle);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into t_article(title, create_time, classify_id, content_id) values(#{title}, #{createTime}, #{classifyId}, #{contentId})")
    int save(TArticle tArticle);
    
    int count(@Param("params") Map<String, Object> params);

    List<TArticle> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
