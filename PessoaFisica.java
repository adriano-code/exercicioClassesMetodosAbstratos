package exercicioClassesMetodosAbstratos;

public class PessoaFisica extends Contribuinte{
	
	private double gastoSaude;

	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, double rendaAnual, double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		if(super.getRendaAnual()<20000) {
			return (super.getRendaAnual()*0.15) - (gastoSaude*0.5);
		}else {
			return (super.getRendaAnual()*0.25) - (gastoSaude*0.5);
		}
	}
	
	

}
