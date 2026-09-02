package empresa;

public enum Setor {
    RECURSOS_HUMANOS("Recursos humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operações");

    private final String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
