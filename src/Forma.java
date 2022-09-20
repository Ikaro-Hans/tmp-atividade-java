import java.awt.Color;

public class Forma {
    private Ponto2D posicao;
    private Color corDeFundo;
    
    public Forma(Ponto2D posicao, Color corDeFundo) {
        this.posicao = posicao;
        this.corDeFundo = corDeFundo;
    }
    public Ponto2D getPosicao() {
        return posicao;
    }
    public Color getCorDeFundo() {
        return corDeFundo;
    }
    public int getX() {
        return posicao.getX();
    }
    public int getY() {
        return posicao.getY();
    }
    
}
