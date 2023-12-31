
// Figura 12.42: BorderLayoutDemo.java
// Testando BorderLayoutFrame.
import javax.swing.JFrame;

public class Ex140_BorderLayoutDemo {
    public static void main(String[] args) {
        Ex139_BorderLayoutFrame borderLayoutFrame = new Ex139_BorderLayoutFrame();
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setSize(300, 200);
        borderLayoutFrame.setVisible(true);
    }
} // fim da classe BorderLayoutDemo