package empresa;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Felipe", "21/06/2008", Sexo.MASCULINO, Setor.OPERACOES, 2.100, "A e B");
        Diretor diretor = new Diretor("Ramon", "20/02/2008", Sexo.MASCULINO, Setor.FINANCEIRO, 10.000);

        System.out.println(diretor.toString());
        diretor.admitir(motoboy);
        System.out.println(motoboy.toString());
    }
}
