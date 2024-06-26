package dev.archie.productservice.controller;

import dev.archie.productservice.dto.CategoryDTO;
import dev.archie.productservice.service.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }
    @GetMapping()
    public String getAllCategories(){
        return "Returning all categories";
    }

    @GetMapping("/{categoryId}")
    public String getAllProductsInCategory(@PathVariable("categoryId") Long categoryId){
        return "Returning all products with category id "+categoryId;
    }

    @PostMapping()
    public String createCategory(@RequestBody CategoryDTO categoryDtO){
        return "Added new category";
    }

    @PutMapping("/{categoryId}")
    public String updateCategory(@PathVariable("categoryId") Long categoryId, @RequestBody CategoryDTO categoryDTO){
        return "Updated Category";
    }

    @DeleteMapping("/{categoryId}")
    public String deleteCategory(@PathVariable("categoryId") Long categoryId){
        return "Deleted Category with category id "+categoryId;
    }
}
