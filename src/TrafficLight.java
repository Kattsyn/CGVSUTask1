import java.awt.*;

public class TrafficLight {

    private int x;
    private int y;
    private int width;
    private int height;

    public TrafficLight(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        //Нога
        g.setColor(Color.GRAY);
        g.setStroke(new BasicStroke(8));
        g.drawLine(this.x + this.width/2, this.y + this.height, this.x + this.width/2, this.y + this.height*3);
        //Прямоугольник
        g.setColor(Color.BLACK);
        g.drawRect(this.x, this.y, this.width, this.height);
        g.setColor(Color.GRAY);
        g.fillRect(this.x, this.y, this.width, this.height);
        //Огни
        g.setColor(Color.RED);
        g.fillOval(this.x, this.y, width, height/3);
        g.setColor(Color.GRAY);
        g.setColor(Color.YELLOW.darker().darker().darker());
        g.fillOval(this.x, this.y + height/3, width, height/3);
        g.setColor(Color.GREEN.darker().darker().darker());
        g.fillOval(this.x, this.y + height*2/3, width, height/3);
    }
}