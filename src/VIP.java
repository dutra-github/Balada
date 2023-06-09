public class VIP extends Ingresso{
	double valorAdicional = 30.00;

	public double getValorAdicional() {
		return valorAdicional;
	}

	public  void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimeValorVip() {
		System.out.println("Valor do Ingresso VIP R$ "+ (getValorIngresso()+getValorAdicional()));
	}
	
	
	
}

