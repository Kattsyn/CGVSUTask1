import java.awt.*;

public class Road {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Road(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //road
        g.setColor(Color.GRAY);
        g.fillRect(this.x, this.y, 1700, 150);


//        g.setColor(Color.GRAY);
//        g.fillRect(0, 542, 1700, 100);

    }
}