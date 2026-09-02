package empresa2;

import empresa.Diretor;

public class Main {
    static void main() {
        Gerente gerente = new Gerente("Kaique", "000.000.000.-00", "23/09/2000", 3.500, Bonificacao.GERENTE);
        Gerente diretor = new Gerente("Alberth", "111.111.111-11", "09/08/2007", 2.800, Bonificacao.DIRETOR);
        Motoboy motoboy = new Motoboy("Felipe", "222.222.222-22", "27/07/2008", 2.000);

        System.out.println(gerente.toString());
        System.out.println(diretor.toString());
        System.out.println(motoboy.toString());

        gerente.admitir(motoboy);
        gerente.demitir(motoboy);

    }
}
