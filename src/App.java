import javax.swing.*;
import java.util.Objects;


public class App {
    public static void main(String[] args) {
        ImageIcon logo = new ImageIcon(Objects.requireNonNull(App.class.getResource("assets/smile.png")));
        JLabel label = new JLabel();
        label.setText("Hello and welcome to frame app");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JFrame frame = new JFrame();
        frame.setTitle("Window Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        label.setLocation((label.getWidth()+label.getWidth())/3, 50);
        frame.add(label);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setIconImage(logo.getImage());

    }

}
