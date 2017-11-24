import java.awt.*;
import java.util.Random;

/**
 * Created by t00170881 on 23/11/2017.
 */
public class Event {
    private int id;
    private double price;
    private Point coordinates;

    public Event(Point coordinates){
        Random randomNum = new Random();
        setId(randomNum.nextInt(100)+1);
        setPrice(randomNum.nextInt(200)+1);
        setCoordinates(coordinates);

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       this.price = price;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDistance(Point eventPoint){
        Point myPoint = new Point(3,5);
       return myPoint.distance(eventPoint);

    }

    public String toString(){
        return "Event " + String.format("%03d",getId()) + " - $" + String.format("%.2f",getPrice()) + " " + "Distance " +  String.format("%.0f", getDistance(getCoordinates()));
    }



}
