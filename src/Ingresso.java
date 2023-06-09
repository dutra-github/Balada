public class Ingresso  {
	private double valorIngresso=50.00;
	 
	
	public double getValorIngresso() {
		return valorIngresso;
	}


	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}


	public void imprimeValor() {
		System.out.println("Valor Ingresso R$ "+ getValorIngresso());
	}
	
}
