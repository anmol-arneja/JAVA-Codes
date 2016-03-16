import javax.swing.*;
import java.awt.*;

public class GridBaglayout {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runWindow();
            }
        });

    }

    private static void runWindow() {
        JFrame gridWindow = new JFrame("Grid Layout");
        gridWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gridWindow.setLayout(new GridBagLayout());
        buildComponents(gridWindow.getContentPane());

        gridWindow.pack();
        gridWindow.setVisible(true);


    }

    private static void buildComponents(Container pane) {

        GridBagConstraints emptyLineConstraints = new GridBagConstraints();
        GridBagConstraints basicLineConstraints = new GridBagConstraints();

        emptyLineConstraints.fill = GridBagConstraints.BOTH;
        emptyLineConstraints.anchor = GridBagConstraints.LINE_START;
        emptyLineConstraints.gridheight = 1;
        emptyLineConstraints.gridwidth = GridBagConstraints.RELATIVE;
        emptyLineConstraints.weightx = 1.0;
        emptyLineConstraints.weighty = 1.0;
        emptyLineConstraints.gridx = GridBagConstraints.RELATIVE;
        emptyLineConstraints.gridy = GridBagConstraints.RELATIVE;

        JLabel label = new JLabel(" ");
        emptyLineConstraints.gridx = 0;
        emptyLineConstraints.fill = GridBagConstraints.HORIZONTAL;
        emptyLineConstraints.weighty = 0.0;
        pane.add(label, emptyLineConstraints);

        basicLineConstraints.fill = GridBagConstraints.NONE;
        basicLineConstraints.anchor = GridBagConstraints.LINE_START;
        basicLineConstraints.gridheight = 1;
        basicLineConstraints.gridwidth = GridBagConstraints.RELATIVE;
        basicLineConstraints.weightx = 0.0;
        basicLineConstraints.weighty = 0.0;
        basicLineConstraints.gridx = 2;
        basicLineConstraints.gridy = 2;
        basicLineConstraints.ipadx = 0;
        basicLineConstraints.ipady = 0;
        basicLineConstraints.insets = new Insets(0, 0, 0, 0);

        label = new JLabel(" ");
        basicLineConstraints.gridx = 1;
        basicLineConstraints.gridwidth = 2;
        basicLineConstraints.weightx = 0.0;
        pane.add(label, basicLineConstraints);

        label = new JLabel("First Name");
        basicLineConstraints.gridx = 2;
        basicLineConstraints.weightx = 0.0;
        pane.add(label, basicLineConstraints);

        label = new JLabel(" ");
        basicLineConstraints.gridx = 3;
        basicLineConstraints.weightx = 0.0;
        pane.add(label, basicLineConstraints);

        JTextField firstName = new JTextField(15);
        basicLineConstraints.gridx = 4;
        basicLineConstraints.weighty = 0.0;
        basicLineConstraints.fill = GridBagConstraints.HORIZONTAL;
        pane.add(firstName, basicLineConstraints);

        label = new JLabel(" ");
        emptyLineConstraints.gridx = 5;
        emptyLineConstraints.weightx = 0.0;
        pane.add(label, basicLineConstraints);

        label = new JLabel(" ");
        emptyLineConstraints.weighty = 0.0;
        emptyLineConstraints.gridy = 3;
        pane.add(label, emptyLineConstraints);

        label = new JLabel(" ");
        basicLineConstraints.fill = GridBagConstraints.NONE;
        basicLineConstraints.gridx = 1;
        basicLineConstraints.gridy = 4;
        basicLineConstraints.weightx = 0.0;
        pane.add(label, basicLineConstraints);

        label = new JLabel("Last Name");
        basicLineConstraints.gridx = 2;
        pane.add(label, basicLineConstraints);

        JTextField lastName = new JTextField(15);
        basicLineConstraints.gridx = 4;
        basicLineConstraints.weightx = 1.0;
        basicLineConstraints.fill = GridBagConstraints.NONE;
        pane.add(lastName, basicLineConstraints);

        label = new JLabel(" ");
        basicLineConstraints.gridx = 5;
        basicLineConstraints.weightx = 0.5;
        pane.add(label, basicLineConstraints);

        label = new JLabel(" ");
        emptyLineConstraints.weighty = 1.0;
        emptyLineConstraints.gridy = 5;
        pane.add(label, emptyLineConstraints);
    }
}
