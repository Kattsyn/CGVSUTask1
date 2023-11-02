import java.awt.*;

public class Clouds {

    private int x;
    private int y;
    private int width;
    private int height;

    public Clouds(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(Color.WHITE);
        g.fillRoundRect(this.x, this.y, width, height, width / 2, height);


        g.fillOval(this.x + this.width / 12, this.y - this.height / 3, width / 3, width / 3);
        g.fillOval(this.x + this.width / 4, this.y - this.height / 2, width * 4 / 10, width * 4 / 10);
        g.fillOval(this.x + this.width * 5 / 11, this.y - this.height / 4, width / 2, width / 3);
        g.fillOval(this.x + this.width * 5 / 10, this.y - this.height / 3, width / 4, width / 4);


    }
}