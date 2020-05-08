package com.wpp.service.impl;

import java.util.List;
import com.wpp.dao.IProductDao;
import com.wpp.domain.Product;
import com.wpp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("productService")
@Transactional
public class ProductService implements IProductService {

    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAllProduct() throws Exception {
        System.out.println("表现层执行了");
        System.out.println(productDao);
        return productDao.findAllProduct();
    }

    @Override
    public void save(Product product){
        System.out.println("表现层执行了");
        System.out.println(product);
        productDao.save(product);
    }
}
