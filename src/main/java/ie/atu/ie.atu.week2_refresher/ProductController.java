package ie.atu.ie.atu.week2_refresher;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class ProductController {


    private List<Product> listproduct = new ArrayList<Product>();

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
