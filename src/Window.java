import javax.swing.*;

public class Window extends JFrame {
    Window(String title, int Width, int Height) {
        JFrame frame = new JFrame(title);
        frame.setSize(Width, Height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}