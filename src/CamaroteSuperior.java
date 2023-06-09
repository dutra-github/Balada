public class CamaroteSuperior extends VIP {
	private double valorAdCamSuperior = 20.00;
	
	public double getvalorAdCamSuperior() {
		return valorAdCamSuperior;
	}
	public void setvalorAdCamSuperior(double valorAdCamSuperior) {
		this.valorAdCamSuperior=valorAdCamSuperior;
	}
	public void localIngresso() {
		System.out.println("Camarote Superior");
	}
	public void valorCamSuper() {
		
		System.out.println("Valor Total : R$" + (getValorIngresso() + getValorAdicional() + getvalorAdCamSuperior()));
		
	}
}
