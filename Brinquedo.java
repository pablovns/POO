public class Brinquedo {
    private String nome, faixaEtaria;
    private Float preco;
    
    public Brinquedo(String nome, String faixaEtaria, float preco) {
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
        this.preco = preco;
	}

	public void mostrar() {
        System.out.printf("Nome: %s\nFaixa etária: %s\nPreço: %f", this.nome, this.faixaEtaria, this.preco);
    }

    public String getFaixaEtaria() {
        return this.faixaEtaria;
    }
    
    public Float getPreco() {
        return this.preco;
    }
    
    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        String[] valoresPermitidos = {"0-2", "3-5", "6-10", "10+"};
        
        boolean encontrado = false;
        for(String x : valoresPermitidos) {
            if(x == faixaEtaria) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            this.faixaEtaria = faixaEtaria;
        } else {
            System.out.println("O parâmetro fornecido não é válido.\nValores permitidos:\n");
            for (String x : valoresPermitidos) {
                System.out.printf("\"%s\"", x);
            }
        }
    }   
}