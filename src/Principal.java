import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args){
        JFrame janela = new JFrame();
        janela.setTitle("Minha Janela");
        janela.setVisible(true);
        janela.setAlwaysOnTop(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Painel painel = new Painel();
        janela.add(painel);
        janela.pack();
        janela.setLocationRelativeTo(null);
        
    }
}
