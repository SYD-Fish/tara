package com.syd.goods.service;

import com.syd.goods.model.GoodsKindModel;
import com.syd.goods.model.GoodsModel;

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
     * get goods kind by adminId and type
     * @param goodsKindModel
     * @return
     */
    List<GoodsKindModel> getGoodsKindList(GoodsKindModel goodsKindModel);

    /**
     * get goods by goods kind id
     * @param goodsKindId
     * @return
     */
    List<GoodsModel> getGoods(Integer goodsKindId);
}
