package com.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductPrice {
    private long productID;
    private Integer orginalPrice;
    private Integer discountPrice;

    public ProductPrice() {
    }

    public ProductPrice(long productID, Integer orginalPrice, Integer discountPrice) {
        this.productID = productID;
        this.orginalPrice = orginalPrice;
        this.discountPrice = discountPrice;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public Integer getOrginalPrice() {
        return orginalPrice;
    }

    public void setOrginalPrice(Integer orginalPrice) {
        this.orginalPrice = orginalPrice;
    }

    public Integer getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }

    List<ProductPrice> productPrice=new ArrayList<ProductPrice>();
    public ProductPrice getProductPrice(Long productID)
    {
        populateList();
        System.out.println(productPrice);
        for(ProductPrice p: productPrice)
        {
            if(productID.equals(p.getProductID()))
            {
                return p;
            }
        }
        return null;
    }
    private void populateList()
    {
        productPrice.add(new ProductPrice(101L,1999,999));
        productPrice.add(new ProductPrice(102L,199,99));
        productPrice.add(new ProductPrice(103L,1299,600));
    }
}
