package com.example.Catalog.dto;



import com.example.Catalog.entities.Reviews;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsDto {

    private String productId;


    private String productName;

    private  String productDescription;

    private  String imageURL;

    private String categoryId;

    private String merchantId;

    private String merchantName;

    private double price;

    private Integer stock;

    private String brand;
    private int rating=5;
    private int noOfBuyers=1;

    private List<Reviews> review;


}
