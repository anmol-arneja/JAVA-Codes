import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Admin on 2016-02-29.
 */
public class StringChangedListener implements KeyListener{

    public void keyTyped(KeyEvent e){
        if(e.getKeyChar() == '\n'){
            pw.dataHasChanged();

        }
    }

    public void keyPressed(KeyEvent e){

    }

    public void keyReleased(KeyEvent e){

    }

    private PersonWindow pw;
    public StringChangedListener(PersonWindow window){
        pw = window;
    }



}
