package com.huilongsu.mall.order.dao;

import com.huilongsu.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author huilongsu
 * @email 3148835359@qq.com
 * @date 2022-04-28 20:26:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
