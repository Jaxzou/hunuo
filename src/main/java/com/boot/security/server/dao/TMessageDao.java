package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.security.server.model.TMessage;

@Mapper
public interface TMessageDao {

    @Select("select * from t_message t where t.id = #{id}")
    TMessage getById(Long id);

    @Delete("delete from t_message where id = #{id}")
    int delete(Long id);

    int update(TMessage tMessage);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into t_message(title, name, email, phone, create_time, content) values(#{title}, #{name}, #{email}, #{phone}, #{createTime}, #{content})")
    int save(TMessage tMessage);
    
    int count(@Param("params") Map<String, Object> params);

    List<TMessage> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
