package com.foodcourt.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long foodItemId;
    private int quantity;
    private Date orderTime;

    // Getters & Setters
}
