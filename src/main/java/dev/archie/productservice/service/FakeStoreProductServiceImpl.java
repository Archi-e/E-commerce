package dev.archie.productservice.service;

import dev.archie.productservice.dto.ProductDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
public class FakeStoreProductServiceImpl implements ProductService {

    @Override
    public String getAllProducts(){
        return "Returning all products";
    }


    @Override
    public String getSingleProduct(@PathVariable("productId") Long productId){
        return "Returning product with product id "+productId;
    }


    @Override
    public String createProduct(@RequestBody ProductDTO productDTO){
        return "Adding new Product "+productDTO;
    }


    @Override
    public String updateProduct(@PathVariable("productId") Long productId, @RequestBody ProductDTO productDTO){
        return "Updating product with product id: "+productId;
    }


    @Override
    public String deleteProduct(@PathVariable("productId") Long productId){
        return "Delete Product with product id: "+productId;
    }
}
