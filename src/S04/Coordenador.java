package S04;

public class Coordenador extends Pessoa {

    int quantidadeCursosCoord;

    public Coordenador() {
    }

    public Coordenador(int quantidadeCursosCoord) {
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }

    public int getQuantidadeCursosCoord() {
        return quantidadeCursosCoord;
    }

    public void setQuantidadeCursosCoord(int quantidadeCursosCoord) {
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }
}
