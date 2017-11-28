package com.aoife.viagogo;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Aoife Sayers on 28/11/2017.
 * This class takes in the user co-ordinates, generates an array list of random seeded events and sorts them.
 */
public class Seeder {
    public static void main(String[] args) {
        //Declaration
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        Point userPoint;
        ArrayList<Event> eventList = new ArrayList<Event>();
        Event e = new Event();
        //User Entry
        System.out.println("Enter your x co-oordidnates");
        int x = in.nextInt();
        System.out.println("Enter your Y c" +
                "o-oordinates");
        int y = in.nextInt();
        if(x >10 || x < -10 ||
                y >10 || y<-10){
            throw new IllegalArgumentException("X & Y co-ordinates must be in the range -10 to +10");
        }
        //Seeds random data
        for (int i = 1; i <= 10; i++) {
            userPoint = new Point(x, y);
            eventList.add(new Event(r.nextInt(100) + 1, new Point((r.nextInt(10) - 10), (r.nextInt(10) - 10)), (r.nextInt(100) + 1), userPoint));
        }
        //Sort list using comparables
        Collections.sort(eventList);
        int i = 0;
        for(Event event: eventList){
            if(i>4)
                break;
            System.out.println(event.toString());
            i++;
        }
    }
}


