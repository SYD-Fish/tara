package com.syd.goods.controller;

import com.syd.goods.model.GoodsKindModel;
import com.syd.goods.model.GoodsModel;
import com.syd.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * ClassName:GoodsController
 * Package:com.syd.goods.controller
 * Date:2019/6/29 15:32
 * Author: syd-fish
 */
@RestController
@RequestMapping("/api/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/getAllFruitKind/{adminId}")
    public List<GoodsKindModel> getGoods(@PathVariable("adminId") Integer adminId) {
        System.out.println(adminId);
        GoodsKindModel goodsKindModel = new GoodsKindModel();
        goodsKindModel.setAdminId(adminId);
        goodsKindModel.setGoodsKindFlag("0");
        return goodsService.getGoodsKindList(goodsKindModel);
    }
}
