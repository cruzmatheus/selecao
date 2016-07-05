package selecao;

import java.util.Calendar;

import br.com.digithobrasil.selecao.enumerations.CargoEnum;
import br.com.digithobrasil.selecao.model.Colaborador;
import br.com.digithobrasil.selecao.model.DadosBancarios;

public class ColaboradorFactory {
	
	public static Colaborador buildColaborador() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 2);
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.YEAR, 1992);
		
		DadosBancarios dadosBancarios = new DadosBancarios("033", "8833", "723212-3");
		
		Colaborador colaborador = new Colaborador
				("Matheus", CargoEnum.valueOf("DEV").getChave(), "1234", cal.getTime(),
				 "7323133", "999.233.321-73", "matheus@gmail.com", "(91)3213-8883", dadosBancarios);
		
		return colaborador;
	}

}
