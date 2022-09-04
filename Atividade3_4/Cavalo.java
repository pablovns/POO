public class Cavalo extends Animal {
    public void correr() {
        System.out.println("**Cavalo correndo**");
    }
    
    public void relinchar() {
        Animal.emitirSom("audio/horse-neigh.wav");
    }

}