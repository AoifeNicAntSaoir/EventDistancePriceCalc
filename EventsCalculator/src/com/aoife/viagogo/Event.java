package com.aoife.viagogo;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.*;


public class Event implements Comparable<Event> {

    private double price;
    private Point eventCoordinates;
    private int id;
    private Point userCoordinates;
    private double distance;


    public Event(double price, Point eventCoordinates, int id, Point userCoordinates){
        setId(id);
        setEventCoordinates(eventCoordinates);
        setPrice(price);
        setUserCoordinates(userCoordinates);
    }
    public Event(){

    }
    public Point getUserCoordinates(){
        return eventCoordinates;
    }
    public void setUserCoordinates(Point userCoordinates){
        this.userCoordinates = userCoordinates;

    }
    public double getManhattanDistance(){
        return (userCoordinates.getX() - eventCoordinates.getX()) + (userCoordinates.getY() - userCoordinates.getY());
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double prices) {
        this.price = prices;
    }

    public Point getEventCoordinatesoordinates() {
        return eventCoordinates;
    }

    public void setEventCoordinates(Point eventCoordinates) {
        this.eventCoordinates = eventCoordinates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String toString(){
        return "Event " + String.format("%03d",getId()) + " - $" + String.format("%.2f",getPrice()) + " " + "Distance " + getManhattanDistance();
    }

    @Override
   public int compareTo(Event event) {
        if(distance == event.getManhattanDistance())
            return 0;
        else if (distance == event.getManhattanDistance())
            return 1;
        else
            return -1;
    }
}
