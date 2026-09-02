package exemplo;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println("Cachorro: " + cachorro.emitirSom());
        System.out.println("Cachorro: " + cachorro.comer());

        System.out.println("\nGato: " + gato.emitirSom());
        System.out.println("Gato: " + gato.comer());
    }
}
