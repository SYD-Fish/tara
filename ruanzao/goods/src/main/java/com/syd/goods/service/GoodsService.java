package com.syd.goods.service;

import com.syd.goods.model.GoodsKindModel;

import java.util.List;

/**
 * Description:
 * ClassName:GoodsService
 * Package:com.syd.goods.service
 * Date:2019/7/8 22:03
 * Author: syd-fish
 */
public interface GoodsService {
    /**
     * 获取货物的集合
     * @param goodsKindModel
     * @return
     */
    List<GoodsKindModel> getGoodsKindList(GoodsKindModel goodsKindModel);
}
