import java.awt.*;

public class Contenedor extends Canvas{

     /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int posx,posy;
    private int weight,height;
    private String texto="Boton";
    private String texto2="I'm Cube";
    private boolean presionado;
    public Contenedor(){
        this.setBackground(Color.purple);
        posx=350;
        posy=60;
        weight=50;
        height=50;

    }

    public void paint(Graphics graficos){
        graficos.setColor(Color.RED);
        graficos.fillRect(10,10,750 , 450);
        graficos.setColor(Color.GREEN);
        graficos.fillOval(50,400,weight, height);
        graficos.setColor(Color.WHITE);
        graficos.drawString(texto,50,400);
        graficos.setColor(Color.WHITE);
        graficos.fillRect(350, 20, 400, 400);
        if (posx>=350||posx>=670 && posy>=20||posy>=400) {
            setTexto1("Imposible salirse del componente temporal");
            repaint();
            graficos.setColor(Color.BLUE);
            graficos.fillRect(posx, posy, weight, height);
            graficos.setColor(Color.BLACK);
            graficos.fillOval(posx+10, posy+5,weight-30, height-30);
            graficos.fillOval(posx+30, posy+5,weight-30, height-30);
            graficos.drawString(texto2,posx,posy);
        }else{
            int x=355;
            int y= 25;
            graficos.setColor(Color.BLUE);
            graficos.fillRect(x, y, weight, height);
            graficos.setColor(Color.BLACK);
            graficos.fillOval(x+10, y+5,weight-30, height-30);
            graficos.fillOval(x+30, y+5,weight-30, height-30);
            graficos.drawString(texto2,x,y);
        }
    }
    public void setTexto1(String txt){
        this.texto=txt;
    }
    public void setTexto2(String txt){
        this.texto2=txt;
    }
    public void setPresionado(){
        this.presionado=!presionado;
    }
    public boolean getPresionado(){
        return presionado;
    }
    public void setPosX(int x){
        this.posx=x;
    }
    public int getPosx(){
        return posx;
    }
    public void setPosY(int y){
        this.posy=y;
    }
    public int getPosy(){
        return posy;
    }
    public void setWeight(int w){
        this.weight=w;
    }
    public int getWeight(){
        return weight;
    }
    public void setHeight(int h){
        this.height=h;
    }
    public int getHeight(){
        return height;
    }
}