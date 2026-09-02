package empresa2;

public abstract class Funcionario implements SalarioFinal {
    protected String nome;
    protected String cpf;
    protected String dataDeNascimento;
    protected String salarioBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(String salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Funcionario(String nome, String cpf, String dataDeNascimento, String salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.salarioBase = salarioBase;


    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", salarioBase='" + salarioBase + '\'' +
                '}';
    }
}
