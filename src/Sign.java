import java.awt.*;

public class Sign {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Sign(final int x, final int y) {
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
//        1143,321
        //sign
        g.setColor(Color.darkGray);
        g.setStroke(new BasicStroke(5));
        g.drawLine(this.x + 19, this.y + 218, this.x + 19, this.y + 62);
        g.setStroke(new BasicStroke(7));
        g.setColor(Color.RED);
        g.drawOval(this.x - 11, this.y - 1, 60, 60);
        g.setColor(Color.WHITE);
        g.fillOval(this.x - 11, this.y - 1, 60, 60);

        g.setColor(Color.RED);
        Font font = new Font("Segoe UI Semibold", Font.PLAIN, 20);
        g.setFont(font);
        g.drawString("STOP", this.x - 4, this.y + 36);

//        g.setColor(Color.darkGray);
//        g.setStroke(new BasicStroke(5));
//        g.drawLine(1162, 539, 1162, 383);
//        g.setStroke(new BasicStroke(7));
//        g.setColor(Color.RED);
//        g.drawOval(1132, 320, 60, 60);
//        g.setColor(Color.WHITE);
//        g.fillOval(1132, 320, 60, 60);
//
//        g.setColor(Color.RED);
//        Font font = new Font("Segoe UI Semibold", Font.PLAIN, 20);
//        g.setFont(font);
//        g.drawString("STOP", 1139, 357);

    }
}