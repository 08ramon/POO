package exemplo;

public class Cachorro implements Animal{
    @Override
    public String emitirSom() {
        return ":AuAu!";
    }

    @Override
    public String comer() {
        return ":Ração";
    }
}
