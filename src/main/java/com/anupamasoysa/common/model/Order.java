package com.anupamasoysa.common.model;

import java.time.Instant;

/** Shared domain model. */
public record Order(
    String orderId,
    String customerId,
    int quantity,
    Instant createdAt
) {}
