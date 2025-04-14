
package ulbra.br.exer2;

import java.util.Scanner;

// Classe Veiculo
class Veiculo {
    private String marcaVeiculo;
    private String modeloVeiculo;
    private int anoVeiculo;
    private double precoVeiculo;

    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marcaVeiculo = marca;
        this.modeloVeiculo = modelo;
        this.anoVeiculo = ano;
        this.precoVeiculo = preco;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(int anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public double getPrecoVeiculo() {
        return precoVeiculo;
    }

    public void setPrecoVeiculo(double precoVeiculo) {
        this.precoVeiculo = precoVeiculo;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marcaVeiculo);
        System.out.println("Modelo: " + modeloVeiculo);
        System.out.println("Ano: " + anoVeiculo);
        System.out.println("Preço: R$ " + precoVeiculo);
    }
}

// Classe Carro
class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, double preco, int portas) {
        super(marca, modelo, ano, preco);
        this.portas = portas;
    }

    public double calcularSeguro() {
        return getPrecoVeiculo() * 0.05; // Seguro é 5% do valor do carro
    }

    
    public void exibirDetalhes() {
        super.exibirInformacoes();
        System.out.println("Número de Portas: " + portas);
        System.out.println("Valor do Seguro: R$ " + calcularSeguro());
    }
}

// Classe Moto
class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, double preco, int cilindradas) {
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;
    }

    public void exibirCilindradas() {
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }

    
    public void exibirDetalhes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }
}

// Classe Concessionaria
class Concessionaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um carro
        System.out.println("Cadastro de Carro:");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Ano: ");
        int anoCarro = scanner.nextInt();
        System.out.print("Preço: ");
        double precoCarro = scanner.nextDouble();
        System.out.print("Número de portas: ");
        int portas = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha
        
        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, precoCarro, portas);

        // Criando uma moto
        System.out.println("Cadastro de Moto:");
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.print("Ano: ");
        int anoMoto = scanner.nextInt();
        System.out.print("Preço: ");
        double precoMoto = scanner.nextDouble();
        System.out.print("Cilindradas: ");
        int cilindradas = scanner.nextInt();
        
        Moto moto = new Moto(marcaMoto, modeloMoto, anoMoto, precoMoto, cilindradas);

        // Exibindo detalhes dos veículos
        System.out.println("\nDetalhes do Carro:");
        carro.exibirDetalhes();

        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
        moto.exibirCilindradas();

        scanner.close();
    }
}
