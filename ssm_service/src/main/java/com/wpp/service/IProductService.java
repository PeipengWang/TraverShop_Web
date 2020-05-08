package com.wpp.service;

import com.wpp.domain.Product;
import java.util.List;
public interface IProductService {
    public List<Product> findAllProduct() throws Exception;
    public void save(Product product) throws Exception;
}
