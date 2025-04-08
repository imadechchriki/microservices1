package com.imad.ecommerce.customer;

public record CustomerResponse(
    String id,
    String firstname,
    String lastname,
    String email
) {

}
