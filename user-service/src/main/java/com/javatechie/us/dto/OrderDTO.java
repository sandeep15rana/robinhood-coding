package com.javatechie.us.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private int id;
    private String name;
    private String category;
    private String color;
    private double price;
    
    // Constructor
    public OrderDTO(int id, String name, String category, String color, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.color = color;
        this.price = price;
    }
    
//    public Order() {
//    }
//    
    
 // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
 
}
