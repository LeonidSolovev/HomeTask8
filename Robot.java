package HomeTask7;
public class Robot implements Run, Jump{

    private int jumpHeight;
    private int runLength;
    public Robot(int jumpHeight,
                 int runLength){
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }
    @Override
    public void jump(Wall wall) {
        if (jumpHeight >= Wall.height){
            System.out.println("Робот перепрыгнул стену");
        }else {
            System.out.println("Робот не смог перепрыгнуть стену");
        }

    }

    @Override
    public void run(Track track) {
        if (runLength>= Track.length){
            System.out.println("Робот пробежал дорожку");
        }else {
            System.out.println("Робот не смог пробежать дорожку");
        }


    }
}
