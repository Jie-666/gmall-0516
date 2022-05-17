package com.jie.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jie.gmall.common.bean.PageResultVo;
import com.jie.gmall.common.bean.PageParamVo;

import com.jie.gmall.sms.mapper.SeckillPromotionMapper;
import com.jie.gmall.sms.entity.SeckillPromotionEntity;
import com.jie.gmall.sms.service.SeckillPromotionService;


@Service("seckillPromotionService")
public class SeckillPromotionServiceImpl extends ServiceImpl<SeckillPromotionMapper, SeckillPromotionEntity> implements SeckillPromotionService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<SeckillPromotionEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<SeckillPromotionEntity>()
        );

        return new PageResultVo(page);
    }

}