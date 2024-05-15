package com.vinay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
