package com.syd.goods.controller;

import com.syd.goods.model.GoodsModel;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/getAllGoods")
    public List<GoodsModel> getGoods() {
        List<GoodsModel> goodsList = new ArrayList<>();
        GoodsModel goodsModel = new GoodsModel();
        goodsModel.setGoodsKind("大果");
        goodsList.add(goodsModel);
        return goodsList;
    }
}
