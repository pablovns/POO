public class Preguica extends Animal {
    public void subirArvore() {
        System.out.println("**Preguiça subindo árvore**");
    }

    public void gritar() {
        System.out.println("**Preguiça gritando**");
        super.emitirSom("audio/sloth-scream.wav");
    }
}
