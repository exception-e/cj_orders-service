package ru.javaops.cloudjava.ordersservice.storage.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

public class MenuOrder {
    @Id
    private Long id;

    @Column(value="total_price")
    private BigDecimal totalPrice;
    private String city;
    private String street;
    private Integer house;
    private Integer apartment;
    @Column(value="menu_line_items")
    private List<MenuLineItem> menuLineItems;
    private Status status;
    @Column(value="created_by")
    @CreatedBy
    private String createdBy;
    @Column(value="created_at")
    @CreatedDate
    private OffsetDateTime createdAt;
    @Column(value="updated_at")
    @LastModifiedDate
    private OffsetDateTime updatedAt;
}
