
package ulbra.br.exer1;

import java.util.Scanner;

class Produto {
    private int codigoProduto;
    private String nomeProduto;
    private double precoProduto;

    public Produto(int codigo, String nome, double precoUnitario) {
        this.codigoProduto = codigo;
        this.nomeProduto = nome;
        this.precoProduto = precoUnitario;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigo(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoUnitario(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + codigoProduto);
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Preço Unitário: R$ " + precoProduto);
    }

    public void blackFridayDesconto() {
        this.precoProduto *= 0.8; 
    }
}

// Classe Eletronico 
class Eletronico extends Produto {
    private int garantiaMeses;

    public Eletronico(int codigo, String nome, double precoUnitario, int garantiaMeses) {
        super(codigo, nome, precoUnitario);
        this.garantiaMeses = garantiaMeses;
    }

    public int calculaGarantiaEstendida() {
        return garantiaMeses + 12;
    }

    public void exibirDetalhes() {
        super.exibirInformacoes();
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}

class Livro extends Produto {
    private String autor;

    public Livro(int codigo, String nome, double precoUnitario, String autor) {
        super(codigo, nome, precoUnitario);
        this.autor = autor;
    }

    public void exibirAutor() {
        System.out.println("Autor: " + autor);
    }

    
    public void exibirDetalhes() {
        super.exibirInformacoes();
        System.out.println("Autor: " + autor);
    }
}

class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Eletrônico:");
        System.out.print("Código: ");
        int codigoEletronico = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nome: ");
        String nomeEletronico = scanner.nextLine();
        System.out.print("Preço Unitário: ");
        double precoEletronico = scanner.nextDouble();
        System.out.print("Garantia (meses): ");
        int garantia = scanner.nextInt();
        
        Eletronico eletronico = new Eletronico(codigoEletronico, nomeEletronico, precoEletronico, garantia);

        System.out.println("Cadastro de Livro:");
        System.out.print("Código: ");
        int codigoLivro = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Nome: ");
        String nomeLivro = scanner.nextLine();
        System.out.print("Preço Unitário: ");
        double precoLivro = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        
        Livro livro = new Livro(codigoLivro, nomeLivro, precoLivro, autor);

        eletronico.blackFridayDesconto();

        
        System.out.println("\nDetalhes do Eletrônico após Black Friday:");
        eletronico.exibirDetalhes();
        System.out.println("Garantia Estendida: " + eletronico.calculaGarantiaEstendida() + " meses");
        
        System.out.println("\nDetalhes do Livro:");
        livro.exibirDetalhes();
        livro.exibirAutor();

        scanner.close();
    }
}

