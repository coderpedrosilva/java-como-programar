
// Figura 12.29: MouseTrackerFrame.java
// Testando MouseTrackerFrame.
import javax.swing.JFrame;

public class Ex130_MouseTracker {
    public static void main(String[] args) {
        Ex129_MouseTrackerFrame mouseTrackerFrame = new Ex129_MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(300, 100);
        mouseTrackerFrame.setVisible(true);
    }
} // fim da classe MouseTracker
