package com.jie.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jie.gmall.common.bean.PageResultVo;
import com.jie.gmall.common.bean.PageParamVo;

import com.jie.gmall.sms.mapper.CouponMapper;
import com.jie.gmall.sms.entity.CouponEntity;
import com.jie.gmall.sms.service.CouponService;


@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponMapper, CouponEntity> implements CouponService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<CouponEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<CouponEntity>()
        );

        return new PageResultVo(page);
    }

}