package com.training.ecommerce.projections;

import com.training.ecommerce.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;
import java.util.Date;

@Projection(name = "productProjection", types = Product.class)
public interface ProductProjection {

    Long getId();
    String getSku();
    String getName();
    String getDescription();
    BigDecimal getUnitPrice();
    String getImageUrl();
    Boolean getActive();
    int getUnitsInStock();
    Date getDateCreated();
    Date getLastUpdated();

    ProductCategoryProjection getCategory();
}
