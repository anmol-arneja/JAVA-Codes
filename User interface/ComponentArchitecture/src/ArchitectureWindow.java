import javax.swing.*;
import java.awt.*;

/**
 * Created by Admin on 2016-02-07.
 */
public class ArchitectureWindow {
    private final JFrame mainWindow = new JFrame("Architecture Window");
    JTextField firstName;

    public ArchitectureWindow(){
        initializeWindow();
    }

    public void initializeWindow(){
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLayout(new GridBagLayout());
        ArchitectureMouseListener listener = new ArchitectureMouseListener();
        mainWindow.addMouseListener(listener);

        GridBagConstraints constraints = new GridBagConstraints();
        JLabel label = new JLabel("First Name");
        mainWindow.add(label,constraints);
        label.addMouseListener(listener);


        firstName = new JTextField(15);
        mainWindow.add(firstName,constraints);
        firstName.addMouseListener(listener);

        constraints.gridy = 1;
        JButton button = new JButton("OK");
        button.addActionListener(new ArchitectureButtonListener(this));
        mainWindow.add(button,constraints);




        mainWindow.pack();
        mainWindow.setVisible(true);

    }

    void processButtonClick(){
        firstName.setText("Timardeep");
    }
}
