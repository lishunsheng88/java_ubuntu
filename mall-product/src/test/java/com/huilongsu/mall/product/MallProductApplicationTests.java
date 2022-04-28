package com.huilongsu.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huilongsu.mall.product.entity.PmsBrandEntity;
import com.huilongsu.mall.product.service.PmsBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@RunWith(SpringRunner.class)
@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    PmsBrandService pmsBrandService;

    @Test
    void contextLoads() {
        PmsBrandEntity brandEntity = new PmsBrandEntity();
//        brandEntity.setName("asdf");
//        pmsBrandService.save(brandEntity);
//        System.out.println("okokokok");
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("huawei");
//        pmsBrandService.updateById(brandEntity);
        List<PmsBrandEntity> list=pmsBrandService.list(new QueryWrapper<PmsBrandEntity>().eq("brand_id",1L));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
