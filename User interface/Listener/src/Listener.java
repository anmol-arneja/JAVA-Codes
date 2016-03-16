import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Admin on 2016-02-10.
 */
public class Listener implements ActionListener,MouseListener,ItemListener,KeyListener{

    private JTextArea output;

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Listener window = new Listener();
                window.runWindow();
            }
        });
    }

    public void keyTyped(KeyEvent e){
        output.setText(output.getText() + "KeyTyped Event\n");

    }

    public void keyPressed(KeyEvent e){
        output.setText(output.getText() + "keyPressedEvent\n");

    }

    public void keyReleased(KeyEvent e){
        output.setText(output.getText() + "keyReleasedEvent\n");
       // System.out.println(output.getText());

    }

    public void itemStateChanged(ItemEvent e){
        output.setText(output.getText() + "Item State Changed\n");

    }

    public void mouseClicked(MouseEvent e){
        output.setText(output.getText() + "mouseClickedEvent\n");
    }

    public void mousePressed(MouseEvent e){
        output.setText(output.getText() + "mousePressedEvent\n");
    }

    public void mouseReleased(MouseEvent e){
        output.setText(output.getText() + "mouseReleasedEvent\n");
    }

    public void mouseEntered(MouseEvent e){
        output.setText(output.getText() + "mouseEnteredEvent\n");
    }

    public void mouseExited(MouseEvent e){
        output.setText(output.getText() + "mouseExitedEvent\n");
    }

    public void actionPerformed(ActionEvent e){
        output.setText(output.getText() + "ActionPerformedEvent\n");
    }

    public void runWindow(){
        JFrame gridWindow = new JFrame("Using Listeners");
        gridWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gridWindow.setLayout(new GridBagLayout());
        Container pane = gridWindow.getContentPane();
        GridBagConstraints constraints = new GridBagConstraints();
        int yLineNum = 0;
        //empty line at top

        constraints.fill = GridBagConstraints.NONE;
        constraints.gridx = 0;
        constraints.gridy = yLineNum;
        JLabel label = new JLabel(" ");
        pane.add(label,constraints);

        //Empty first column
        yLineNum++;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.3;
        constraints.gridy = yLineNum;
        label = new JLabel();
        pane.add(label,constraints);

        constraints.gridx = 1;
        constraints.weightx = 1.0;
        JTextField firstName = new JTextField("Timardeep",15);
        //firstName.setEditable(true);
        firstName.addKeyListener(this);
        pane.add(firstName,constraints);

        //empty Last column
        constraints.weightx = 0.3;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 2;
        label = new JLabel(" ");
        pane.add(label,constraints);
        System.out.println(yLineNum);

        //empty row
        yLineNum++;
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = yLineNum;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        label = new JLabel();
        pane.add(label,constraints);

        String[] combodata = {"India","China","Canada","USA","Pakistan"};
        constraints.weighty = 0.5;
        constraints.weightx = 0.5;
        constraints.gridx = 1;
        constraints.gridy = yLineNum;
        JComboBox<String > comboBox = new JComboBox<>(combodata);
        comboBox.setEditable(true);
        comboBox.addActionListener(this);
        comboBox.addItemListener(this);
        pane.add(comboBox,constraints);

        //Empty Row

        yLineNum++;
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = yLineNum;
        constraints.ipady = 12;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        label = new JLabel(" ");
        pane.add(label,constraints);

        //Output

        yLineNum++;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridy = yLineNum;
        constraints.gridx = 1;
        constraints.ipady = 0;
        constraints.weightx = 0.4;
        constraints.weighty = 0.4;
        output = new JTextArea("Output\n",10,10);
        output.setBackground(Color.cyan);
        output.setLineWrap(true);
        output.setWrapStyleWord(true);
        output.addMouseListener(this);
        JScrollPane scrollPane = new JScrollPane(output);
        pane.add(scrollPane,constraints);


        yLineNum++;
        constraints.gridx = 1;
        constraints.gridy = yLineNum;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 0.2;
        constraints.weighty = 0.2;
        label = new JLabel(" ");
        pane.add(label,constraints);
        gridWindow.pack();
        gridWindow.setVisible(true);



    }




}
