
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Cheesboard extends JPanel {
    private static final int size = 8; 
    private static final int square_size = 60; 

    public Cheesboard() {
        setPreferredSize(new Dimension(size * square_size, size * square_size));
    }
    protected void paintComponent(Graphics g) {
        drawCheesboard(g);
    }
    private void drawCheesboard(Graphics g) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(col * square_size, row * square_size, square_size, square_size);
            }
        }
    }
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess Board");
        Cheesboard cheesboard = new Cheesboard();
        frame.add(cheesboard);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }
}
