package com.cienet;

import com.cienet.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static java.lang.System.out;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {

    @Autowired
    Person person;
    /**
     * This is a recoder
     */
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Because application.yml.test is not identify,person is null.
     */
    @Test
    public void testPersonSting() {
        out.println(person);
    }

    @Test
    public void testLogOutPut() {
        /**
         * 顺序是按照日志级别进行输出
         * 日志级别可以调整,通过修改配置文件，默认级别为info级别，只能输出info及info之后。
         */
        logger.trace("This is a trace log");
        logger.debug("This is a debug log");
        logger.info("This is a info log");
        logger.warn("This is a warn log");
        logger.error("This is a error log");
    }

}
