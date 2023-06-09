import java.awt.image.DataBufferDouble;

import javax.swing.JOptionPane;

public class TesteBalada {

	public static void main(String[] args) {

		int tipoIngresso = Integer
				.parseInt(JOptionPane.showInputDialog("Qual o tipo de Ingresso?\n1 - Normal\n2 - VIP"));
		Normal n = new Normal();
		switch (tipoIngresso) {
		case 1: {
			n.IngressoNormal();
			// System.out.println("");
			n.imprimeValor();
			break;
		}
		case 2: {
			int tipoIngressoVip = Integer
					.parseInt(JOptionPane.showInputDialog("Selecione o Camarote : \n 1 - Superior\n 2 - Inferior"));

			switch (tipoIngressoVip) {
			case 1: {
				CamaroteSuperior cs = new CamaroteSuperior();
				cs.localIngresso();
				// System.out.println("");
				cs.valorCamSuper();
				break;
			}
			case 2:
				VIP vipinf = new VIP();
				CamaroteInferior caminf = new CamaroteInferior();
				caminf.dadosImgresso();
				// System.out.println("");
				vipinf.imprimeValorVip();
				break;

			}

		}
		}
	}
}