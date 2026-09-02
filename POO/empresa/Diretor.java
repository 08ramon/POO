package empresa;

public class Diretor extends Funcionario implements Contratacao{
    private final double PREMIO = 1.2;

    public double getPREMIO() {
        return PREMIO;
    }

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);

    }

    @Override
    public double getSalarioFinal() {
        double resultado;
        return super.salarioBase * this.PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                ", salaário Final:" +this.getSalarioFinal() +
                '}';
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir: " + funcionario.toString());
    }
}
