package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Miventana {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Miventana window = new Miventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Miventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código Departamento:");
		lblNewLabel.setFont(new Font("Arial Black", lblNewLabel.getFont().getStyle(), lblNewLabel.getFont().getSize()));
		lblNewLabel.setBounds(59, 60, 134, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnInsertarDatos = new JButton("Insertar Datos");
		btnInsertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			
			{
				
				System.out.println("SE HA PULSADO EL BOTON INSERTAR");
			}
		});
		btnInsertarDatos.setFont(new Font("Arial Black", btnInsertarDatos.getFont().getStyle(), btnInsertarDatos.getFont().getSize()));
		btnInsertarDatos.setBounds(66, 214, 134, 23);
		frame.getContentPane().add(btnInsertarDatos);
		
		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				System.out.println("SE HA PULSADO EL BOTON LIMPIAR");
				 textField_1.setText(null);
				 textField_2.setText(null);
				 textField.setText(null);
			}
		});
		btnLimpiarDatos.setFont(new Font("Arial Black", btnLimpiarDatos.getFont().getStyle(), btnLimpiarDatos.getFont().getSize()));
		btnLimpiarDatos.setBounds(236, 214, 134, 23);
		frame.getContentPane().add(btnLimpiarDatos);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Departamento:");
		lblNewLabel_1.setFont(new Font("Arial Black", lblNewLabel_1.getFont().getStyle(), lblNewLabel_1.getFont().getSize()));
		lblNewLabel_1.setBounds(59, 96, 145, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Localidad Departamento:");
		lblNewLabel_2.setFont(new Font("Arial Black", lblNewLabel_2.getFont().getStyle(), lblNewLabel_2.getFont().getSize()));
		lblNewLabel_2.setBounds(59, 137, 155, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(222, 94, 134, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(222, 135, 134, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		textField.setBackground(new Color(221, 160, 221));
		textField.setBounds(222, 58, 77, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel_3.setForeground(new Color(0, 0, 255));
		lblNewLabel_3.setFont(new Font("Arial Black", lblNewLabel_3.getFont().getStyle(), 15));
		lblNewLabel_3.setBounds(93, 11, 258, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 153));
		panel.setBounds(22, 43, 390, 153);
		frame.getContentPane().add(panel);
	}
}
