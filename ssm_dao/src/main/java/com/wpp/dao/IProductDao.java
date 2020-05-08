package com.wpp.dao;

import java.util.List;
import com.wpp.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDao {
    //查询所有的产品信息
    @Select("select * from product")
    public List<Product> findAllProduct() throws Exception;

   //保存商品信息
   @Insert("insert into product(id,productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{id},#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")

   public void save(Product product);
    //根据id查询产品
    @Select("select * from product where id=#{id}")
    public Product findById(String id) throws Exception;
}
