package com.jie.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jie.gmall.common.bean.PageResultVo;
import com.jie.gmall.common.bean.PageParamVo;
import com.jie.gmall.sms.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author kjj
 * @email kjj@163.com
 * @date 2022-05-17 09:58:43
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

