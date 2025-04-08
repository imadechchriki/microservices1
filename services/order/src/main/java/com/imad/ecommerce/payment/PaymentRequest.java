package com.imad.ecommerce.payment;

import com.imad.ecommerce.customer.CustomerResponse;
import com.imad.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
