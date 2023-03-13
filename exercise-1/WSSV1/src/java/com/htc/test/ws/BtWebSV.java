/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htc.test.ws;

import DAO.BAI1Dao;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "BtWebSV")

public class BtWebSV {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "payThroughCreditCard")
    public Boolean payThroughCreditCard(@WebParam(name = "name") String name, @WebParam(name = "type") String type, @WebParam(name = "cardNumber") String cardNumber, @WebParam(name = "CVCNum") String CVCNum, @WebParam(name = "expiredDate") String expiredDate) {
        boolean result = BAI1Dao.getInstance().CheckCreaditCus(name, type, cardNumber, CVCNum, expiredDate);
        System.out.println(result);
        return result;
    }
}
