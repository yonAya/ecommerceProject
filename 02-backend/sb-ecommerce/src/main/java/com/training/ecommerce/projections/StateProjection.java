package com.training.ecommerce.projections;

import com.training.ecommerce.entity.State;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "stateProjection",types = {State.class})
public interface StateProjection {
    int getId();
    String getName();
}
