package com.houssem.ecommerce.payment;

import com.houssem.ecommerce.customer.CustomerResponse;
import com.houssem.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}