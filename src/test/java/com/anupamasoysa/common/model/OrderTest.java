package com.anupamasoysa.common.model;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
  @Test
  void record_should_hold_values() {
    var now = Instant.now();
    var order = new Order("ORD-1", "CUST-1", 2, now);

    assertEquals("ORD-1", order.orderId());
    assertEquals("CUST-1", order.customerId());
    assertEquals(2, order.quantity());
    assertEquals(now, order.createdAt());
  }
}
