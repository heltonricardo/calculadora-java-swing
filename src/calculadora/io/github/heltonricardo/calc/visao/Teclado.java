package calculadora.io.github.heltonricardo.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Teclado extends JPanel {
	
	private final Color CINZA_ESCURO = new Color(68, 69, 68);
	private final Color CINZA_CLARO = new Color(97, 100, 99);
	private final Color LARANJA = new Color(242, 163, 60);

	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		
		setLayout(layout);
		
		adicionarBotao("AC", CINZA_ESCURO, 0, 0);
		adicionarBotao("+/-", CINZA_ESCURO, 0, 1);
		adicionarBotao("%", CINZA_ESCURO, 0, 2);
		adicionarBotao("/", LARANJA, 0, 3);
		
		adicionarBotao("7", CINZA_CLARO, 1, 0);
		adicionarBotao("8", CINZA_CLARO, 1, 1);
		adicionarBotao("9", CINZA_CLARO, 1, 2);
		adicionarBotao("x", LARANJA, 1, 3);
		
		adicionarBotao("4", CINZA_CLARO, 2, 0);
		adicionarBotao("5", CINZA_CLARO, 2, 1);
		adicionarBotao("6", CINZA_CLARO, 2, 2);
		adicionarBotao("-", LARANJA, 2, 3);
		
		adicionarBotao("1", CINZA_CLARO, 3, 0);
		adicionarBotao("2", CINZA_CLARO, 3, 1);
		adicionarBotao("3", CINZA_CLARO, 3, 2);
		adicionarBotao("+", LARANJA, 3, 3);
		
		adicionarBotao("0", CINZA_CLARO, 4, 0);
		adicionarBotao(",", CINZA_CLARO, 4, 2);
		adicionarBotao("=", LARANJA, 4, 3);
		
	}

	private void adicionarBotao(String texto, Color cor, int x, int y) {
		Botao botao = new Botao(texto, cor);
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = y;
		c.gridy = x;
		add(botao, c);
	}
}
