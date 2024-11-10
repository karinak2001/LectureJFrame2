import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovementListener implements KeyListener {
    private Character character;
    private Scene scene;


    public MovementListener(Character character, Scene scene) {
        this.character = character;
        this.scene = scene;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            this.character.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.character.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.character.moveRight();
        }
        this.character.moveRight();
        this.scene.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
}
