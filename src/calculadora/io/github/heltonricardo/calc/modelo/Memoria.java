package calculadora.io.github.heltonricardo.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

	private static final Memoria instancia = new Memoria();
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	private String texto = "";
	
	private Memoria() {}
	
	public static Memoria getMemoria() {
		return instancia;
	}
	
	public String getTexto() {
		return texto.isEmpty() ? "0" : texto;
	}
	
	public void registrarObservadores(MemoriaObservador obs) {
		observadores.add(obs);
	}
	
	public void processarValor(String valor) {
		if (valor.equalsIgnoreCase("AC"))
			texto = ""; 
		else texto += valor;
		observadores.stream().forEach(o -> o.valorAlterado(getTexto()));
	}
}
