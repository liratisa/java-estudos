package entities;

public class PessoaFisica extends Contribuinte {
	
	private Double gastoSaude;
	
	public PessoaFisica() {		
	}	

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double calculoImposto() {
		double imposto;
		
		if(rendaAnual < 20000.00) {
			imposto = rendaAnual * 0.15;
		} else {
			imposto = rendaAnual * 0.25;
		}
		
		if(gastoSaude > 0.00) {
			imposto -= gastoSaude * 0.5;
		}
		
		return imposto;
	}

}
