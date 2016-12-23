package com.jersey.test;

/**
 * Created by lifana on 2016/12/8.
 */

import com.jersey.test.service.TransactionBo;
import com.jersey.test.service.serviceImpl.TransactionBoImpl;
import com.jersey.test.utils.SpringContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Component
@Path("/payment")
public class PaymentService {

    @Autowired
    TransactionBo transactionBo;

    @GET
    @Path("/mkyong")
    public Response savePayment() {

        /**
         * 两种访问方式：1、自动注入   2、手动SpringContextUtil调用
         */

//        String result = transactionBo.save();

        TransactionBoImpl tranImp = (TransactionBoImpl) SpringContextUtil.getBean("transactionBoImpl");
        String result = tranImp.save();

        return Response.status(200).entity(result).build();

    }

}