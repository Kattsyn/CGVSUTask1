import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1400, 700);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
