import javax.swing.*;
import java.awt.event.*;

class JSwingFrame extends JFrame {

        public JSwingFrame() {
                setTitle("Sample Swing Frame");
                setLocation(20,20);
                setSize(400,400);
                
                //listener for window exit
                addWindowListener(new WindowAdapter() {
                        public void windowClosing(WindowEvent e) {
                                dispose();
                                System.exit(0);
                        }
                } );
        }

        public static void main(String[] args) {
                JFrame fr = new JSwingFrame();
                fr.show();
        }
}

