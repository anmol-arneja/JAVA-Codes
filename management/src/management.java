

import javax.management.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.management.ManagementFactory;


public class management implements ActionListener, managementMBean ,Runnable {

    private long startTime = System.currentTimeMillis();
    private JTextField textField;
    private JTextArea textArea;

    public static void main(String[] args){
        try{
            MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
            ObjectName demoName = new ObjectName("management:type=Demo");
            management managementMBean = new management();
            mbs.registerMBean(managementMBean,demoName);
            javax.swing.SwingUtilities.invokeLater(managementMBean);
        }
        catch (MalformedObjectNameException e){
            e.printStackTrace();
        }
        catch (InstanceAlreadyExistsException e){
            e.printStackTrace();
        }
        catch (MBeanRegistrationException e){
            e.printStackTrace();
        }
        catch (NotCompliantMBeanException e){
            e.printStackTrace();
        }

    }

    public void run(){
        runWindow();
    }

    public void resetTimer(){
        startTime = System.currentTimeMillis();


    }

    public void clearScreen(){
        textArea.setText("");
        textField.setText("");
    }

    public String getTextAreaData(){
        return textArea.getText();
    }

    public void actionPerformed(ActionEvent e){
        long currentTime = System.currentTimeMillis();
        long timeDiff = currentTime - startTime;
        textField.setText(Long.toString(timeDiff));
        textArea.setText(textArea.getText() + "Preet");

    }



    private void runWindow(){
        JFrame mainWindow = new JFrame("Main Window");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.2;

        JLabel label = new JLabel();
        mainWindow.add(label,constraints);
        constraints.weightx = 0.5;

        textField = new JTextField("This is a text field ",20);
        textField.setBackground(Color.YELLOW);
        textField.setToolTipText("Text Field");
        mainWindow.add(textField,constraints);

        constraints.weightx = 0.2;
        label = new JLabel(" ");
        mainWindow.add(label,constraints);

        constraints.weightx = 0.5;
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 0.5;
        textArea = new JTextArea("This is a text Area.\nCreated by : Timardeep Arneja",10,15);

        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setBackground(Color.cyan);
        textArea.setSelectedTextColor(Color.WHITE);
        textArea.setToolTipText("Text Area");
        mainWindow.add(textArea,constraints);

        constraints.gridy = 3;
        constraints.gridx = 2;
        constraints.fill = GridBagConstraints.NONE;
        JButton button = new JButton("OK");
        button.addActionListener(this);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.WHITE);
        button.setToolTipText("OK Button");
        mainWindow.add(button,constraints);


        mainWindow.pack();
        mainWindow.setVisible(true);





    }



}
