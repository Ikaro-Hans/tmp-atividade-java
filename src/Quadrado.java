import java.awt.Color;

public class Quadrado extends Forma {
    private int lado;

    public Quadrado(Ponto2D posicao, Color corDeFundo, int lado) {
        super(posicao, corDeFundo);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

}
