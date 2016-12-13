package com.jersey.test.service.serviceImpl;

import com.jersey.test.service.TransactionBo;
import org.springframework.stereotype.Service;

/**
 * Created by lifana on 2016/12/8.
 */

@Service
public class TransactionBoImpl implements TransactionBo {

    public String save() {

        return "Jersey + Spring example";

    }

}