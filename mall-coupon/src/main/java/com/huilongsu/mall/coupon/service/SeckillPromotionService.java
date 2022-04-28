package com.huilongsu.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huilongsu.common.utils.PageUtils;
import com.huilongsu.mall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author huilongsu
 * @email 3148835359@qq.com
 * @date 2022-04-28 19:05:49
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

