package dev.archie.productservice.service;

import dev.archie.productservice.dto.CategoryDTO;
import org.springframework.web.bind.annotation.*;

public class FakeStoreCategoryServiceImpl implements CategoryService {

    @Override
    public String getAllCategories(){
        return "Returning all categories";
    }

    @Override
    public String getAllProductsInCategory(@PathVariable("categoryId") Long categoryId){
        return "Returning all products with category id "+categoryId;
    }

    @Override
    public String createCategory(@RequestBody CategoryDTO categoryDtO){
        return "Added new category";
    }

    @Override
    public String updateCategory(@PathVariable("categoryId") Long categoryId, @RequestBody CategoryDTO categoryDTO){
        return "Updated Category";
    }

    @Override
    public String deleteCategory(@PathVariable("categoryId") Long categoryId){
        return "Deleted Category with category id "+categoryId;
    }
}
