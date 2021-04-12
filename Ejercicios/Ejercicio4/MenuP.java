import java.awt.*;
import java.awt.event.*;
public class MenuP extends Frame implements ActionListener {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Label lbl_msg;
    private TextArea txt_out;
    private Button btn_clear;
    private TextField txt_ini;
    private Button btn_aceptar;

    public MenuP() {
        initComponents();
    }

    public void initComponents() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        txt_ini = new TextField();
        btn_aceptar = new Button("Aceptar");
        btn_clear = new Button("Limpiar");
        txt_out = new TextArea();
        lbl_msg = new Label("Introduzca el texto :");
        btn_aceptar.addActionListener(this);
        btn_clear.addActionListener(this);
        this.setLayout(new GridLayout(3,3));
        this.add(lbl_msg, 0, 0);
        this.add(txt_ini, 0, 1);
        this.add(btn_aceptar, 0, 2);
        this.add(txt_out, 1,1);
        this.add(btn_clear,2,2);

        // panel_superior.add(btn_aceptar, BorderLayout.EAST);
        // panel_superior.add(txt_ini, BorderLayout.CENTER);
        // panel_superior.add(lbl_msg, BorderLayout.WEST);
        // panel_central.add(txt_out, BorderLayout.CENTER);
        // panel_inferior.add(btn_clear, BorderLayout.EAST);
        // this.add(panel_superior, BorderLayout.NORTH);
        // this.add(panel_inferior, BorderLayout.SOUTH);
        // this.add(panel_central, BorderLayout.CENTER);
        this.setSize(400,300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        
        
    }
    
    public static void main(String args[]){
        MenuP m = new MenuP();
    }
}
