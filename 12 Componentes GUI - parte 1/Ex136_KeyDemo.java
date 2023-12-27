
// Figura 12.37: KeyDemo.java
// Testando KeyDemoFrame.
import javax.swing.JFrame;

public class Ex136_KeyDemo {
    public static void main(String[] args) {
        Ex135_KeyDemoFrame keyDemoFrame = new Ex135_KeyDemoFrame();
        keyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyDemoFrame.setSize(350, 100);
        keyDemoFrame.setVisible(true);
    }
} // fim da classe KeyDemo