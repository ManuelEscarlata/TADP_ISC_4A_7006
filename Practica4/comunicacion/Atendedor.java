package comunicacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

import logica.Jugador;
import logica.Tablero;
public class Atendedor extends Thread{
    Socket jugador;
    BufferedReader in;
    PrintWriter out;
    List<Socket> sockets;
    public Tablero tablero;
    public Jugador jugadorSystem;

    public Atendedor() throws IOException {
        jugadorSystem=new Jugador(1);
        jugadorSystem.my_Tablero.llenarTablero();
        //this.sockets = ss;
        //in = new BufferedReader(new InputStreamReader(jugador.getInputStream()));
        //out = new PrintWriter(jugador.getOutputStream());
    }
    public void setTableroCont(String[][] tab){
        jugadorSystem.my_Tablero.tableroContrincante(tab);
    }
    public String[][] getTablero(){
        return jugadorSystem.my_Tablero.tableroProp;
    }
    public String iniciar(){
        String s="";
        try {
            s=jugadorSystem.my_Tablero.arribarBarcoSystem();
            Thread.sleep(3000);
        } catch (Exception e) {
            //TODO: handle exception
        }
        return s;
    }
    public String disp(){
        String s="";
        try {
            s=jugadorSystem.my_Tablero.efectuarDisparosSystem();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return s;
    }
    public void run() {
        
    }
}
