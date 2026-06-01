package ru.javaops.cloudjava.ordersservice.storage.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class MenuOrder {
    @Id
    private Long id;

    @Column(value="total_price")
    private BigDecimal total_price;
    @Column(value="city")
    private String city;
    @Column(value="street")
    private String street;
    @Column(value="house")
    private Integer house;
    @Column(value="apartment")
    private Integer apartment;
    @Column(value="menu_line_items")
    private String menu_line_items;
    @Column(value="status")
    private Status status;
    @Column(value="created_by")
    @CreatedBy
    private String created_by;
    @Column(value="created_at")
    @CreatedDate
    private OffsetDateTime created_at;
    @Column(value="updated_at")
    @LastModifiedDate
    private OffsetDateTime updated_at;
}
