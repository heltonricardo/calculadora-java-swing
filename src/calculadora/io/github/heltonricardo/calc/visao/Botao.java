package calculadora.io.github.heltonricardo.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {

	public Botao(String texto, Color cor) {
		setText(texto);
		setFont(new Font("courier", Font.PLAIN, 25));
		setOpaque(true);
		setForeground(Color.WHITE);
		setBackground(cor);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}
