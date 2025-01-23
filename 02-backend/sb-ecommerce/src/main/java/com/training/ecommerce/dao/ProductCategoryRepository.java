package com.training.ecommerce.dao;

import com.training.ecommerce.entity.ProductCategory;
import com.training.ecommerce.projections.ProductCategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category",excerptProjection = ProductCategoryProjection.class)
//(name of JSON entry,/product-category)
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
