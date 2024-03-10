import javax.swing.*;
import java.awt.*;

public class Fonts extends JFrame {
    public Fonts(){
        super("Usando Fuentes");
        setSize(420,125);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setFont(new Font("Times", Font.BOLD, 12));
        g.drawString("Fuente Serif 12 bold", 20,50);

        g.setFont(new Font("Courier", Font.ITALIC, 24));
        g.drawString("Fuente Courier 24 puntos Italic", 20, 70);

        g.setFont(new Font("Helvetica", Font.PLAIN, 14));
        g.drawString("Fuente Helvetica 14 puntos plain", 20, 90);

        g.setColor(Color.BLUE);
        g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
        g.drawString(g.getFont().getName() + " " + g.getFont().getSize() + " point bold italic.",20,110);

    }
    public static void main(String args[]){
        Fonts application = new Fonts();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
