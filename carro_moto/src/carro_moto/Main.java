package carro_moto;

public class Main {
	
	 public static void main(String[] args) {
	        // Criando os objetos
	        Carro meuCarro = new Carro();
	        Moto minhaMoto = new Moto();

	        // Aumentando a velocidade
	        meuCarro.aumentarVelocidade(40);
	        minhaMoto.aumentarVelocidade(30);

	        // Exibindo os resultados
	        meuCarro.mostrarVelocidade();
	        minhaMoto.mostrarVelocidade();
	 }       

}
