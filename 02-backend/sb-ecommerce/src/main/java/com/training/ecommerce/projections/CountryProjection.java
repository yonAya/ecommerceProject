package com.training.ecommerce.projections;

import com.training.ecommerce.entity.Country;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "countryProjection", types = Country.class)

public interface CountryProjection {
    int getId();
    String getCode();
    String getName();

}
