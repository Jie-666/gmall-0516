package com.jie.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jie.gmall.common.bean.PageResultVo;
import com.jie.gmall.common.bean.PageParamVo;

import com.jie.gmall.sms.mapper.CouponHistoryMapper;
import com.jie.gmall.sms.entity.CouponHistoryEntity;
import com.jie.gmall.sms.service.CouponHistoryService;


@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryMapper, CouponHistoryEntity> implements CouponHistoryService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<CouponHistoryEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<CouponHistoryEntity>()
        );

        return new PageResultVo(page);
    }

}