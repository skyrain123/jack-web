package com.framework.jack.demo.mapper;

import com.framework.jack.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author jack
 */
@Mapper
public interface UserMapper {

    @Select("select * from users where username = #{username} and password = #{password}")
    User login(@Param("username") String username, @Param("password") String password);
}