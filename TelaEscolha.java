import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComponent;
import java.awt.Container;
import java.awt.Font;

public class TelaEscolha extends JFrame {
    private JButton botaoADM;
    private JButton botaoCliente;
    private JLabel texto;
    private Container painel; 
    private GridLayout layout;

    public TelaEscolha() {

        // LAYOUT E PAINEL
        painel = getContentPane();
        layout = new GridLayout(3,1,0,3);

        // CRIANDO COMPONENTES
        botaoADM = new JButton("Administrador");
        botaoCliente = new JButton("Cliente");
        texto =  new JLabel("Escolha um tipo", SwingConstants.CENTER);
        texto.setFont(new Font("Monospace", Font.BOLD, 20));

        // PADDINGS 
        ((JComponent) painel).setBorder(new EmptyBorder(15,15,15,15));

        // SETANDO INFORMAÇÕES DA TELA
        setSize(300, 250);
        setTitle("Tela de Escolha");
        setVisible(true);
        setResizable(false);
        painel.setLayout(layout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ADICIONANDO ELEMENTOS
        painel.add(texto);
        painel.add(botaoADM);
        painel.add(botaoCliente);
    }
}
