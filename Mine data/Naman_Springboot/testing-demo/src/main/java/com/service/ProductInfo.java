package com.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductInfo {
    private long productID;
    private String productName;
    private String productDesc;
    public ProductInfo(Long productID, String productName, String productDesc) {
        this.productID = productID;
        this.productName = productName;
        this.productDesc = productDesc;
    }
    public ProductInfo() {

    }


    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
List<ProductInfo> productList=new ArrayList<ProductInfo>();
    public ProductInfo getProductInfo(Long productID)
    {
        populateList();
        System.out.println(productList);
        for(ProductInfo p: productList)
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
        productList.add(new ProductInfo(101L,"Iphone","Expensive!!"));
        productList.add(new ProductInfo(102L,"Watch","Its cool!!"));
        productList.add(new ProductInfo(103L,"Machine","Its usefull!!"));
    }

}
