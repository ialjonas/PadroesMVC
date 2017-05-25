package Controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agenda;
import Model.Pessoa;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Controller extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textNumero;

	public Controller() {

		Agenda ag = new Agenda();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(13, 11, 46, 14);
		contentPane.add(lblNome);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(192, 11, 65, 14);
		contentPane.add(lblTelefone);

		textNome = new JTextField();
		textNome.setBounds(13, 30, 170, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);

		textNumero = new JTextField();
		textNumero.setBounds(192, 30, 170, 20);
		contentPane.add(textNumero);
		textNumero.setColumns(10);

		JTextArea textListagem = new JTextArea();
		textListagem.setEditable(false);
		textListagem.setBounds(13, 136, 349, 216);
		contentPane.add(textListagem);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Pessoa p = new Pessoa(textNome.getText(), textNumero.getText());
				textNome.setText("");
				textNumero.setText("");
			}
		});
		btnNewButton.setBounds(76, 61, 100, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = textNome.getText();
				textNumero.setText(ag.buscaTelefone(n));
			}
		});
		btnNewButton_1.setBounds(192, 61, 100, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Listar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textListagem.setText("Nome:       Telefone:\n" + ag.toString());
			}
		});
		btnNewButton_2.setBounds(76, 102, 100, 23);
		contentPane.add(btnNewButton_2);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setText("");
				textNumero.setText("");
				textListagem.setText("");
			}
		});
		btnLimpar.setBounds(192, 102, 100, 23);
		contentPane.add(btnLimpar);
	}
}
