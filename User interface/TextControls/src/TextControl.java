import javax.swing.*;
import java.awt.*;

public class TextControl {
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runWindow();
            }
        });
    }

    public static  void runWindow(){
        JFrame mainWindow = new JFrame("Main Window");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.2;

        JLabel label = new JLabel(" ");
        mainWindow.add(label,constraints);

        constraints.weightx = 0.5;
        //constraints.weighty =0.5;
        JTextField text = new JTextField("This is a Text Field",20);
        text.setBackground(Color.CYAN);
        text.setToolTipText("Tool Tip");
        mainWindow.add(text,constraints);

       /** constraints.weightx = 0.2;
        label = new JLabel(" ");
        mainWindow.add(label,constraints);**/

        constraints.weightx = 0.5;
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.BOTH;
        //constraints.weighty = 0.5;

        JTextArea textArea = new JTextArea("This is a text area.\nIt occupies multile lines.\nYou can write paragraphs using this");
        textArea.append("Add color to life");
        textArea.append("Study Hard, Party Hard");
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setBackground(Color.MAGENTA);
        textArea.setSelectedTextColor(Color.WHITE);
        textArea.setSelectionColor(Color.darkGray);
        textArea.setToolTipText("Tool Tip for Text Area");
        mainWindow.add(textArea,constraints);

        constraints.weightx = 0.2;
        //constraints.weighty = 0.2;
        constraints.gridy = 2;
        label = new JLabel(" ");
        mainWindow.add(label,constraints);

        constraints.gridy =3;
        constraints.gridx = 2;
        constraints.fill= GridBagConstraints.NONE;
        JButton button = new JButton("OK");
        button.setForeground(Color.blue);
        button.setBackground(Color.WHITE);
        button.setToolTipText("OK button");
        mainWindow.add(button,constraints);




        mainWindow.pack();
        mainWindow.setVisible(true);









    }
}
