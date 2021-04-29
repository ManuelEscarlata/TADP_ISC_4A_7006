import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;

public class Juego extends JFrame implements MouseListener, MouseMotionListener, KeyListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    Contenedor pintado=new Contenedor();

    public Juego(){
        initComponents();
    }

    public void initComponents(){
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        pintado=new Contenedor();
        pintado.addMouseListener(this);
        pintado.addMouseMotionListener(this);
        pintado.addKeyListener(this);
        this.add(pintado);
        this.setSize(800, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Juego juego1=new Juego();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if (!pintado.getPresionado()){
            switch(e.getKeyChar()) {
                case 'd':
                case 'D':
                    pintado.setTexto1("Pressed d");
                    pintado.setPosX(pintado.getX() + 10);

                    break;
                case 'a':
                case 'A':
                    pintado.setTexto1("Pressed a");
                    pintado.setPosX(pintado.getX() - 10);
                    break;
                case 'w':
                case 'W':
                    pintado.setTexto1("Pressed w");
                    pintado.setPosX(pintado.getY() - 10);

                    break;
                case 's':
                case 'S':
                    pintado.setTexto1("Pressed s");
                    pintado.setPosY(pintado.getY() + 10);
                    break;

            }
            pintado.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        if(!pintado.getPresionado()) {
            pintado.setPosX(e.getX());
            pintado.setPosY(e.getY());
            pintado.setTexto2("I'm running");
            pintado.repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        pintado.setTexto1("Moviendo a: ["+e.getX()+","+e.getY()+"]");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if (pintado.getPresionado()) {
            pintado.setPosX(e.getX());
            pintado.setPosY(e.getY());
            pintado.setTexto1("Position: ["+e.getX()+", "+e.getY()+"]");
            pintado.repaint();
        }else{
            pintado.setPosX(e.getX());
            pintado.setPosY(e.getY());
        }
        pintado.setPresionado();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        pintado.setTexto2("I'm Cube");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        pintado.setTexto1("Bienvenido");
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        pintado.setTexto1("Vuelva...");
    }
}
