import java.awt.*;

public class Sun {

    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Sun(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        //Окружность
        g.setColor(Color.ORANGE);
        g.fillOval(this.x, this.y, width, height);
        //Толщина лучей
        g.setStroke(new BasicStroke(5));
        //Лучи
        g.drawLine(this.x + width / 2, this.y - height / 2, this.x + width / 2, this.y + height * 3 / 2);
        g.drawLine(this.x - width / 2, this.y + height / 2, this.x + width * 3 / 2, this.y + height / 2);
        g.drawLine(this.x - width / 3, this.y - height / 3, this.x + width * 4 / 3, this.y + height * 4 / 3);
        g.drawLine(this.x + width * 4 / 3, this.y - height / 3, this.x - width / 3, this.y + height * 4 / 3);

    }
}