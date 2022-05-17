package com.jie.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jie.gmall.common.bean.PageResultVo;
import com.jie.gmall.common.bean.PageParamVo;

import com.jie.gmall.pms.mapper.CategoryBrandMapper;
import com.jie.gmall.pms.entity.CategoryBrandEntity;
import com.jie.gmall.pms.service.CategoryBrandService;


@Service("categoryBrandService")
public class CategoryBrandServiceImpl extends ServiceImpl<CategoryBrandMapper, CategoryBrandEntity> implements CategoryBrandService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<CategoryBrandEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<CategoryBrandEntity>()
        );

        return new PageResultVo(page);
    }

}