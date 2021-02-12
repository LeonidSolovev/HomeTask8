package HomeTask7;
public class Cat implements Run, Jump {
    public int jumpHeight;
    public int runLength;

    public Cat(int jumpHeight,
               int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(Wall wall) {
        if (jumpHeight >= Wall.height) {
            System.out.println("Кот перепрыгнул стену");
        } else {
            System.out.println("Кот не смог перепрыгнуть стену");
        }

    }

    @Override
    public void run(Track track) {
        if (runLength >= Track.length) {
            System.out.println("Кот пробежал дорожку");
        } else {
            System.out.println("Кот не смог пробежать дорожку");

        }

    }
}
