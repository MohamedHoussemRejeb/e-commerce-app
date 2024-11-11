package com.houssem.ecommerce.kafka;

import com.houssem.ecommerce.customer.CustomerResponse;
import com.houssem.ecommerce.order.PaymentMethod;
import com.houssem.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
