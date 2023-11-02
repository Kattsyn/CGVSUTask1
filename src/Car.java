import java.awt.*;

public class Car {

    private int x;
    private int y;
    private int width;
    private int height;
    private Wheel wheel1;
    private Wheel wheel2;

    public Car(final int x, final int y, final int width, final int height) {
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

        //Кузов
        g.setColor(Color.WHITE);
        g.fillRect(this.x, this.y, this.width/3, this.height/2);
        g.setColor(Color.BLUE);
        g.fillRect(this.x, this.y+height/2, this.width, this.height/2);
        g.fillRect(this.x + this.width/3, this.y, this.width/3, this.height/2);
        g.setColor(Color.CYAN);
        g.fillRect(this.x + this.width/3 + this.width/20, this.y + this.height/20, this.width/4, this.height/3);
        //обводка деталей
        g.setStroke(new BasicStroke(3));
        g.setColor(Color.BLACK);
        g.drawRect(this.x, this.y, this.width/3, this.height/2);
        g.drawRect(this.x, this.y+height/2, this.width, this.height/2);
        g.drawRect(this.x + this.width/3, this.y, this.width/3, this.height/2);
        g.drawLine(this.x+ this.width*4/10, this.y + this.height*55/100, this.x+ this.width*45/100, this.y + this.height*55/100);
        wheel1 = new Wheel(this.x + width/10, this.y + this.height*8/10, this.width/10, this.width/10);
        wheel1.draw(g);
        wheel2 = new Wheel(this.x + width*7/10, this.y + this.height*8/10, this.width/10, this.width/10);
        wheel2.draw(g);
    }

    public static class Wheel {
        private int x;
        private int y;
        private int width;
        private int height;

        public Wheel(final int x, final int y, final int width, final int height) {
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
            //Толщина спиц диска
            g.setStroke(new BasicStroke((float) width / 5));
            //Спицы
            g.setColor(Color.WHITE);
            g.drawLine(this.x + this.width * 3 / 10, this.y + this.height * 3 / 10, this.x + this.width * 17 / 10, this.y + this.height * 17 / 10);
            g.drawLine(this.x + this.width, this.y, this.x + this.width, this.y + this.height * 2);
            g.drawLine(this.x + this.width * 17 / 10, this.y + this.height * 3 / 10, this.x + this.width * 3 / 10, this.y + this.height * 17 / 10);
            g.drawLine(this.x, this.y + this.height, this.x + this.width * 2, this.y + this.height);
            //Резина
            g.setColor(Color.BLACK);
            g.setStroke(new BasicStroke((float) width / 3));
            g.drawOval(this.x, this.y, this.width * 2, this.height * 2);
            //Обводка спиц
            g.setColor(Color.WHITE);
            g.setStroke(new BasicStroke((float) width / 8));
            g.drawOval(this.x + width / 8, this.y + height / 8, this.width * 2 - width * 25 / 100, this.height * 2 - height * 25 / 100);
            g.setStroke(new BasicStroke(3));
            g.setColor(Color.GRAY);
            g.drawOval(this.x + this.width * 75 / 100, this.y + this.height * 75 / 100, this.width / 2, this.height / 2);
            g.setColor(Color.GRAY.brighter());
            g.fillOval(this.x + this.width * 75 / 100, this.y + this.height * 75 / 100, this.width / 2, this.height / 2);

            //Болты
            g.setStroke(new BasicStroke((float) this.width / 100));
            g.setColor(Color.GRAY);
            g.fillOval(this.x + this.width * 8 / 10, this.y + this.height * 8 / 10, this.width / 6, this.height / 6);
            g.fillOval(this.x + this.width * 103 / 100, this.y + this.height * 8 / 10, this.width / 6, this.height / 6);
            g.fillOval(this.x + this.width * 8 / 10, this.y + this.height * 103 / 100, this.width / 6, this.height / 6);
            g.fillOval(this.x + this.width * 103 / 100, this.y + this.height * 103 / 100, this.width / 6, this.height / 6);
            g.setColor(Color.BLACK);
            g.drawOval(this.x + this.width * 8 / 10, this.y + this.height * 8 / 10, this.width / 6, this.height / 6);
            g.drawOval(this.x + this.width * 103 / 100, this.y + this.height * 8 / 10, this.width / 6, this.height / 6);
            g.drawOval(this.x + this.width * 8 / 10, this.y + this.height * 103 / 100, this.width / 6, this.height / 6);
            g.drawOval(this.x + this.width * 103 / 100, this.y + this.height * 103 / 100, this.width / 6, this.height / 6);

        }
    }
}