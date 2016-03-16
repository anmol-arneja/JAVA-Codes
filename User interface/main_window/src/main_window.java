/**
 * Created by Admin on 2016-02-06.
 */
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;


public class main_window{
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                runWindow();
            }
        });
    }

    public static void runWindow(){
        JFrame mainWindow = new JFrame("This is a main Window");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton();
        button.setText("This is a button");
        button.setBackground(Color.blue);
        button.setForeground(Color.white);
        button.setToolTipText("ToolTip");
        button.setOpaque(true);

        mainWindow.add(button);
        mainWindow.pack();
        mainWindow.setVisible(true);
    }
}


