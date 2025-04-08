package com.imad.ecommerce.kafka;

import com.imad.ecommerce.customer.CustomerResponse;
import com.imad.ecommerce.order.PaymentMethod;
import com.imad.ecommerce.product.PurchaseResponse;

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
