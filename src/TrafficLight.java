import java.awt.*;

public class TrafficLight {
    private int x;
    private int y;
    public static final int WIDTH = 100;
    public static final int HEIGHT = WIDTH * 3;
    public static final int MARGIN = 4; //שוליים


    public TrafficLight(int x, int y){
        this.x = x;
        this.y = y;
    }


    public void paint(Graphics graphics){
        graphics.setColor(Color.BLACK);
        graphics.fillRect(this.x, this.y,WIDTH,HEIGHT);
        graphics.setColor(Color.RED);
        graphics.fillOval(
                this.x + MARGIN,
                this.y + MARGIN,
                WIDTH - MARGIN * 2,
                HEIGHT / 3 - MARGIN * 2
        );
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(
                this.x + MARGIN,
                this.y + HEIGHT / 3 + MARGIN,
                WIDTH - MARGIN * 2,
                HEIGHT / 3 - MARGIN * 2
        );
        graphics.setColor(Color.GREEN);
        graphics.fillOval(
                this.x + MARGIN,
                this.y + HEIGHT * 2 / 3 + MARGIN,
                WIDTH - MARGIN * 2,
                HEIGHT / 3 - MARGIN * 2
        );




    }






}
