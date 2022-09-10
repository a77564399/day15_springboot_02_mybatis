package com.tang.Mapper;

import com.tang.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
