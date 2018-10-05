package com.syd.tara.service;

import com.syd.tara.bean.UserDO;
import com.syd.tara.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public List<UserDO> getUserList(UserDO user) {
        return userDao.get(user);
    }
}
