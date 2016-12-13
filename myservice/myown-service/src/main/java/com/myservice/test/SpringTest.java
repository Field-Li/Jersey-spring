package com.myservice.test;

import com.utils.SpringContextUtil;

import java.util.ServiceConfigurationError;

/**
 * Created by lifana on 2016/12/7.
 */
public class SpringTest {

    public static void main(String args[]){

        ServiceConfigurationError ser = (ServiceConfigurationError)SpringContextUtil.getBean("commentService");
        System.out.println("test");
    }
}
