import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class CalculadoraGUI extends Jframe implements ActionListener,MouseListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JButton btn_0,btn_1,btn_2,btn_3,btn_4;
    JButton btn_5,btn_6,btn_7,btn_8,btn_9;
    JButton btn_div,btn_suma,btn_resta,btn_potencia,btn_mult,btn_resultado;
    JTextField barra;
    JLabel title,c1,c2,c3,op;
    JPanel panelsup, panelcentral;
    String texto="";
    int num1,num2;
    String operacion;
    int[] array=new int[19];
    String[] simbolos=new String[4];
    int contador=0;
    int c=0;
    
    public CalculadoraGUI(String nombre){
        super(nombre);
        this.setSize(500, 400);
        this.setVisible(true);
        initComponents();
    }
    
    private void initComponents() {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(5,5));
        panelsup=new JPanel();
        panelsup.setBackground(Color.BLUE);
        panelsup.setPreferredSize(new DimensionUIResource(500,50));
        panelcentral = new JPanel();
        panelcentral.setBackground(Color.white);
        panelcentral.setLayout(new GridLayout(5,4,5,5));
        panelsup.setLayout(new FlowLayout());
        barra=new JTextField("1234567890");
        barra.addMouseListener(this);
        barra.setForeground(Color.lightGray);
        barra.setPreferredSize(new DimensionUIResource(495,45));
        panelsup.add(barra);
        c1=new JLabel("  C1  ");
        c2=new JLabel("  C2  ");
        c3=new JLabel("  C3  ");
        op=new JLabel("  OP  ");
        btn_0=new JButton("0");
        btn_0.addActionListener(this);
        btn_1=new JButton(" 1 ");
        btn_1.addActionListener(this);
        btn_2=new JButton(" 2 ");
        btn_2.addActionListener(this);
        btn_3=new JButton(" 3 ");
        btn_3.addActionListener(this);
        btn_4=new JButton(" 4 ");
        btn_4.addActionListener(this);
        btn_5=new JButton(" 5 ");
        btn_5.addActionListener(this);
        btn_6=new JButton(" 6 ");
        btn_6.addActionListener(this);
        btn_7=new JButton(" 7 ");
        btn_7.addActionListener(this);
        btn_8=new JButton(" 8 ");
        btn_8.addActionListener(this);
        btn_9=new JButton(" 9 ");
        btn_9.addActionListener(this);
        btn_suma=new JButton(" + ");
        btn_suma.addActionListener(this);
        btn_resta=new JButton(" - ");
        btn_resta.addActionListener(this);
        btn_div=new JButton(" / ");
        btn_div.addActionListener(this);
        btn_mult=new JButton(" * ");
        btn_mult.addActionListener(this);
        btn_potencia=new JButton(" ^ ");
        btn_potencia.addActionListener(this);
        btn_resultado=new JButton(" = ");
        btn_resultado.addActionListener(this);
        panelcentral.add(c1);
        panelcentral.add(c2);
        panelcentral.add(c3);
        panelcentral.add(op);
        panelcentral.add(btn_1);
        panelcentral.add(btn_2);
        panelcentral.add(btn_3);
        panelcentral.add(btn_4);
        panelcentral.add(btn_5);
        panelcentral.add(btn_6);
        panelcentral.add(btn_7);
        panelcentral.add(btn_8);
        panelcentral.add(btn_9);
        panelcentral.add(btn_suma);
        panelcentral.add(btn_resta);
        panelcentral.add(btn_div);
        panelcentral.add(btn_mult);
        panelcentral.add(btn_0);
        panelcentral.add(btn_potencia);
        panelcentral.add(btn_resultado);
        this.getContentPane().add(panelsup,BorderLayout.NORTH);
        this.getContentPane().add(panelcentral,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        CalculadoraGUI cal =new CalculadoraGUI("Calculadora Simple");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (contador<=3) {
            if (e.getSource() == btn_0){
                contador++;
                texto+=" 0 ";
                if (contador==1) {
                    num1=0;
                }else{
                    num2=0;
                }
                barra.setText(texto);
            }
            if (e.getSource() == btn_1){
                contador++;
                texto+=" 1 ";
                if (contador==1) {
                    num1=1;
                }else{
                    num2=1;
                }
                barra.setText(texto);
            }
            if (e.getSource() == btn_2){
                contador++;
                texto+=" 2 ";
                if (contador==1) {
                    num1=2;
                }else{
                    num2=2;
                }
                barra.setText(texto);
            }
            if (e.getSource() == btn_3){
                contador++;
                texto+=" 3 ";
                if (contador==1) {
                    num1=3;
                }else{
                    num2=3;
                }
                barra.setText(texto);
            }
            if (e.getSource() == btn_4){
                contador++;
                texto+=" 4 ";
                if (contador==1) {
                    num1=4;
                }else{
                    num2=4;
                }
                barra.setText(texto);
            }
            if (e.getSource() == btn_5){
                contador++;
                texto+=" 5 ";
                if (contador==1) {
                    num1=5;
                }else{
                    num2=5;
                }
                barra.setText(texto);
            }
            if (e.getSource() == btn_6){
                contador++;
                texto+=" 6 ";
                if (contador==1) {
                    num1=6;
                }else{
                    num2=6;
                }
                barra.setText(texto);
            }
            if (e.getSource() == btn_7){
                contador++;
                texto+=" 7 ";
                if (contador==1) {
                    num1=7;
                }else{
                    num2=7;
                }
                barra.setText(texto);
            }
            if (e.getSource() == btn_8){
                contador++;
                texto+=" 8 ";
                if (contador==1) {
                    num1=8;
                }else{
                    num2=8;
                }
                barra.setText(texto);
            }
            if (e.getSource() == btn_9){
                contador++;
                texto+=" 9 ";
                if (contador==1) {
                    num1=9;
                }else{
                    num2=9;
                }
                barra.setText(texto);
            }
            if (e.getSource() == btn_suma){
                contador++;
                texto+=" + ";
                operacion="+";
                barra.setText(texto);
            }
            if (e.getSource() == btn_resta){
                contador++;
                texto+=" - ";
                operacion="-";
                barra.setText(texto);
            }
            if (e.getSource() == btn_div){
                contador++;
                texto+=" / ";
                operacion="/";
                barra.setText(texto);
            }
            if (e.getSource() == btn_mult){
                contador++;
                texto+=" * ";
                operacion="*";
                barra.setText(texto);
            }
            if (e.getSource() == btn_potencia){
                contador++;
                texto+=" ^ ";
                operacion="^";
                barra.setText(texto);
            }
            if (e.getSource()==btn_resultado){
                Logica logic=new Logica(operacion);
                logic.setNum1(num1);
                logic.setNum2(num2);
                logic.descifrarOperacion();
                if (logic.getResultado()!="-0") {
                    barra.setText(logic.getResultado());
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Solo se puede agregar 3 elementos");
        }
        
    }
   
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if (c!=0) {
            texto +=barra.getText();
            if (barra.getText().equals("")) {
                texto="";
                contador=0;
            }
        }else{
            barra.setForeground(Color.black);
            barra.setText("");
            if (barra.getText().equals("")) {
                texto="";
                contador=0;
            }
        }
        c=1;
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        barra.setText("");
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}
