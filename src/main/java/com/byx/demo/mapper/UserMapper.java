package com.byx.demo.mapper;

import com.byx.demo.entity.Result;
import com.byx.demo.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{userName} and password = md5(#{password})")
    List<User> getByUserName(String userName, String password);

}
