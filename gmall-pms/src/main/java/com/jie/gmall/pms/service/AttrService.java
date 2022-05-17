package com.jie.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.gmall.common.bean.PageResultVo;
import com.jie.gmall.common.bean.PageParamVo;
import com.jie.gmall.pms.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author kjj
 * @email kjj@163.com
 * @date 2022-05-16 22:40:01
 */
public interface AttrService extends IService<AttrEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

