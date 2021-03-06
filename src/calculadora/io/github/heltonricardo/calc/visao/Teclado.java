package calculadora.io.github.heltonricardo.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import calculadora.io.github.heltonricardo.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {
	
	private final Color CINZA_ESCURO = new Color(68, 69, 68);
	private final Color CINZA_CLARO = new Color(97, 100, 99);
	private final Color LARANJA = new Color(242, 163, 60);

	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		setBackground(Color.BLACK);
		
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		c.gridwidth = 2;
		adicionarBotao("AC", CINZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;
		adicionarBotao("+/-", CINZA_ESCURO, c, 0, 2);
		adicionarBotao("/", LARANJA, c, 0, 3);
		
		adicionarBotao("7", CINZA_CLARO, c, 1, 0);
		adicionarBotao("8", CINZA_CLARO, c, 1, 1);
		adicionarBotao("9", CINZA_CLARO, c, 1, 2);
		adicionarBotao("*", LARANJA, c, 1, 3);
		
		adicionarBotao("4", CINZA_CLARO, c, 2, 0);
		adicionarBotao("5", CINZA_CLARO, c, 2, 1);
		adicionarBotao("6", CINZA_CLARO, c, 2, 2);
		adicionarBotao("-", LARANJA, c, 2, 3);
		
		adicionarBotao("1", CINZA_CLARO, c, 3, 0);
		adicionarBotao("2", CINZA_CLARO, c, 3, 1);
		adicionarBotao("3", CINZA_CLARO, c, 3, 2);
		adicionarBotao("+", LARANJA, c, 3, 3);
		
		c.gridwidth = 2;
		adicionarBotao("0", CINZA_CLARO, c, 4, 0);
		c.gridwidth = 1;
		adicionarBotao(",", CINZA_CLARO, c, 4, 2);
		adicionarBotao("=", LARANJA, c, 4, 3);
		
	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		Botao botao = new Botao(texto, cor);
		c.gridx = y;
		c.gridy = x;
		botao.addActionListener(this);
		add(botao, c);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			Memoria.getMemoria().processarValor(botao.getText());
		}
	}
}
