import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtExample extends Frame {

    public AwtExample() {
        // create a button
        Button b = new Button("Click Me");
        b.setBounds(30, 100, 80, 30); // setting button position
        // add button to the frame
        add(b);
        setSize(300, 300); // frame size 300 width and 300 height
        setLayout(null); // no layout manager
        setVisible(true); // now frame will be visible
        // close the frame when close button is clicked
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String args[]) {
        new AwtExample(); // creating instance
    }
}
