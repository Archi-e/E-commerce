package dev.archie.productservice.controller;

import dev.archie.productservice.dto.ProductDTO;
import dev.archie.productservice.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping()
    public String getAllProducts(){
        return "Returning all products";
    }

    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId") Long productId){
        return "Returning product with product id "+productId;
    }

    @PostMapping()
    public String createProduct(@RequestBody ProductDTO productDTO){
        return "Adding new Product "+productDTO;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId, @RequestBody ProductDTO productDTO){
        return "Updating product with product id: "+productId;
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId){
        return "Delete Product with product id: "+productId;
    }
}
