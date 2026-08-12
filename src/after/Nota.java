package after;

public final class Nota {
    private final double valor1;
    private final double valor2;
    private final double valor3;

    //Objeto já nasce válido e OB2
    public Nota(double valor1, double valor2, double valor3) {
        if (valor1 < 0 || valor1 > 10 || valor2 < 0 || valor2 > 10 || valor3 < 0 || valor3 > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10");
        }
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    //SRP em Nota e não em Aluno
    public boolean isAprovado() {
        double resultado = (valor1+valor2+valor3)/3;
        return resultado>= 7;
    }

    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public double getValor3() {
        return valor3;
    }
}