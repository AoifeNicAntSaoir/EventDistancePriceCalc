package com.aoife.viagogo;
/*
@author Aoife Sayers
Ticket class with a price
 */
public class Ticket implements Comparable<Ticket>{
    private double price;

    public Ticket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Ticket ticket) {
        if(price == ticket.getPrice())
            return 0;
        else if (price > ticket.getPrice())
            return 1;
        else
            return -1;
    }
}