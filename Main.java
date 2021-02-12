package HomeTask7;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
     int i = 0;
        Cat[] catArray = new Cat[2];
        catArray[0] = new Cat(120, 300);
        catArray[1] = new Cat(100, 400);

        Robot[] robots = new Robot[2];
        robots[0] = new Robot(15, 2000);
        robots[1] = new Robot(50, 500);

        Human[] humans = new Human[2];
        humans[0] = new Human(50, 1000);
        humans[1] = new Human(65, 850);

        Wall[] walls = new Wall[2];
        walls[0] = new Wall(40);
        walls[1] = new Wall(60);

        Track[] tracks = new Track[2];
        tracks[0] = new Track(250);
        tracks[1] = new Track(499);
        for (Cat cats: catArray
             ) {
            cats.run(tracks[i]);
            cats.jump(walls[i]);
            i++;
            cats.run(tracks[i]);
            cats.jump(walls[i]);
            i=0;
        }
        for (Human hum: humans
        ) {
            hum.run(tracks[i]);
            hum.jump(walls[i]);
            i++;
            hum.run(tracks[i]);
            hum.jump(walls[i]);
            i = 0;
        }
        for (Robot robot: robots
        ) {
            robot.run(tracks[i]);
            robot.jump(walls[i]);
            i++;
            robot.run(tracks[i]);
            robot.jump(walls[i]);
            i = 0;
        }}
    
}