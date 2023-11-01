package ejercicio6;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculoIMC extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel altura;
	private JLabel peso;
	private JButton imc;
	private JTextField textAltura;
	private JTextField textPeso;
	private JTextField textIMC;
	
	public CalculoIMC() {
		setTitle("IMC");
		setBounds(650, 300, 400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		System.out.println(contentPane);
		
		altura = new JLabel();
		altura.setFont(new Font("Tahoma", Font.PLAIN, 12));
		altura.setText("Altura(m.)");
		altura.setForeground(new Color(0, 100, 0));
		altura.setBounds(96, 25, 62, 23);
		altura.setVisible(true);
		contentPane.add(altura);

		peso = new JLabel();
		peso.setText("Peso(kg.)");
		peso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		peso.setForeground(new Color(0, 100, 0));
		peso.setBounds(219, 25, 62, 23);
		peso.setVisible(true);
		contentPane.add(peso);

		imc = new JButton("Calcular IMC");
		imc.setFont(new Font("Tahoma", Font.BOLD, 11));
		imc.setForeground(new Color(230, 230, 250));
		imc.setBackground(new Color(0, 128, 0));
		imc.setBounds(72, 88, 112, 23);
		contentPane.add(imc);
		
		textAltura = new JTextField();
		textAltura.setForeground(new Color(0, 102, 0));
		textAltura.setFont(new Font("Tahoma", Font.BOLD, 12));
		textAltura.setBounds(96, 59, 62, 14);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		textPeso = new JTextField();
		textPeso.setForeground(new Color(0, 102, 0));
		textPeso.setFont(new Font("Tahoma", Font.BOLD, 12));
		textPeso.setBounds(219, 59, 62, 14);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		textIMC = new JTextField();
		textIMC.setForeground(new Color(0, 102, 0));
		textIMC.setFont(new Font("Tahoma", Font.BOLD, 12));
		textIMC.setBounds(198, 89, 112, 23);
		contentPane.add(textIMC);
		textIMC.setColumns(10);
		
		ActionListener calcular=new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent e) {	
				double kg = Double.parseDouble(textPeso.getText());
				double cm = Double.parseDouble(textAltura.getText());
				double result = kg / (cm*cm);
			    textIMC.setText(String.format("%.2f", result));
			}
		};
		imc.addActionListener(calcular);
	}
	
}