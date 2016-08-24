package com.wanda.pay.platform.dao.mapper;

import com.wanda.pay.platform.dao.po.PayJumpPage;

public interface PayJumpPageMapper {
    int deleteByPrimaryKey(String appId);

    int insert(PayJumpPage record);

    int insertSelective(PayJumpPage record);

    PayJumpPage selectByPrimaryKey(String appId);

    int updateByPrimaryKeySelective(PayJumpPage record);

    int updateByPrimaryKey(PayJumpPage record);
}