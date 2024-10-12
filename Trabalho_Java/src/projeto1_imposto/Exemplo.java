package projeto1_imposto;
import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Imposto pessoa1 = new Imposto();
		System.out.printf("Renda anual com saário: ");
		pessoa1.salarioAnual = scanner.nextDouble();
		System.out.printf("Renda anual com prestação de serviço: ");
		pessoa1.ganhoPrestacaoServico = scanner.nextDouble();
		System.out.printf("Renda anual com ganho de capital: ");
		pessoa1.ganhoCapital = scanner.nextDouble();
		System.out.printf("Gastos médicos: ");
		pessoa1.gastoMedico = scanner.nextDouble();
		System.out.printf("Gastos educacionais: ");
		pessoa1.gastoEducacional = scanner.nextDouble();
		pessoa1.calcularImpostoTotal(pessoa1.salarioAnual, pessoa1.ganhoPrestacaoServico, pessoa1.ganhoCapital);
		
		
		System.out.println("\n* CONSOLIDADE DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f\n", pessoa1.calcularImpostoSalario(pessoa1.salarioAnual));
		System.out.printf("Imposto sobre serviços: %.2f\n", pessoa1.calcularImpostoServico(pessoa1.ganhoPrestacaoServico));
		System.out.printf("Imposto sobre capital: %.2f\n", pessoa1.calcularImpostoCapital(pessoa1.ganhoCapital));
		System.out.println("\n* DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f\n", pessoa1.valorImposto * 30 / 100);
		System.out.printf("Gastos dedutíveis: %.2f\n", (pessoa1.gastoMedico + pessoa1.gastoEducacional));
		System.out.println("\n* RESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", pessoa1.calcularImpostoTotal(pessoa1.salarioAnual, pessoa1.ganhoPrestacaoServico, pessoa1.ganhoCapital));
		System.out.printf("Abatimento: %.2f\n", pessoa1.calcularAbatimento(pessoa1.gastoMedico, pessoa1.gastoEducacional));
		System.out.printf("Imposto devido: %.2f\n", pessoa1.calcularImpostoTotal(pessoa1.salarioAnual, pessoa1.ganhoPrestacaoServico, pessoa1.ganhoCapital) - pessoa1.calcularAbatimento(pessoa1.gastoMedico, pessoa1.gastoEducacional));
		
		scanner.close();

	}
}
