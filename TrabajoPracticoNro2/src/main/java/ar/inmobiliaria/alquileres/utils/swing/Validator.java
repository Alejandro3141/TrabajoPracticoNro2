package ar.inmobiliaria.alquileres.utils.swing;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Validator {
    private JTextField txt;
    public Validator() {}
    public Validator(JTextField txt) {this.txt = txt;}

    private boolean error(String mensaje){
        JOptionPane.showMessageDialog(txt, mensaje,"Error",
                JOptionPane.ERROR_MESSAGE);
        txt.selectAll();
        txt.requestFocus();
        return false;
    }
    public boolean length(int length){
        if(txt.getText().length()==length) return true;
        return error("Debe tener "+length+" caracteres.");
    }
    public void onlyDigit () {
        txt.addKeyListener(new KeyAdapter() {
            public void keyTyped (KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            } 
        });
    }
    public void limit(int length){
        txt.addKeyListener(new KeyAdapter() {
            public void keyTyped (KeyEvent e) {
                char c = e.getKeyChar();
                int cantidad=txt.getText().length();
                if(cantidad>=length){
                    e.consume();
                }
            } 
        });
    }
    public void limit(JTextArea txa, int length){
        txa.addKeyListener(new KeyAdapter() {
            public void keyTyped (KeyEvent e) {
                char c = e.getKeyChar();
                int cantidad=txa.getText().length();
                if(cantidad>=length){
                    e.consume();
                }
            } 
        });
    }
}
