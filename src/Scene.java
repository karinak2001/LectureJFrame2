import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Scene extends JPanel {
    private ArrayList<TrafficLight> trafficLights;
    private Character character;


    public Scene(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.trafficLights = new ArrayList<>();
        this.trafficLights.add(new TrafficLight(20,20));
        this.trafficLights.add(new TrafficLight(220,20));
        this.trafficLights.add(new TrafficLight(350,20));
        this.character = new Character(0, 500);
        this.setFocusable(true);
        this.requestFocus();
        this.addKeyListener(new MovementListener(this.character, this));
    }


    public void paintComponent (Graphics graphics){ //דורסים את המתודה
        super.paintComponent(graphics);
       for (TrafficLight trafficLight1 : trafficLights) {
           trafficLight1.paint(graphics);
       }
       this.character.paint(graphics);  // מצייר לנו את הדמות
    }




}
