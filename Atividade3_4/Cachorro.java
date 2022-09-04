public class Cachorro extends Animal {
    public void correr() {
        System.out.println("**Cachorro correndo**");
    }

    public void latir() {
        System.out.println("**Cachorro latindo**");
        super.emitirSom("audio/dog-bark.wav");
    }
}
