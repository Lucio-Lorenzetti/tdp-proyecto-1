package gui;

import java.time.LocalDateTime;


import java.awt.BorderLayout;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.Toolkit;
import java.util.Date;
import java.awt.Panel;
import java.awt.Color;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JPanel panelFoto;
	private JLabel labelLU;
	private JLabel labelApellido;
	private JLabel labelEmail;
	private JLabel labelGitHub;
	private JLabel labelNombre;
	private JTextField textFieldLU;
	private JTextField textFieldAp;
	private JTextField textFieldNom;
	private JTextField textFieldEm;
	private JTextField textFieldGit;
	private JLabel labelHora;
	private Date Fecha = new Date();
	private JLabel foto;
	
	public SimplePresentationScreen(Student studentData) {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 280));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 221);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		labelGitHub = new JLabel("Github URL");
		labelGitHub.setFont(new Font("Arial", Font.BOLD, 14));
		labelGitHub.setBounds(10, 155, 90, 25);
		tabInformation.add(labelGitHub);
		
		labelEmail = new JLabel("E-mail");
		labelEmail.setFont(new Font("Arial", Font.BOLD, 14));
		labelEmail.setBounds(10, 119, 90, 25);
		tabInformation.add(labelEmail);
		
		labelNombre = new JLabel("Nombre");
		labelNombre.setFont(new Font("Arial", Font.BOLD, 14));
		labelNombre.setBounds(10, 83, 90, 25);
		tabInformation.add(labelNombre);
		
		labelApellido = new JLabel("Apellido");
		labelApellido.setFont(new Font("Arial", Font.BOLD, 14));
		labelApellido.setBounds(10, 47, 90, 25);
		tabInformation.add(labelApellido);
		
		labelLU = new JLabel("LU");
		labelLU.setFont(new Font("Arial", Font.BOLD, 14));
		labelLU.setBounds(10, 11, 90, 25);
		tabInformation.add(labelLU);
		
		textFieldLU = new JTextField();
		textFieldLU.setBounds(131, 14, 284, 20);
		tabInformation.add(textFieldLU);
		textFieldLU.setColumns(10);
		textFieldLU.setText(String.valueOf(studentData.getId()));
		
		textFieldAp = new JTextField();
		textFieldAp.setBounds(131, 52, 284, 20);
		tabInformation.add(textFieldAp);
		textFieldAp.setColumns(10);
		textFieldAp.setText(studentData.getLastName());
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(131, 86, 284, 20);
		tabInformation.add(textFieldNom);
		textFieldNom.setColumns(10);
		textFieldNom.setText(studentData.getFirstName());
		
		textFieldEm = new JTextField();
		textFieldEm.setBounds(131, 122, 284, 20);
		tabInformation.add(textFieldEm);
		textFieldEm.setColumns(10);
		textFieldEm.setText(studentData.getMail());
		
		textFieldGit = new JTextField();
		textFieldGit.setBounds(131, 158, 284, 20);
		tabInformation.add(textFieldGit);
		textFieldGit.setColumns(10);
		contentPane.add(tabbedPane);
		textFieldGit.setText(studentData.getGithubURL());
		
		String dia = LocalDateTime.now().getDayOfMonth()+"/"+LocalDateTime.now().getMonthValue()+"/"+LocalDateTime.now().getYear();
		String hora = LocalDateTime.now().getHour()+" : "+LocalDateTime.now().getMinute()+" : "+LocalDateTime.now().getSecond();
		labelHora = new JLabel("Esta ventana fue generada el dia "+dia+" a las "+hora);
		labelHora.setBounds(15, 228, 420, 12);
		labelHora.setFont(new Font("Arial", Font.BOLD, 11));
		contentPane.add(labelHora);
		
		
		panelFoto = new JPanel();
		panelFoto.setLocation(445, 52);
		panelFoto.setSize(140, 140);
		panelFoto.setBackground(Color.RED);
		contentPane.add(panelFoto);
		panelFoto.setLayout(null);
		
		ImageIcon fot = new ImageIcon(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/yo.jpeg")));
		
		foto = new JLabel();
		foto.setBounds(0, 0, 140, 140);
		Icon icono = new ImageIcon(fot.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
		foto.setIcon(icono);
		panelFoto.add(foto);
		
		
				
		
	}
}
