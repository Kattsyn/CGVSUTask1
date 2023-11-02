import java.awt.*;

public class Road {

    private final int x;
    private final int y;

    public Road(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        //Дорога
        g.setColor(Color.GRAY);
        g.fillRect(this.x, this.y, 1700, 150);
    }
}