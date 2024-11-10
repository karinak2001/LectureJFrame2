import java.awt.*;

public class Character {
    private int x;
    private int y;

    public static final int SIZE = 30;


    public Character(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveRight() {
        this.x++;
    }

    public void moveLeft() {
        this.x--;
    }

    public void moveUp() {
        this.y--;
    }

    public void moveDown() {
        this.y++;
    }


    public void paint(Graphics graphics){
        graphics.setColor(Color.BLACK);
        graphics.fillOval(this.x, this.y, SIZE, SIZE);

    }










}
