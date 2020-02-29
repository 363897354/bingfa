package com.repository;

import com.dataobject.ProductCategory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;


// 这两个注解必填
@RunWith(SpringRunner.class)
@SpringBootTest

public class ProductCategoryRepositoryTest{

    // 接口对接了许多方法，所以必须引入
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        Optional<ProductCategory> productCategory = repository.findById(1);
        System.out.println(productCategory);
    }
}