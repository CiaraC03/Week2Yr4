package ie.atu.ie.atu.week2_refresher;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> listproduct = new ArrayList<>();

    @GetMapping("/products")
    public List<Product> getProductList()
    {
        return listproduct;
    }

    @PostMapping("/products")
    public Product returnProducts(@RequestBody Product product)
    {
        listproduct.add(product);
        return product;
    }
}
