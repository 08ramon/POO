package empresa2;

public class Gerente extends CargoDeConfianca implements Contratacao{


    public Gerente(String nome, String cpf, String dataDeNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataDeNascimento, salarioBase, bonificacao);
    }


    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir: " + funcionario.toString());

    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase * super.bonificacao.getValor();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.obterSalarioFinal() +
                '}';
    }
}
