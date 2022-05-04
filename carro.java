package Atos;

public class carro {
	
	 String fabricante;
	 String modelo;
	 int ano;
	
	public void configuraDados(String carroFabricante, String carroModelo, int carroAno) {
		fabricante = carroFabricante;
		modelo = carroModelo;
		ano = carroAno;
	}
	public void retornarCarro() {
		System.out.println("Carro: "+ fabricante +" "+ modelo +" "+ ano);

	}	
}	
