package com.macro.mall.tiny;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.service.PmsBrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.ResponseBody;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallTinyApplicationTests {

    @Autowired
    private PmsBrandService brandService;

    @Test
    public void contextLoads() {
    }

    @Test
    @ResponseBody
    public void getListTest(){
        System.err.println(CommonResult.success(brandService.listAllBrand()).getData());
    }

}
