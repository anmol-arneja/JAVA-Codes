import javax.swing.*;
import java.awt.*;

public class LayoutManager {
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runWindows();
            }
        });
    }
    public static void runWindows(){
        buildComplexWindow();
        buildFlowWindow();
        buildGridWindow();
        buildBorderWindow();
    }
    public static void buildGridWindow(){
        JFrame gridWindow = new JFrame("Grid Layout");
        gridWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gridWindow.setLayout(new GridLayout(5,2));

        JButton button;

        for(int i=0; i<10;i++){
            button = new JButton("Button " + i);
            gridWindow.add(button);
        }
        gridWindow.pack();
        gridWindow.setVisible(true);
    }

    public static void buildBorderWindow(){
        JFrame buildBorderWindow = new JFrame("Build Border Window");
        buildBorderWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        buildBorderWindow.setLayout(new BorderLayout());
        JButton button;

        button = new JButton("Center");
        buildBorderWindow.add(button,BorderLayout.CENTER);
        button = new JButton("Left");
        buildBorderWindow.add(button,BorderLayout.EAST);
        button = new JButton("Right");
        buildBorderWindow.add(button,BorderLayout.WEST);
        button = new JButton("Top");
        buildBorderWindow.add(button,BorderLayout.NORTH);
        button = new JButton("Bottom");
        buildBorderWindow.add(button,BorderLayout.SOUTH);

        buildBorderWindow.pack();
        buildBorderWindow.setVisible(true);

    }

    public static void buildFlowWindow(){
        JFrame flowWindow = new JFrame("Flow Window");
        flowWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        flowWindow.setLayout(new FlowLayout());
        JButton button;

        for(int i =0; i<10;i++){
            button=new JButton("Button " + i);
            flowWindow.add(button);
        }
        flowWindow.pack();
        flowWindow.setVisible(true);
    }

    public static void buildComplexWindow(){
        JFrame complexWindow = new JFrame("Complex Window");
        complexWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        complexWindow.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,3));

        JButton button;

        button = new JButton("Center");
        for (int i =0; i<12;i++ ){
            button = new JButton(Integer.toString(i));
            panel.add(button);
        }

        complexWindow.add(panel,BorderLayout.CENTER);
        button = new JButton("Top");
        complexWindow.add(button,BorderLayout.NORTH);
        button = new JButton("Bottom");
        complexWindow.add(button,BorderLayout.SOUTH);
        button = new JButton("Left");
        complexWindow.add(button,BorderLayout.EAST);
        button = new JButton("Right");
        complexWindow.add(button,BorderLayout.WEST);

        complexWindow.pack();
        complexWindow.setVisible(true);
    }

}
