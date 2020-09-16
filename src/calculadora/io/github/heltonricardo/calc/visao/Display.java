package calculadora.io.github.heltonricardo.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import calculadora.io.github.heltonricardo.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Display extends JPanel {

	private final JLabel label;
	
	public Display() {
		setBackground(new Color(46, 49, 50));
		
		label = new JLabel(Memoria.getMemoria().getTexto());
		label.setFont(new Font("courier", Font.PLAIN, 30));
		label.setForeground(Color.WHITE);
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 20));
		
		add(label);
	}
}
