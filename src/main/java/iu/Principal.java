
package iu;

import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import javax.swing.JOptionPane;

public class Principal extends Frame {
    private Label lblNombre;
    private TextField txtNombre;
    private Button btnBoton1;

    public Principal(String string) throws HeadlessException {
        super(string);
        this.setSize(800, 600);
        this.setLayout((LayoutManager) new FlowLayout());
        lblNombre = new Label("Nombre: ");
        this.add(lblNombre);
        txtNombre = new TextField(30);
        this.add(txtNombre);
        btnBoton1 = new Button("Saludar");
        //btnBoton1.addMouseListener(new EventosRaton());
        btnBoton1.addMouseListener((MouseListener) new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            System.out.println( txtNombre.getText() );
        JOptionPane.showMessageDialog(null,"Hola" + txtNombre.getText());
        }
        });
        this.add(btnBoton1);          
        this.addWindowListener(new WindowAdapter() {
        
        public void windowClosing(WindowEvent e){
          System.exit(0);
        }
        });
        this.setVisible(true);
        
    }  
}
     