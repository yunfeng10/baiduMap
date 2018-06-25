package com.zyf.rt;

import com.zyf.rt.annotation.AnTest;
import com.zyf.rt.bean.TestBean;
import org.apache.commons.exec.*;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.annotation.AnnotationType;

import javax.servlet.http.HttpServletRequest;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/19.
 */
@Controller
@SpringBootApplication
public class RtApplication {

    /*@RequestMapping("/")
    String index(HttpServletRequest req) {

        final TestBean testBean = new TestBean();
        testBean.setF3(new Date());
        final Map<String, Object> mappings = new LinkedHashMap<String, Object>();
        *//*BeanInfo beanInfo;
        try {
            beanInfo = Introspector.getBeanInfo(testBean.getClass(), Object.class);
            int a=1;
            if(beanInfo!=null){
                PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
                for(PropertyDescriptor p:propertyDescriptors){
                    try {
                        System.err.println(p.getName());
                        Object r = new PropertyDescriptor(p.getName(), testBean.getClass()).getReadMethod().invoke(testBean);
                        System.out.println(r);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }*//*
        AnTest anTest = AnnotationUtils.findAnnotation(testBean.getClass(), AnTest.class);
        ReflectionUtils.doWithFields(testBean.getClass(), new ReflectionUtils.FieldCallback() {
            @Override
            public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
                AnnotationAttributes attr = AnnotatedElementUtils.findAnnotationAttributes(field, AnTest.class);
                if (attr != null) {
                    Object r = null;
                    try {
                        r = new PropertyDescriptor(field.getName(), testBean.getClass()).getReadMethod().invoke(testBean);
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    } catch (IntrospectionException e) {
                        e.printStackTrace();
                    }
                    System.out.println(field.getName()+":"+r);
                }
            }
        });
        return "hello spring boot";
    }*/
    @RequestMapping("/")
    public String index(HttpServletRequest req){
        return "lala";
    }

    public static void main(String[] args) {
//        SpringApplication.run(RtApplication.class,args);
        SpringApplication springApplication = new SpringApplication(RtApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);
    }
}
