package calculadora.io.github.heltonricardo.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando {
		ZERAR, ALTER, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA
	};
	
	private static final Memoria instancia = new Memoria();
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	private String textoAtual = "";
	
	private Memoria() {}
	
	public static Memoria getMemoria() {
		return instancia;
	}
	
	public String getTexto() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	public void registrarObservadores(MemoriaObservador obs) {
		observadores.add(obs);
	}
	
	private TipoComando detectarTipo(String textoBotao) {
		if(textoAtual.isEmpty() && textoBotao == "0")
			return null;
		
		try {
			Integer.parseInt(textoBotao);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			if (textoBotao.equalsIgnoreCase("AC"))
				return TipoComando.ZERAR;
			if (textoBotao.equalsIgnoreCase("+"))
				return TipoComando.SOMA;
			if (textoBotao.equalsIgnoreCase("-"))
				return TipoComando.SUB;
			if (textoBotao.equalsIgnoreCase("×"))
				return TipoComando.MULT;
			if (textoBotao.equalsIgnoreCase("÷"))
				return TipoComando.DIV;
			if (textoBotao.equalsIgnoreCase(","))
				return TipoComando.VIRGULA;
			if (textoBotao.equalsIgnoreCase("±"))
				return TipoComando.ALTER;
			if (textoBotao.equalsIgnoreCase("="))
				return TipoComando.IGUAL;
		}
		return null;
	}
	
	public void processarValor(String textoBotao) {
		TipoComando tipo = detectarTipo(textoBotao);
		System.out.println(tipo);
		textoAtual += textoBotao;
		observadores.stream().forEach(o -> o.valorAlterado(getTexto()));
	}
}
