package com.huilongsu.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huilongsu.common.utils.PageUtils;
import com.huilongsu.mall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author huilongsu
 * @email 3148835359@qq.com
 * @date 2022-04-28 19:05:49
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

