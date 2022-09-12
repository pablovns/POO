public class Testador {
    public static void main(String[] args) {
        System.out.println("a)");
        Cachorro cachorro = new Cachorro("Catatau", 2);
        cachorro.emitirSom();

        Cavalo cavalo = new Cavalo("Pé de Pano", 8);
        cavalo.emitirSom();

        Preguica preguica = new Preguica("Baiano", 5);
        preguica.emitirSom();

        System.out.println("\nb)");

        Veterinario.examinar(cachorro);
        Veterinario.examinar(cavalo);
        Veterinario.examinar(preguica);
    }
}
