package projeto2_bar;

public class Bar {
	String sexo;
	int quantiCerveja;
	int quantiRefri;
	int quantiEspetinho;
	
	
	public int calcularConsumo() {
		int totalConsumo = 5*quantiCerveja + 3*quantiRefri + 7*quantiEspetinho;
		return totalConsumo;
	}

	
	public int calcularIngresso() {
		int ingresso = 0;
		if (sexo.equals("m")) {
			ingresso = 10;
		}
		else if (sexo.equals("f")) {
			ingresso = 8;
		}
		
		return ingresso;
	}
	
	
	public int calcularCouvert() {
		int couvert = 0;
		if (calcularConsumo() + calcularIngresso() <= 30) {
			couvert = 4;
		}
		
		return couvert;
	}
	
	
	public int calcularTotal() {
		int total;
		total = calcularConsumo() + calcularIngresso() + calcularCouvert();
		
		return total;
	}
}
