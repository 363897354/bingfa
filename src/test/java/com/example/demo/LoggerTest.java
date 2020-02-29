package com.example.demo;



import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 * User:
 * Date:
 * Time: 下午 8:05.
 * Explain:日志测试
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {


    //private final Logger logger=LoggerFactory.getLogger(LoggerTest.class);
    @Test
    public void test() {
        log.info("hello, my name is {}", "chengyi");
        log.info("name,{},password,{}","老王","123456");
    }

}
