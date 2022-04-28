package com.huilongsu.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huilongsu.common.utils.PageUtils;
import com.huilongsu.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author huilongsu
 * @email 3148835359@qq.com
 * @date 2022-04-28 19:05:49
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

