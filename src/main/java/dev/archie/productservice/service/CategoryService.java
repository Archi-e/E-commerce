package dev.archie.productservice.service;

import dev.archie.productservice.dto.CategoryDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface CategoryService {
    String getAllCategories();

    String getAllProductsInCategory(@PathVariable("categoryId") Long categoryId);

    String createCategory(@RequestBody CategoryDTO categoryDtO);

    String updateCategory(@PathVariable("categoryId") Long categoryId, @RequestBody CategoryDTO categoryDTO);

    String deleteCategory(@PathVariable("categoryId") Long categoryId);
}
