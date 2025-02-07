package com.task;
class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    public Product(int pid,double price,int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }
    @Override
    public double calcTax(){
        return salesTax * price; //returns payable tax
    }

}
