package com.huilongsu.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.huilongsu.common.utils.PageUtils;
import com.huilongsu.mall.product.entity.PmsSpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author huilongsu
 * @email 3148835359@qq.com
 * @date 2022-04-28 11:14:27
 */
public interface PmsSpuImagesService extends IService<PmsSpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

