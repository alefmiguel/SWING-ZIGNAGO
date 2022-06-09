import javax.swing.UIManager;

class Main {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (Exception e) {
            System.out.println("Look and Feel not set");
        }
        
        TelaEscolha tela2 = new TelaEscolha();
        TelaLogin tela = new TelaLogin();
    }
}