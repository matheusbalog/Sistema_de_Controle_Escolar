package after;

public final class Nota {
    private final double valor;

    public Nota(double valor) {
        if (valor < 0 || valor > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
        this.valor = valor;
    }

    public boolean isAprovado() {
        return valor >= 7;
    }

    public double getValor() {
        return valor;
    }
}