package com.syd.tara.dao;

import com.syd.tara.bean.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {
    List<UserDO> get(UserDO user);
}
