package com.syd.tara.service;

import com.syd.tara.bean.UserDO;

import java.util.List;

public interface UserService {
    List<UserDO>  getUserList(UserDO user);
}
