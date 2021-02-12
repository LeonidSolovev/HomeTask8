package HomeTask7;
public class Human implements Run, Jump{

    private int jumpHeight;
    private int runLength;
    public Human(int jumpHeight,
                 int runLength){
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;


    }

    @Override
    public void jump(Wall wall) {
        if (jumpHeight >= Wall.height){
            System.out.println("Человек перепрыгнул стену");
        }else {
            System.out.println("Человек не смог перепрыгнуть стену");
        }

    }

    @Override
    public void run(Track track) {
    if (runLength>= Track.length){
        System.out.println("Человек пробежал дорожку");
    }else {
        System.out.println("Человек не смог пробежать дорожку");
    }

    }
}
