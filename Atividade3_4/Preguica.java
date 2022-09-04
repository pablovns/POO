public class Preguica extends Animal {
    public void subirArvore() {
        System.out.println("**Preguiça subindo árvore**");
    }

    public void gritar() {
        Animal.emitirSom("audio/sloth-scream.wav");
    }
}
