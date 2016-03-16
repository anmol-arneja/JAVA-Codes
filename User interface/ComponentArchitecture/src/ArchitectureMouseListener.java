import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ArchitectureMouseListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {

        Object o = e.getSource();
        Container source = (Container) o;
        if(source instanceof JFrame){
            source = ((JFrame) source).getContentPane();
        }

        source.setBackground(Color.WHITE);

    }

    public void mousePressed(MouseEvent e){
        /**Object o = e.getSource();
        Container source = (Container) o;
        if(source instanceof JFrame){
            source = ((JFrame) source).getContentPane();
        }

        source.setBackground(Color.RED); **/


    }

    public void mouseReleased(MouseEvent e){

    }

    public void mouseEntered(MouseEvent e){
        Object o = e.getSource();
        Container source = (Container) o;
        if (source instanceof JFrame){
            source = ((JFrame)source).getContentPane();

        }

        source.setBackground(Color.GRAY);

    }

    public void mouseExited(MouseEvent e){
        Object o = e.getSource();
        Container source = (Container) o;
        if (source instanceof JFrame){
            source = ((JFrame)source).getContentPane();

        }
        source.setBackground(Color.YELLOW);

    }
}
