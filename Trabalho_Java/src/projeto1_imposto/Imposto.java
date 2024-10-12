package projeto1_imposto;

public class Imposto {
	double salarioAnual;
	double ganhoPrestacaoServico;
	double ganhoCapital;
	double gastoMedico;
	double gastoEducacional;
	double valorImposto;
	
	
	public double calcularImpostoSalario(double salarioAnual) {
		this.salarioAnual = salarioAnual;
		double impostoSalario = 0;
		if (3000 <= salarioAnual/12 && salarioAnual/12 < 5000) {
			impostoSalario = (salarioAnual * 10 / 100);
		}
		else if (5000 <= salarioAnual/12) {
			impostoSalario = (salarioAnual * 20 / 100);
		}
		
		return impostoSalario;
	}
	
	
	public double calcularImpostoServico(double ganhoPrestacaoServico) {
		this.ganhoPrestacaoServico = ganhoPrestacaoServico;
		double impostoPrestacaoServico;
		impostoPrestacaoServico = ganhoPrestacaoServico * 15 / 100;
		
		return impostoPrestacaoServico;
	}
	
	
	public double calcularImpostoCapital(double ganhoCapital) {
		this.ganhoCapital = ganhoCapital;
		double impostoCapital;
		impostoCapital = ganhoCapital * 20 / 100;
		
		return impostoCapital;
	}
	
	
	public double calcularAbatimento(double gastoMedico, double gastoEducacional) {
		this.gastoMedico = gastoMedico;
		this.gastoEducacional = gastoEducacional;
		double abatimento;
		if (gastoMedico+gastoEducacional > valorImposto * 30 / 100) {
			abatimento = valorImposto * 30 / 100;
		}
		else {
			abatimento = gastoMedico + gastoEducacional;
		}
		
		return abatimento;
	}
	
	
	public double calcularImpostoTotal(
			double salarioAnual,
			double ganhoPrestacaoServico,
			double ganhoCapital
			) {
		this.salarioAnual = salarioAnual;
		this.ganhoPrestacaoServico = ganhoPrestacaoServico;
		this.ganhoCapital = ganhoCapital;
		valorImposto = 0;
		valorImposto += calcularImpostoSalario(salarioAnual);
		valorImposto += calcularImpostoServico(ganhoPrestacaoServico);
		valorImposto += calcularImpostoCapital(ganhoCapital);
		
		return valorImposto;
	}
}
