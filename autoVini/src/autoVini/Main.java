package autoVini;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Honda", "Civic", 2022, "Preto", 4);
		Moto moto = new Moto("Honda", "CG", 2016, "Vermelho", 600);
		System.out.println("descrição do Carro: " + carro.descricao());
		System.out.println("descrição da Moto: " + moto.descricao());

	}

}
