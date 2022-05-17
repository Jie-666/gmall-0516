package com.jie.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jie.gmall.common.bean.PageResultVo;
import com.jie.gmall.common.bean.PageParamVo;

import com.jie.gmall.pms.mapper.SkuImagesMapper;
import com.jie.gmall.pms.entity.SkuImagesEntity;
import com.jie.gmall.pms.service.SkuImagesService;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesMapper, SkuImagesEntity> implements SkuImagesService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<SkuImagesEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<SkuImagesEntity>()
        );

        return new PageResultVo(page);
    }

}