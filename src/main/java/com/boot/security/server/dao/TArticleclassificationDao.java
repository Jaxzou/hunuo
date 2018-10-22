package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.TArticleclassification;

@Mapper
public interface TArticleclassificationDao {

    @Select("select * from t_articleclassification t where t.id = #{id}")
    TArticleclassification getById(Long id);

    @Delete("delete from t_articleclassification where id = #{id}")
    int delete(Long id);

    int update(TArticleclassification tArticleclassification);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into t_articleclassification(name, parent_id) values(#{name}, #{parentId})")
    int save(TArticleclassification tArticleclassification);
    
    int count(@Param("params") Map<String, Object> params);

    List<TArticleclassification> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("select * from t_articleclassification")
    List<TArticleclassification> getList();
}
