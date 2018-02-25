package com.zyf.rt;

import org.apache.commons.exec.*;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/12/19.
 */
@RestController
@SpringBootApplication
public class RtApplication {

    @RequestMapping("/")
    String index(HttpServletRequest req){
        return "hello spring boot";
    }

    public static void main(String[] args){
//        SpringApplication.run(RtApplication.class,args);
        SpringApplication springApplication = new SpringApplication(RtApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);
    }
}
