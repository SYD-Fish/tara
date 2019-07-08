package com.syd.goods.service;

import com.syd.goods.mapper.AdminMapper;
import com.syd.goods.model.AdminModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * ClassName:AdminServiceImpl
 * Package:com.syd.goods.service
 * Date:2019/7/8 21:20
 * Author: syd-fish
 */
@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public AdminModel getAdminModel(AdminModel adminModel) {
        return adminMapper.selectByAdmin(adminModel);
    }

    @Override
    public Integer getAdminId(String website) {
        return adminMapper.getAdminId(website);
    }
}
