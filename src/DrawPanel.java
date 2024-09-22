import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class DrawPanel extends JPanel implements ActionListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private final Timer timer;
    private int ticksFromStart;

    private final Car car;
    private final Sun sun;
    private final Clouds cloud1;
    private final Clouds cloud2;
    private final Clouds cloud3;
    private final Clouds cloud4;
    private final Clouds cloud5;
    private final Road road;
    private final TrafficLight trafficLight;

    public DrawPanel(int width, int height, int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.car = new Car(0, 400, 400, 200);
        ticksFromStart = this.car.getX();
        this.sun = new Sun(1050, 120, 100, 100);
        this.cloud1 = new Clouds(350, 220, 170, 50);
        this.cloud2 = new Clouds(100, 200, 200, 60);
        this.cloud3 = new Clouds(550, 210, 190, 65);
        this.cloud4 = new Clouds(750, 170, 180, 60);
        this.cloud5 = new Clouds(1100, 180, 200, 60);
        this.road = new Road(0, 550);
        this.trafficLight = new TrafficLight(578, 314, 40, 100);
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        road.draw(gr);
        car.setX((ticksFromStart));
        sun.draw(gr);
        cloud1.draw(gr);
        cloud2.draw(gr);
        cloud3.draw(gr);
        cloud4.draw(gr);
        cloud5.draw(gr);
        trafficLight.draw(gr);
        car.draw(gr);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ticksFromStart += 5;
        }
    }
}