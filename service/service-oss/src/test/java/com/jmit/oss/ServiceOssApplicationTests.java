package com.jmit.oss;

import com.jmit.oss.service.DictService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceOssApplicationTests {

    @Autowired
    private DictService dictServiceImpl;

    @Test
    void contextLoads() {
        System.out.println(dictServiceImpl.list(null));
        System.out.println(dictServiceImpl.listMaps());
        System.out.println(dictServiceImpl.findAll());

    }

}
