import javax.xml.bind.SchemaOutputResolver;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by t00170881 on 23/11/2017.
 */
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Randomly setting Coordinates
        Random random = new Random();
        Event randomEvent = new Event(new Point((random.nextInt(10)-10), (random.nextInt(10)-10)));
        System.out.println(randomEvent.toString());

        //User suppied co-ordinates
        System.out.println("Enter your X coordinates");
        int xCoords = input.nextInt();
        System.out.println("Enter your y coordinates");
        int yCoords = input.nextInt();

        if(xCoords >10 || xCoords < -10 ||
                yCoords>10 || yCoords<10){
            throw new IllegalArgumentException("X & Y co-ordinates must be in the range -10 to +10");
        }
        Event myEvent = new Event(new Point(xCoords, yCoords));
        System.out.println(myEvent.toString());
    }
}
