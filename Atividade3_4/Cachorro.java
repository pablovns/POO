public class Cachorro extends Animal {
    public void correr() {
        System.out.println("**Cachorro correndo**");
    }

    public void latir() {
        Animal.emitirSom("audio/dog-bark.wav");
    }
}
