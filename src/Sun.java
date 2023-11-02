import java.awt.*;

public class Sun {

    private int x;
    private int y;
    private int width;
    private int height;

    public Sun(final int x, final int y, final int width, final int height) {
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