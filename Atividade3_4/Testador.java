public class Testador {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.correr();
        cachorro.latir();

        Cavalo cavalo = new Cavalo();
        cavalo.correr();
        cavalo.relinchar();

        Preguica preguica = new Preguica();
        preguica.subirArvore();
        preguica.gritar();
    }
}
