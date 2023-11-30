package com.example.trangbanhangonline.dto.responseDTO;

import com.example.trangbanhangonline.entity.Orders;
import com.example.trangbanhangonline.entity.Product;
import lombok.Data;

@Data
public class OrderDetailsResponseDTO {
    private Integer orderDetailsId;
    private Integer quantityOrders;
    private Double priceDetails;
    private Product product;
    private Orders orders;
}
