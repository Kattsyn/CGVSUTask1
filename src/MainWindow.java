import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainWindow extends JFrame {
    private final DrawPanel panel;

    public MainWindow() throws HeadlessException {
        panel = new DrawPanel(this.getWidth(), this.getHeight(), 10);
        panel.setBackground(Color.CYAN);
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x=e.getX();
                int y=e.getY();
                System.out.println(x+","+y);//these co-ords are relative to the component
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        this.add(panel);
    }
}
