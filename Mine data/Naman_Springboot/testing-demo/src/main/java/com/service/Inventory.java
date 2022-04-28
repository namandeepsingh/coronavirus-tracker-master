package com.service;

import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class Inventory {
    private long productID;
    private boolean inStock;

    public Inventory(long productID, boolean inStock) {
        this.productID = productID;
        this.inStock = inStock;
    }

    public Inventory() {
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    List<Inventory> stock= new ArrayList<Inventory>();
    public Inventory getStock(Long productID)
    {
        getStockList();
        for(Inventory p:stock)
        {
            if(productID.equals(p.getProductID()))
            {
                return p;
            }
        }
        return null;
    }
    private void getStockList()
    {
        stock.add(new Inventory(101,true));
        stock.add(new Inventory(102,true));
        stock.add(new Inventory(103,false));
    }
}
