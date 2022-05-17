package com.jie.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.gmall.common.bean.PageResultVo;
import com.jie.gmall.common.bean.PageParamVo;
import com.jie.gmall.sms.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author kjj
 * @email kjj@163.com
 * @date 2022-05-17 09:58:43
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

