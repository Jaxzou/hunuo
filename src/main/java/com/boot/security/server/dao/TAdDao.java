package com.boot.security.server.dao;

import java.util.List;
import java.util.Map;

import com.boot.security.server.model.Ad;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface TAdDao {

    @Select("select * from t_ad t where t.id = #{id}")
    Ad getById(Long id);

    @Delete("delete from t_ad where id = #{id}")
    int delete(Long id);

    int update(Ad tAd);
    
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into t_ad(title,ad_overview,ad_url,img_url,sort,time,status) values(#{title},#{adOverview},#{adUrl},#{imgUrl},#{sort},#{time},#{status})")
    int save(Ad tAd);
    
    int count(@Param("params") Map<String, Object> params);

    List<Ad> list(@Param("params") Map<String, Object> params, @Param("offset") Integer offset, @Param("limit") Integer limit);
}
