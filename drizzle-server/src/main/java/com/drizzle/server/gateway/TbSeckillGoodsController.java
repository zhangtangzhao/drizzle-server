package com.drizzle.server.gateway;

import com.drizzle.server.bean.TbSeckillGoods;
import com.drizzle.server.service.TbSeckillGoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TbSeckillGoodsController {

    @Resource
    private TbSeckillGoodsService tbSeckillGoodsService;

    @RequestMapping("/seckill/goods")
    @ResponseBody
    public List<TbSeckillGoods> select() {
        return tbSeckillGoodsService.selectAll();
    }

}
