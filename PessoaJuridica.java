package exercicioClassesMetodosAbstratos;

public class PessoaJuridica extends Contribuinte {

	private int numFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, double rendaAnual, int numFuncionarios) {
		super(name, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double imposto() {
		if ( numFuncionarios > 10) {
			return (super.getRendaAnual() * 0.14);
		} else {
			return (super.getRendaAnual() * 0.16);
		}

	}

}
