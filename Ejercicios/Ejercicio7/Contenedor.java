import java.awt.*;

public class Contenedor extends Canvas {
    
     /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int x, y;
    private int w, h;
    private int xr,yr;
    private boolean isClicked;

    public Contenedor() {
        x = 30;
        y = 30;
        xr=(int)(Math.random()*100);
        yr=(int)(Math.random()*100);
        isClicked = false;
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(x, y, 100,100);
        g.setColor(Color.green);
        g.fillOval(x+70, y, 90,90);
        g.setColor(Color.black);
        g.fillOval(x + 20, y + 30,30,30);
        g.setColor(Color.black);
        g.fillOval(x + 50, y+30,30,30);
        g.setColor(Color.red);
        g.fillOval(xr + 10, yr + 10,50,50);
    }
    public void setXr(int xr){
        this.xr=xr;
    }

    public void setYr(int yr){
        this.yr=yr;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public boolean isClicked() {
        return isClicked;
    }

    public void setClicked() {
        this.isClicked = !this.isClicked;
    }
}
