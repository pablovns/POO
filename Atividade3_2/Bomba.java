public class Bomba {
    public Boolean status;

    public void ligar(int tempo) {
        status = true;
        System.out.println("A bomba foi ligada.");
        for (int i = tempo; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.printf("Faltam %d segundo(s) para a bomba ser desligada.\n", i);
        }
        desligar();
    }

    public void desligar() {
        status = false;
        System.out.println("A bomba foi desligada.");
    }
}