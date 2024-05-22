package dev.archie.productservice.service;

import dev.archie.productservice.dto.ProductDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProductService {
    String getAllProducts();

    String getSingleProduct(@PathVariable("productId") Long productId);

    String createProduct(@RequestBody ProductDTO productDTO);

    String updateProduct(@PathVariable("productId") Long productId, @RequestBody ProductDTO productDTO);

    String deleteProduct(@PathVariable("productId") Long productId);
}
