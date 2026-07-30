package after;

public final class Cpf {
    private final String numero;

    //Objeto de valor representa o CPF
    //Objeto Já nasce válido
    public Cpf(String numero) {
        String limpo = numero.replaceAll("[^0-9]", "");
        if (limpo.length() != 11) {
            throw new IllegalArgumentException("CPF deve ter 11 dígitos");
        }
        this.numero = limpo;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cpf)) return false;
        return numero.equals(((Cpf) o).numero);
    }

    @Override
    public int hashCode() {
        return numero.hashCode();
    }

    @Override
    public String toString() {
        return numero;
    }
}