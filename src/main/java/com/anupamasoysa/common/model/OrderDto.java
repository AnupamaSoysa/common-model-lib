package com.anupamasoysa.common.model;

/** Shared DTO example. */
public record OrderDto(
    String orderId,
    String customerId,
    int quantity
) {}
