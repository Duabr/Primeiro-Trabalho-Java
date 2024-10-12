package projeto2_bar;
import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {
		Bar bar = new Bar();
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Sexo (M ou F): ");
		bar.sexo = scanner.next();
		if (!bar.sexo.equals("m") && !bar.sexo.equals("f")) {
			System.out.println("Opção inválida!");
			scanner.close();
			System.exit(0);
		}
		System.out.printf("Quantidade de cervejas: ");
		bar.quantiCerveja = scanner.nextInt();
		System.out.printf("Quantidade de refrigerantes: ");
		bar.quantiRefri = scanner.nextInt();
		System.out.printf("Quantidade de espetinhos: ");
		bar.quantiEspetinho = scanner.nextInt();

		
		System.out.println("RELAÓRIO: ");
		System.out.println("Consumo = " + bar.calcularConsumo());
		if (bar.calcularCouvert() == 4) {
			System.out.println("Couvert = R$" + bar.calcularCouvert());	
		}
		else {
			System.out.println("Isento de Couvert");
		}
		System.out.println("Ingresso = R$" + bar.calcularIngresso());
		System.out.println("\nValor a pagar = R$" + bar.calcularTotal());
		
		scanner.close();
	}
}
