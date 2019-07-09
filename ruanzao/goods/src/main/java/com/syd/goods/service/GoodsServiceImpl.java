package com.syd.goods.service;

import com.syd.goods.mapper.GoodsKindMapper;
import com.syd.goods.mapper.GoodsMapper;
import com.syd.goods.model.GoodsKindModel;
import com.syd.goods.model.GoodsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 * ClassName:GoodsService
 * Package:com.syd.goods.service
 * Date:2019/7/8 22:02
 * Author: syd-fish
 */
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsKindMapper goodsKindMapper;

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<GoodsKindModel> getGoodsKindList(GoodsKindModel goodsKindModel) {
        return goodsKindMapper.selectByGoodsKindModel(goodsKindModel);
    }

    @Override
    public List<GoodsModel> getGoods(Integer goodsKindId) {

        return goodsMapper.selectByGoodsKindId(goodsKindId);
    }
}
