 // Figura 5.27: Shapes.java
 // Desenhando uma cascata de formas com base na escolha do usuário.
 import java.awt.Graphics;
 import javax.swing.JPanel;

 public class Ex33_Shapes extends JPanel
 {
    private int choice; // escolha do usuário de qual forma desenhar

    // construtor configura a escolha do usuário
    public Ex33_Shapes(int userChoice)
        {
        choice = userChoice;
        }

    // desenha uma cascata de formas que iniciam do canto superior esquerdo
    public void paintComponent(Graphics g)
    {
    super.paintComponent(g);

    for (int i = 0; i < 10; i++)
        {
        // seleciona a forma com base na escolha do usuário
        switch (choice)
            {
            case 1: // desenha retângulos
                g.drawRect(10 + i * 10, 10 + i * 10,
                50 + i * 10, 50 + i * 10); 
                break;
            case 2: // desenha ovais
                g.drawOval(10 + i * 10, 10 + i * 10,
                50 + i * 10, 50 + i * 10); 
                break;
            }
        }
    }
 } // fim da classe Shapes