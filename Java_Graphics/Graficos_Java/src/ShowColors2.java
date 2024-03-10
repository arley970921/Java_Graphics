import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowColors2 extends JFrame {
    private JButton ChangeColorButton;
    private Color color = Color.LIGHT_GRAY;
    private Container container;
    public ShowColors2(){
        super("Usando JCOLORChooser");
        container = getContentPane();
        container.setLayout(new FlowLayout());

        JButton changeColorButton = new JButton("Cambiar Color");
        changeColorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                color = JColorChooser.showDialog(ShowColors2.this,"Elige un color", color);
                if(color == null){
                    color = Color.LIGHT_GRAY;
                }
            }
        });
        container.add(changeColorButton);
        setSize(400,130);
        setVisible(true);
    }
    public static void main(String args[]){
        ShowColors2 application = new ShowColors2();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}