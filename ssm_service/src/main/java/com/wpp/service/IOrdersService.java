package com.wpp.service;


import com.wpp.domain.Orders;

import java.util.List;

public interface IOrdersService {


    List<Orders> findAll(int page, int size) throws Exception;
//    List<Orders> findAll() throws Exception;
}
