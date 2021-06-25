package logica;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class Tablero extends JFrame{
    public String tableroProp[][];
    public String tableroPropTiros[][];
    boolean bTableroProp[][]=new boolean[10][10];
    public String tableroCont[][];
    boolean bTableroCont[][]=new boolean[10][10];
    String txt="",txtCont="",posicion="",txtTiros="";
    int x,y,barco=0, cont=0;;
    JTextArea text,textCont,textContTiros;
    JPanel pnl_inf,pnl_sup;
    JLabel lbl1,lbl2,lbl3,lbl4;
    private static final int total_tiros=5;
    public Tablero(){
        tableroProp=new String[10][10];
        tableroCont=new String[10][10];
        tableroPropTiros=new String[10][10];
        //initComponents();
    }
    public void llenarTablero(){
        for (int i = 0; i <10; i++) {
            for (int j = 0; j <10; j++) {
                tableroProp[i][j]="O\t";
                txt+=tableroProp[i][j]; 
            }
            txt+="\n";
        }
        //text.append(this.txt);
    }
    public void tableroPropTiros(){
        textContTiros=new JTextArea();
        textContTiros.setEditable(false);
        textContTiros.setBackground(new Color(52, 152, 219));
        textContTiros.setOpaque(true);
        textContTiros.setForeground(Color.WHITE);
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {
                tableroPropTiros[i][j]="O\t";
            }
        }
        mostrarTableroPropTiros();
    }
    public void tableroContrincante(String[][] tabCont){
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 10; j++) {
                tableroCont[i][j]=tabCont[i][j];
            }
        }
    }
    /*public void mostrarTableroCont(){
        txtCont="";
        textCont.setText("");
        txtCont+="\n";
        for (int i = 0; i <10; i++) {
            for (int j = 0; j <10; j++) {
                txtCont+=tableroCont[i][j]; 
            }
            txtCont+="\n";
        }
        textCont.append(this.txtCont);
    }*/
    public String mostrarTableroProp(){
        txt="";
        //text.setText("");
        txt+="\n";
        for (int i = 0; i <10; i++) {
            for (int j = 0; j <10; j++) {
                txt+=tableroProp[i][j]; 
            }
            txt+="\n";
        }
        //text.append(this.txt);
        return txt;
    }
    public String mostrarTableroPropTiros(){
        txtTiros="";
        //textContTiros.setText("");
        txtTiros+="\n";
        for (int i = 0; i <10; i++) {
            for (int j = 0; j <10; j++) {
                txtTiros+=tableroPropTiros[i][j]; 
            }
            txtTiros+="\n";
        }
        //textContTiros.append(this.txtTiros);
        return txtTiros;
    }
    public void arribarBarco(){
        int num=0;
        for (int i = 0; i <5; i++) {
            x=Integer.parseInt(JOptionPane.showInputDialog("Indique la coordenada en x"));
            y=Integer.parseInt(JOptionPane.showInputDialog("Indique la coordenada en y"));
            posicion=JOptionPane.showInputDialog("Indique 1 si es horizontal y 0 en caso contrario");
            switch(barco){
                case 0:
                    if (posicion.equals("1")) {
                        for (int j =x; num <5; j++) {
                            tableroProp[y][j]="#\t";
                            txt+=tableroProp[y][j]; 
                            num++;
                        }
                    }else{
                        for (int j = y; num <5; j++) {
                            tableroProp[j][x]="#\t";
                            txt+=tableroProp[j][x]; 
                            num++;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Barco portaaviones arribado");
                    mostrarTableroProp();
                    break;
                case 1:
                    num=0;
                    if (posicion.equals("1")) {
                        for (int j =x; num <4; j++) {
                            tableroProp[y][j]="#\t";
                            txt+=tableroProp[y][j]; 
                            num++;
                        }
                    }else{
                        for (int j = y; num <4; j++) {
                            tableroProp[j][x]="#\t";
                            txt+=tableroProp[j][x]; 
                            num++;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Barco acorazado arribado");
                    mostrarTableroProp();
                    break;
                case 2:
                    num=0;
                    if (posicion.equals("1")) {
                        for (int j =x; num <3; j++) {
                            tableroProp[y][j]="#\t";
                            txt+=tableroProp[y][j]; 
                            num++;
                        }
                    }else{
                        for (int j = y; num <3; j++) {
                            tableroProp[j][x]="#\t";
                            txt+=tableroProp[j][x]; 
                            num++;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Barco crucero arribado");
                    mostrarTableroProp();
                    break;
                case 3:
                    num=0;
                    if (posicion.equals("1")) {
                        for (int j =x; num <3; j++) {
                            tableroProp[y][j]="#\t";
                            txt+=tableroProp[y][j]; 
                            num++;
                        }
                    }else{
                        for (int j = y; num <3; j++) {
                            tableroProp[j][x]="#\t";
                            txt+=tableroProp[j][x]; 
                            num++;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Barco submarino arribado");
                    mostrarTableroProp();
                    break;
                case 4:
                    num=0;
                    if (posicion.equals("1")) {
                        for (int j =x; num <2; j++) {
                            tableroProp[y][j]="#\t";
                            txt+=tableroProp[y][j]; 
                            num++;
                        }
                    }else{
                        for (int j = y; num <2; j++) {
                            tableroProp[j][x]="#\t";
                            txt+=tableroProp[j][x]; 
                            num++;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Barco destructor arribado");
                    mostrarTableroProp();
                    break;
                default:
                    break;
            }
            barco++;
        }
        barco=0;
    }

    public void efectuarDisparos(){
        if(quedanBarcos()){
            while (cont<5) {
                x=Integer.parseInt(JOptionPane.showInputDialog("Indique la coordenada en X para tirar"));
                y=Integer.parseInt(JOptionPane.showInputDialog("Indique la coordenada en Y para tirar"));
                if (tableroCont[y][x].equals("#\t")) {
                    tableroPropTiros[y][x]="@\t";
                    tableroCont[y][x]="O\t";
                }
                mostrarTableroPropTiros();
                cont++;
            }
        }else{
            JOptionPane.showMessageDialog(null,"SIN BARCOS CONTRINCANTES");
        }
        cont=0;
    }
    public String efectuarDisparosSystem(){
        String d="";
        if(quedanBarcos()){
            for(int i=0;i<5;i++) {
                x=(int)(Math.random()*8);
                y=(int)(Math.random()*8);
                if (tableroCont[y][x].equals("#\t")) {
                    //tableroProp[y][x]="@\t";
                    tableroCont[y][x]="@\t";
                    d+="Interceptado en ["+x+"]"+"["+y+"]\n";
                }else{
                    d+= "Tiro al agua\n";
                }
                mostrarTableroProp();
                cont++;
            }
        }else{
            JOptionPane.showMessageDialog(null,"SIN BARCOS CONTRINCANTES");
        }
        cont=0;
        return d;
    }
    public String[][] tabContrincante(){
        return tableroProp;
    }
    public boolean quedanBarcos(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10; j++) {
                if (tableroCont[i][j].equals("#\t"))return true;
            }
        }
        return false;
    }
    public JTextArea tabProp(){
        return text;
    }
    public JTextArea tabCont(){
        return textContTiros;
    }

    public String arribarBarcoSystem(){
        String s="System arribo\n";
        int num=0;
        for (int i = 0; i <5; i++) {
            x=(int)(Math.random()*8);
            System.out.println(x);
            y=(int)(Math.random()*8);
            System.out.println(y);
            posicion="1";
            switch(barco){
                case 0:
                    if (posicion.equals("1")) {
                        for (int j =x; num <5; j++) {
                            tableroProp[y][j]="#\t";
                            txt+=tableroProp[y][j]; 
                            num++;
                        }
                    }else{
                        for (int j = y; num <5; j++) {
                            tableroProp[j][x]="#\t";
                            txt+=tableroProp[j][x]; 
                            num++;
                        }
                    }
                    s+=" Barco portaaviones arribado\n";
                    mostrarTableroProp();
                    break;
                case 1:
                    num=0;
                    if (posicion.equals("1")) {
                        for (int j =x; num <4; j++) {
                            tableroProp[y][j]="#\t";
                            txt+=tableroProp[y][j]; 
                            num++;
                        }
                    }else{
                        for (int j = y; num <4; j++) {
                            tableroProp[j][x]="#\t";
                            txt+=tableroProp[j][x]; 
                            num++;
                        }
                    }
                    s+=" Barco acorazado arribado\n";
                    mostrarTableroProp();
                    break;
                case 2:
                    num=0;
                    if (posicion.equals("1")) {
                        for (int j =x; num <3; j++) {
                            tableroProp[y][j]="#\t";
                            txt+=tableroProp[y][j]; 
                            num++;
                        }
                    }else{
                        for (int j = y; num <3; j++) {
                            tableroProp[j][x]="#\t";
                            txt+=tableroProp[j][x]; 
                            num++;
                        }
                    }
                    s+=" Barco crucero arribado\n";
                    mostrarTableroProp();
                    break;
                case 3:
                    num=0;
                    if (posicion.equals("1")) {
                        for (int j =x; num <3; j++) {
                            tableroProp[y][j]="#\t";
                            txt+=tableroProp[y][j]; 
                            num++;
                        }
                    }else{
                        for (int j = y; num <3; j++) {
                            tableroProp[j][x]="#\t";
                            txt+=tableroProp[j][x]; 
                            num++;
                        }
                    }
                    s+=" Barco submarino arribado\n";
                    mostrarTableroProp();
                    break;
                case 4:
                    num=0;
                    if (posicion.equals("1")) {
                        for (int j =x; num <2; j++) {
                            tableroProp[y][j]="#\t";
                            txt+=tableroProp[y][j]; 
                            num++;
                        }
                    }else{
                        for (int j = y; num <2; j++) {
                            tableroProp[j][x]="#\t";
                            txt+=tableroProp[j][x]; 
                            num++;
                        }
                    }
                    s+=" Barco destructor arribado\n";
                    mostrarTableroProp();
                    break;
                default:
                    break;
            }
            barco++;
        }
        barco=0;
        return s;
    }
    /*public void initComponents(){
        this.setSize(900,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(5,5));
        this.setBackground(new Color(93, 109, 126));
        Font fuente= new Font("",3,20);
        llenarTablero();
        pnl_inf=new JPanel();
        pnl_inf.setLayout(new BorderLayout());
        pnl_inf.add(text,BorderLayout.CENTER);
        lbl2=new JLabel("\tT A B L E R O    P R O P I O");
        lbl2.setFont(fuente);
        lbl2.setBackground(new Color(33, 47, 61));
        lbl2.setOpaque(true);
        lbl2.setForeground(Color.WHITE);
        pnl_inf.add(lbl2,BorderLayout.NORTH);
        this.add(pnl_inf,BorderLayout.CENTER);
        //mostrarTablero();
        //arribarBarco();
        mostrarTableroProp();
        //tableroContrincante(tableroProp);
        tableroPropTiros();
        //mostrarTableroCont();
        pnl_sup=new JPanel();
        pnl_sup.setLayout(new BorderLayout());
        pnl_sup.add(textContTiros,BorderLayout.CENTER);
        lbl1=new JLabel("\tT A B L E R O    C O N T R I N C A N T E");
        lbl1.setFont(fuente);
        lbl1.setBackground(new Color(33, 47, 61));
        lbl1.setOpaque(true);
        lbl1.setForeground(Color.WHITE);
        pnl_sup.add(lbl1,BorderLayout.NORTH);
        this.add(pnl_sup,BorderLayout.NORTH);
        
        this.setVisible(true);
    }*/
    /*public static void main(String[] args) {
        Tablero t=new Tablero();
        t.arribarBarco();
        t.tableroContrincante(t.tabContrincante());
        t.efectuarDisparos();
    }*/
}