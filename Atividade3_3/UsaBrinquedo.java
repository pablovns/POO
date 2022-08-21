public class UsaBrinquedo {
    public static void main(String[] args) {
        // Instanciando os objetos
        Brinquedo Brinquedo1 = new Brinquedo("Carrinho");
        Brinquedo Brinquedo2 = new Brinquedo("Ioiô", 7.99f);
        Brinquedo Brinquedo3 = new Brinquedo("Boneca", 24.90f, "3-5");
        Brinquedo[] arrayBrinquedos = {Brinquedo1, Brinquedo2, Brinquedo3};

        // Testando as funcionalidades da classe

        mostrarBrinquedos(arrayBrinquedos);
        
        Brinquedo1.getFaixaEtaria();
        Brinquedo1.setFaixaEtaria("13");
        Brinquedo1.getFaixaEtaria();
        
        Brinquedo2.getNome();
        Brinquedo2.setNome("Dado");
        Brinquedo2.getNome();
        
        Brinquedo3.getPreco();
        Brinquedo3.setPreco(27.90f);
        Brinquedo3.getPreco();
        
        mostrarBrinquedos(arrayBrinquedos);
    }

    public static void mostrarBrinquedos(Brinquedo[] objetos) {
        for (Brinquedo x : objetos) {
            x.mostrar();
        }
    }
}
