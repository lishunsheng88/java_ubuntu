package com.huilongsu.mall.member.dao;

import com.huilongsu.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author huilongsu
 * @email 3148835359@qq.com
 * @date 2022-04-28 20:07:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
