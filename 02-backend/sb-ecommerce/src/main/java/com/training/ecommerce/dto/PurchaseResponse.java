package com.training.ecommerce.dto;

import lombok.Data;

// Lombok @Data will generate constructor for final fields (so we added final(or @NotNull) to orderTrackingNumber)
@Data

// Use this class to send back a java object as a Json
public class PurchaseResponse {

    private final String orderTrackingNumber;

}
