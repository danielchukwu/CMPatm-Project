import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPractice {

    static void cmpAtm () {
        // setup frame, frame size, frame layout and frame exit program when done
        JFrame frame = new JFrame("GTB ATM");
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(2, 2));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // components
        JLabel label_pin = new JLabel("Account Pin: ");     // label
        JTextField pin = new JTextField();                       // text field
        JButton submitButton = new JButton("Submit");       // submit button

        // add components to frame
        frame.add(label_pin);
        frame.add(pin);
        frame.add(submitButton);

        // set frame to visible -> (it is invisible by default)
        frame.setVisible(true);

        // set action listener on submitButton
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                String pin_value = pin.getText();            // get text from pin (a text field for user input)

                if (pin_value.equals("0000")){
                    System.out.println("Valid pin");
                    frame.setVisible(false);
                } else {
                    System.out.println("Invalid pin");
                }
            }
        });
    }

    // main function: without this function we can't run any program. it is the door to running java programs
    public static void main(String [] args) {
        cmpAtm(); // call our cmpAtm function
    }
}
