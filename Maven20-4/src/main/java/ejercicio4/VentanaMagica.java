package ejercicio4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextArea;

public class VentanaMagica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea area;
	private JLabel lblNewLabel;
	private WindowListener ventana;
	
	public VentanaMagica() {
		setTitle("Ventana mágica");
		setBounds(650, 300, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		System.out.println(contentPane);

		lblNewLabel = new JLabel("La ventana mágica");
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 17));
		lblNewLabel.setBounds(153, 31, 157, 56);
		contentPane.add(lblNewLabel);

        area = new JTextArea();
        area.setBackground(new Color(250, 235, 215));
        area.setEditable(false);
        area.setBounds(46, 89, 394, 334);
        contentPane.add(area);
        repaint();
  		
		scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(500, 450));
        getContentPane().add(scrollPane, BorderLayout.CENTER);
       
        	 ventana = new WindowListener() {
        	
			@Override
			public void windowActivated(WindowEvent arg0) {
				area.append("Estoy activa.\n");
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				area.append("Me voy.\n");
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				area.append("Intenta cerrar la ventana ¿verdad?\n");
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				area.append("¡Ey! atiéndeme. No me prestas atención...\n");	
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				area.append("Gracias por restaurarme.\n");
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				area.append("Me escondo, así no molesto. Está bien minimizarse a veces.\n");
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				area.append("¡Ey! Ya estoy aquí ¿Qué tal?\n");
			}
        };
        this.addWindowListener(ventana);

		addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent arg0) {
				resize(arg0);
			}
			private void resize(WindowEvent e) {
				if((e.getNewState() & Frame.MAXIMIZED_BOTH) == Frame.MAXIMIZED_BOTH) {
					area.setText(area.getText() + "¡He aumentado de tamaño! \n");
				}else if ((e.getNewState()) == Frame.NORMAL) {
					area.setText(area.getText() + "Este es mi tamaño original ¿Te gusta? \n");
				}
			}
		});
	}

}