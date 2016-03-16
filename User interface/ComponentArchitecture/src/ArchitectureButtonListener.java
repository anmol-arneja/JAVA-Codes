import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArchitectureButtonListener implements ActionListener {

    private ArchitectureWindow window;

    public ArchitectureButtonListener( ArchitectureWindow theWindow){

            window = theWindow;
    }

    public void actionPerformed(ActionEvent e){
        window.processButtonClick();
    }
}
