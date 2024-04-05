package autoVini;

public class Carro {
		 String modelo, marca,cor;
		 int ano, N_portas;
		 
		 public Carro(String marca, String modelo, int ano, String cor, int numero_portas) {
		        this.marca = marca;
		        this.modelo = modelo;
		        this.ano = ano;
		        this.cor = cor;
		        this.N_portas = numero_portas;
		    }
		 String descricao() {
		        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor + ", Portas: " + N_portas;
		    }
	}

