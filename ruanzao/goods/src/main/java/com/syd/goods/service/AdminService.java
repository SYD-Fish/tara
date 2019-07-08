package com.syd.goods.service;

import com.syd.goods.model.AdminModel; /**
 * Description:
 * ClassName:AdminService
 * Package:com.syd.goods.service
 * Date:2019/7/8 21:20
 * Author: syd-fish
 */
public interface AdminService {

    AdminModel getAdminModel(AdminModel adminModel);

    /**
     * 首次登陆 获取adminId
     * @param website
     * @return
     */
    Integer getAdminId(String website);
}
