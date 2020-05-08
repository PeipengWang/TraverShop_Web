import com.wpp.domain.Product;
import com.wpp.service.IProductService;
import com.wpp.service.impl.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test1 {
    public static void main(String[] args) throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IProductService productService = (IProductService) ac.getBean("productService");
        List<Product> products = productService.findAllProduct();
        for(Product product:products){
            System.out.println(product);
        }
    }
}
