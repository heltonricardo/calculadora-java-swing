package calculadora.io.github.heltonricardo.calc.modelo;

public class Memoria {

	private static final Memoria instancia = new Memoria();
	private String texto = "";
	
	private Memoria() {}
	
	public static Memoria getMemoria() {
		return instancia;
	}
	
	public String getTexto() {
		return texto.isEmpty() ? "0" : texto;
	}
}
