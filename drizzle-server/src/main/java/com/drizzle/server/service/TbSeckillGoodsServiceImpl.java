package com.drizzle.server.service;

import com.drizzle.server.bean.TbSeckillGoods;
import com.drizzle.server.mapper.TbSeckillGoodsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbSeckillGoodsServiceImpl implements TbSeckillGoodsService{

    @Resource
    private TbSeckillGoodsMapper tbSeckillGoodsMapper;

    @Override
    public List<TbSeckillGoods> selectAll() {
        return tbSeckillGoodsMapper.selectAll();
    }
}
