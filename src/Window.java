import javax.swing.*;

public class Window extends JFrame {
    Window(String title, int Width, int Height, boolean Have_Label, String Label_text, boolean Have_Button, String Button_Text) {
        JFrame frame = new JFrame(title);
        JLabel label = new JLabel();
        JButton button = new JButton();

        // TODO: Add more functions here for the label(the text box)
        // Label for text
        label.setVisible(Have_Label);
        label.setText(Label_text);
        frame.add(label);

        // TODO: Add more functions here for the button
        // Button for clicking
        button.setEnabled(Have_Button);
        button.setVisible(Have_Button);
        button.setText(Button_Text);
        frame.add(button);

        frame.setSize(Width, Height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}