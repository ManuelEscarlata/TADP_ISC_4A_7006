package logica;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

import comunicacion.Atendedor;

public class Jugador {
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    public Tablero my_Tablero;
    public String nombre="";
    public int edad=0;
    public Jugador(int value) throws UnknownHostException, IOException {
        if (value==0) {
            nombre=JOptionPane.showInputDialog(null,"Indique su nombre");
            edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Indique su edad"));
        }else{
            nombre="System";
            edad=20;
        }
        my_Tablero=new Tablero();
        
        //socket = new Socket("localhost", 5000);
        //in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //out = new PrintWriter(socket.getOutputStream());
    }
    public String[][] tablero(){
        return my_Tablero.tabContrincante();
    }

    public void write(String mensaje) throws IOException {
        out.println(mensaje);
        out.flush();
        String line = in.readLine();
        System.out.println(line);
    }
    public void bye() throws IOException {
        in.close();
        out.close();
    }
    /*public static void main(String args[]) {
        try{
            Jugador jug = new Jugador();
            String line = "";
            while(!line.equals("Adios"))
            {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                line = in.readLine();
                jug.write(line);
            }   
            jug.bye();
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }*/
}
