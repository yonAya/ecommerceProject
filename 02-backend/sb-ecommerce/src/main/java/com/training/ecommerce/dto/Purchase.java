package com.training.ecommerce.dto;

import com.training.ecommerce.entity.Address;
import com.training.ecommerce.entity.Customer;
import com.training.ecommerce.entity.Order;
import com.training.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
