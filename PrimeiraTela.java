import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Container;

public class PrimeiraTela  extends JFrame{
    private JLabel txtUsuario;
    private JTextField inputUsuario;
    private JButton botaoEnviar;
    private Container painel;
    private GridLayout layout; 
    private JLabel txtSenha;
    private JPasswordField inputSenha;
     

    public PrimeiraTela(){
        // Criando componentes
        painel = getContentPane();
        layout =  new GridLayout(5, 2, 0, 3); //(rows, cols, gapcols, gapRows)
        
        // COMPONENTES EM SI
        txtUsuario = new JLabel("Usuário");
        inputUsuario = new JTextField();
        txtSenha = new JLabel("Senha");
        inputSenha = new JPasswordField();
        botaoEnviar = new JButton("Entrar");
        // LAYOUT
    
        ((JComponent) painel).setBorder(new EmptyBorder(15,15,15,15));
        
        // Configurações padrões da tela
        setSize(300, 200);
        setTitle("Login");
        setVisible(true);
        painel.setLayout(layout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adicionando componentes
        painel.add(txtUsuario);
        painel.add(inputUsuario);
        painel.add(txtSenha);
        painel.add(inputSenha);
        painel.add(botaoEnviar);
    }
}
