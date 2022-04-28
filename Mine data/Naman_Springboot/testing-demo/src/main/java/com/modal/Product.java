package com.modal;

public class Product {
    public Product(Long productID, String productName, String productDesc, Integer productPrice, String productStock) {
        this.productID=productID;
        this.productDesc=productDesc;
        this.productName=productName;
        this.productPrice=productPrice;
        this.productStock=productStock;
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

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductStock() {
        return productStock;
    }

    public void setProductStock(String productStock) {
        this.productStock = productStock;
    }

    private long productID;
    private String productName;
    private String productDesc;
    private Integer productPrice;
    private String productStock;

}
