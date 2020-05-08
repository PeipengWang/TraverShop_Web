package com.wpp.service.impl;

import com.github.pagehelper.PageHelper;
import com.wpp.dao.IOrdersDao;
import com.wpp.domain.Orders;
import com.wpp.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        System.out.println(page+" "+size);
        PageHelper.startPage(page,size);
        return ordersDao.findAll();
    }

}
