package com.jie.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.gmall.common.bean.PageResultVo;
import com.jie.gmall.common.bean.PageParamVo;
import com.jie.gmall.pms.entity.SpuDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author kjj
 * @email kjj@163.com
 * @date 2022-05-16 22:40:01
 */
public interface SpuDescService extends IService<SpuDescEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

