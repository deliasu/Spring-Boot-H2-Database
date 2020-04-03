package net.csdcodes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @GetMapping("/allProducts")
    private List<Product> getAllProducts(){
        List<Product> productList = new ArrayList<Product>();
        repository.findAll().forEach(productList::add);
        return productList;
    }

    @GetMapping("/product")
    private Product getProduct(@RequestParam("id") Long id){
        return repository.findProductById(id);
    }

    @PostMapping("/saveProduct")
    private Product insertProduct(@ModelAttribute Product product){
        return repository.save(product);
    }

    @PostMapping("/updateProduct")
    private Product updateProduct(@ModelAttribute("product") Product product){
        return repository.save(product);
    }

    @DeleteMapping("/deleteProduct")
    private void deleteProduct(@RequestParam("id") Long id){
        repository.delete(repository.findProductById(id));
    }

}
