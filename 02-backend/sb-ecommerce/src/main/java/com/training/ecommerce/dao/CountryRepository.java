package com.training.ecommerce.dao;

import com.training.ecommerce.entity.Country;
import com.training.ecommerce.projections.CountryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "countries", path = "countries",excerptProjection= CountryProjection.class)
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
