public class Brinquedo {
    private String nome = "Indefinido", faixaEtaria = "Indefinido";
    private Float preco = -1f;

    public Brinquedo(String nome) {
        // Método construtor da classe
        this.nome = nome;
	}

    public Brinquedo(String nome, float preco) {
        // Método construtor da classe
        this.nome = nome;
        this.preco = preco;
	}
    
    public Brinquedo(String nome, float preco, String faixaEtaria) {
        // Método construtor da classe
        this.nome = nome;
        this.preco = preco;
        this.faixaEtaria = faixaEtaria;
	}

	public void mostrar() {
        System.out.printf("Nome: %s\nPreço: R$ %.2f\nFaixa etária: %s\n\n", this.getNome(), this.getPreco(),  this.getFaixaEtaria());
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public Float getPreco() {
        return this.preco;
    }

    public String getFaixaEtaria() {
        return this.faixaEtaria;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        String[] valoresPermitidos = {"0-2", "3-5", "6-10", "10+"};
        

        // Validação do parãmetro recebido
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
            System.out.println("O parâmetro fornecido não é válido.\nValores permitidos:");
            for (String x : valoresPermitidos) {
                System.out.printf("\"%s\"\n", x);
            }
            System.out.println();
        }
    }   
}