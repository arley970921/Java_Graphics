import javax.swing.*;
import java.awt.*;

public class DrawPolygons extends JFrame{
    public DrawPolygons(){
        super("Drawing Polygons");
        setSize(275,230);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        int xValores[] = {20,40,50,30,20,15};
        int yValores[] = {50,50,60,80,80,60};
        Polygon polygon1 = new Polygon(xValores, yValores, 6);
        g.drawPolygon(polygon1);

        int xValores2[] = {70,90,100,80,70,65,60};
        int yValores2[] = {100,100,110,110,130,110,90};
        g.drawPolyline(xValores2,yValores2,7);

        int xValores3[] = {120,140,150,190};
        int yValores3[] = {40,70,80,60,};
        g.fillPolygon(xValores3,yValores3,4);

        Polygon polygon2 = new Polygon();
        polygon2.addPoint(165,135);
        polygon2.addPoint(175,150);
        polygon2.addPoint(270,200);
        polygon2.addPoint(200,220);
        polygon2.addPoint(130,180);
        g.fillPolygon(polygon2);
    }
    public static void main(String args[]){
        DrawPolygons application = new DrawPolygons();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}