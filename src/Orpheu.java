// Tela inicial do sistema Dom Art
// DomArtSystem.java

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.JSeparator;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;



// Início da classe DomArtSystem
public class Orpheu extends JFrame 
{

	private JPanel contentPane;

	
	// Início método main
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Orpheu frame = new Orpheu();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
			    }
		    }
	     });
    } // Fim do método main

	// Início do construtor Orpheu
	public Orpheu() 
	{
		setResizable(false);
	
		// Criação do Frame 
		setTitle("Orpheu");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Orpheu.class.getResource("/img/DomArt.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 461);
		
		// Criação da barra do menu superior da tela
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Arial", Font.BOLD, 17));
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBackground(new Color(0, 128, 128));
		setJMenuBar(menuBar);
		
		// Criação do menu item Cadastrar
		JMenu mnCadastrar = new JMenu("Cadastrar");
		mnCadastrar.setBackground(new Color(255, 255, 255));
		mnCadastrar.setFont(new Font("Arial", Font.BOLD, 15));
		mnCadastrar.setForeground(new Color(255, 255, 255));
		menuBar.add(mnCadastrar);
		
		// Criação do menu item Aluno da guia Cadastrar
		JMenuItem mntmAluno = new JMenuItem("Aluno");
		mntmAluno.setBackground(new Color(0, 139, 139));
		mntmAluno.setForeground(new Color(255, 255, 255));
		mntmAluno.setFont(new Font("Arial", Font.BOLD, 14));
		mnCadastrar.add(mntmAluno);
		
		// Criação do separdor de item do menu superior da tela
		JSeparator separator_2 = new JSeparator();
		mnCadastrar.add(separator_2);
		
		// Criação do menu item Fornecedor
		JMenuItem mntmNewMenuItem = new JMenuItem("Fornecedor");
		mntmNewMenuItem.setBackground(new Color(0, 139, 139));
		mntmNewMenuItem.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem.setFont(new Font("Arial", Font.BOLD, 14));
		mnCadastrar.add(mntmNewMenuItem);
		
		// Criação do separdor de item do menu 
		JSeparator separator_3 = new JSeparator();
		mnCadastrar.add(separator_3);
		
		// Configuração fonte e background item menu 
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Funcion\u00E1rio");
		mntmNewMenuItem_1.setBackground(new Color(0, 139, 139));
		mntmNewMenuItem_1.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.BOLD, 14));
		mnCadastrar.add(mntmNewMenuItem_1);
		
		// Criação do separdor de item do menu
		JSeparator separator_4 = new JSeparator();
		mnCadastrar.add(separator_4);
		
		// Criação do menu item Professor
		JMenuItem mntmProfessor = new JMenuItem("Professor");
		mntmProfessor.setBackground(new Color(0, 139, 139));
		mntmProfessor.setForeground(new Color(255, 255, 255));
		mntmProfessor.setFont(new Font("Arial", Font.BOLD, 14));
		mnCadastrar.add(mntmProfessor);
		
		// Criação do separdor de item do menu 
		JSeparator separator_5 = new JSeparator();
		mnCadastrar.add(separator_5);
		
		// Criação do menu item Produto
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mntmProduto.setBackground(new Color(0, 139, 139));
		mntmProduto.setForeground(new Color(255, 255, 255));
		mntmProduto.setFont(new Font("Arial", Font.BOLD, 14));
		mnCadastrar.add(mntmProduto);
		
		// Criação do separdor de item do menu 
		JSeparator separator = new JSeparator();
		mnCadastrar.add(separator);
		
		// Criação do menu item Outros
		JMenu mnNewMenu = new JMenu("Outros");
		mnNewMenu.setBackground(new Color(0, 139, 139));
		mnNewMenu.setForeground(new Color(0, 139, 139));
		mnNewMenu.setFont(new Font("Arial", Font.BOLD, 14));
		mnCadastrar.add(mnNewMenu);
		
		// Criação do menu item Cargo
		JMenuItem mntmCargo = new JMenuItem("Cargo");
		mntmCargo.setBackground(new Color(0, 139, 139));
		mntmCargo.setForeground(new Color(255, 255, 255));
		mntmCargo.setFont(new Font("Arial", Font.BOLD, 14));
		mnNewMenu.add(mntmCargo);
		
		// Criação do separdor de item do menu 
		JSeparator separator_15 = new JSeparator();
		mnNewMenu.add(separator_15);
		
		// Criação do menu item Instrumento
		JMenuItem mntmInstrumento = new JMenuItem("Instrumento");
		mntmInstrumento.setBackground(new Color(0, 139, 139));
		mntmInstrumento.setForeground(new Color(255, 255, 255));
		mntmInstrumento.setFont(new Font("Arial", Font.BOLD, 14));
		mnNewMenu.add(mntmInstrumento);
		
		// Criação do menu item Consultas
		JMenu mnNewMenu_1 = new JMenu("Consultas");
		mnNewMenu_1.setForeground(new Color(255, 255, 255));
		mnNewMenu_1.setFont(new Font("Arial", Font.BOLD, 15));
		mnNewMenu_1.setBackground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_1);
		
		// Criação do menu item Cursos
		JMenuItem mntmCursos = new JMenuItem("Cursos");
		mntmCursos.setFont(new Font("Arial", Font.BOLD, 14));
		mntmCursos.setForeground(new Color(255, 255, 255));
		mntmCursos.setBackground(new Color(0, 139, 139));
		mnNewMenu_1.add(mntmCursos);
		
		// Criação do separdor de item do menu
		JSeparator separator_1 = new JSeparator();
		mnNewMenu_1.add(separator_1);
		
		// Configuração fonte e background item menu
		JMenu mnPresenas = new JMenu("Presen\u00E7as");
		mnPresenas.setFont(new Font("Arial", Font.BOLD, 14));
		mnPresenas.setForeground(new Color(0, 139, 139));
		mnPresenas.setBackground(new Color(0, 139, 139));
		mnNewMenu_1.add(mnPresenas);
		
		// Criação do menu item Aluno
		JMenuItem mntmAluno_1 = new JMenuItem("Aluno");
		mntmAluno_1.setBackground(new Color(0, 139, 139));
		mntmAluno_1.setFont(new Font("Arial", Font.BOLD, 14));
		mntmAluno_1.setForeground(new Color(255, 255, 255));
		mnPresenas.add(mntmAluno_1);
		
		// Criação do separdor de item do menu 
		JSeparator separator_13 = new JSeparator();
		mnPresenas.add(separator_13);
		
		// Configuração fonte e background item menu
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Funcion\u00E1rio");
		mntmNewMenuItem_2.setBackground(new Color(0, 139, 139));
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.BOLD, 14));
		mntmNewMenuItem_2.setForeground(new Color(255, 255, 255));
		mnPresenas.add(mntmNewMenuItem_2);
		
		// Criação do separdor de item do menu 
		JSeparator separator_14 = new JSeparator();
		mnPresenas.add(separator_14);
		
		// Criação do menu item Professor
		JMenuItem mntmProfessor_1 = new JMenuItem("Professor");
		mntmProfessor_1.setBackground(new Color(0, 139, 139));
		mntmProfessor_1.setFont(new Font("Arial", Font.BOLD, 14));
		mntmProfessor_1.setForeground(new Color(255, 255, 255));
		mnPresenas.add(mntmProfessor_1);
		
		// Criação do menu item Agendamentos
		JMenu mnNewMenu_2 = new JMenu("Agendamentos");
		mnNewMenu_2.setBackground(new Color(255, 255, 255));
		mnNewMenu_2.setForeground(new Color(255, 255, 255));
		mnNewMenu_2.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnNewMenu_2);
		
		// Criação do menu item Eventos
		JMenuItem mntmEventos = new JMenuItem("Eventos");
		mntmEventos.setBackground(new Color(0, 139, 139));
		mntmEventos.setForeground(new Color(255, 255, 255));
		mntmEventos.setFont(new Font("Arial", Font.BOLD, 14));
		mnNewMenu_2.add(mntmEventos);
		
		// Criação do separdor de item do menu 
		JSeparator separator_6 = new JSeparator();
		mnNewMenu_2.add(separator_6);
		
		// Criação do menu item Provas
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Provas");
		mntmNewMenuItem_3.setBackground(new Color(0, 139, 139));
		mntmNewMenuItem_3.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem_3.setFont(new Font("Arial", Font.BOLD, 14));
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		// Criação do menu item Caixa
		JMenu mnNewMenu_3 = new JMenu("Caixa");
		mnNewMenu_3.setBackground(new Color(255, 255, 255));
		mnNewMenu_3.setForeground(new Color(255, 255, 255));
		mnNewMenu_3.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnNewMenu_3);
		
		// Criação do menu item Contas
		JMenuItem mntmConta = new JMenuItem("Contas");
		mntmConta.setForeground(new Color(255, 255, 255));
		mntmConta.setFont(new Font("Arial", Font.BOLD, 14));
		mntmConta.setBackground(new Color(0, 139, 139));
		mnNewMenu_3.add(mntmConta);
		
		// Criação do separdor de item do menu 
		JSeparator separator_7 = new JSeparator();
		mnNewMenu_3.add(separator_7);
		
		// Criação do menu item Vendas
		JMenuItem mntmVendas = new JMenuItem("Vendas");
		mntmVendas.setForeground(new Color(255, 255, 255));
		mntmVendas.setFont(new Font("Arial", Font.BOLD, 14));
		mntmVendas.setBackground(new Color(0, 139, 139));
		mnNewMenu_3.add(mntmVendas);
		
		// Criação do separdor de item do menu 
		JSeparator separator_8 = new JSeparator();
		mnNewMenu_3.add(separator_8);
		
		// Criação do menu item Mensalidade
		JMenuItem mntmMensalidades = new JMenuItem("Mensalidades");
		mntmMensalidades.setForeground(new Color(255, 255, 255));
		mntmMensalidades.setFont(new Font("Arial", Font.BOLD, 14));
		mntmMensalidades.setBackground(new Color(0, 139, 139));
		mnNewMenu_3.add(mntmMensalidades);
		
		// Criação do menu item Ferramentas
		JMenu mnNewMenu_4 = new JMenu("Ferramentas");
		mnNewMenu_4.setBackground(new Color(255, 255, 255));
		mnNewMenu_4.setForeground(new Color(255, 255, 255));
		mnNewMenu_4.setFont(new Font("Arial", Font.BOLD, 15));
		menuBar.add(mnNewMenu_4);
		
		// Configuração fonte e background item menu
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Configura\u00E7\u00F5es");
		mntmNewMenuItem_4.setBackground(new Color(0, 139, 139));
		mntmNewMenuItem_4.setFont(new Font("Arial", Font.BOLD, 14));
		mntmNewMenuItem_4.setForeground(new Color(255, 255, 255));
		mnNewMenu_4.add(mntmNewMenuItem_4);
		
		// Criação do separdor de item do menu 
		JSeparator separator_9 = new JSeparator();
		mnNewMenu_4.add(separator_9);
		
		// Configuração fonte e background item menu
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Usu\u00E1rios");
		mntmNewMenuItem_5.setBackground(new Color(0, 139, 139));
		mntmNewMenuItem_5.setFont(new Font("Arial", Font.BOLD, 14));
		mntmNewMenuItem_5.setForeground(new Color(255, 255, 255));
		mnNewMenu_4.add(mntmNewMenuItem_5);
		
		// Criação do separdor de item do menu 
		JSeparator separator_10 = new JSeparator();
		mnNewMenu_4.add(separator_10);
		
		// Configuração fonte e background item menu
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Esquema");
		mntmNewMenuItem_6.setBackground(new Color(0, 139, 139));
		mntmNewMenuItem_6.setFont(new Font("Arial", Font.BOLD, 14));
		mntmNewMenuItem_6.setForeground(new Color(255, 255, 255));
		mnNewMenu_4.add(mntmNewMenuItem_6);
		
		// Criação do separdor de item do menu 
		JSeparator separator_11 = new JSeparator();
		mnNewMenu_4.add(separator_11);
		
		// Criação do item menu Backup
		JMenuItem mntmBackup = new JMenuItem("Backup");
		mntmBackup.setBackground(new Color(0, 139, 139));
		mntmBackup.setFont(new Font("Arial", Font.BOLD, 14));
		mntmBackup.setForeground(new Color(255, 255, 255));
		mnNewMenu_4.add(mntmBackup);
		
		// Criação do separdor de item do menu 
		JSeparator separator_12 = new JSeparator();
		mnNewMenu_4.add(separator_12);
		
		// Criação do menu item Limpeza
		JMenuItem mntmLimpeza = new JMenuItem("Limpeza");
		mntmLimpeza.setBackground(new Color(0, 139, 139));
		mntmLimpeza.setFont(new Font("Arial", Font.BOLD, 14));
		mntmLimpeza.setForeground(new Color(255, 255, 255));
		mnNewMenu_4.add(mntmLimpeza);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Criação JLabel para iamgem de fundo da tela 
		JLabel Fundo = new JLabel("");
		Fundo.setBounds(0, -21, 584, 432);
		Fundo.setEnabled(false);
		contentPane.add(Fundo);
		
		// Configuração da imagem para ajustar de acordo com JLabel Fundo
		ImageIcon imagem = new ImageIcon(Orpheu.class.getResource("/img/fundo.jpg"));
		Image img = imagem.getImage().getScaledInstance(Fundo.getWidth(), Fundo.getHeight(), Image.SCALE_SMOOTH);
		Fundo.setIcon(new ImageIcon(img));
		
	}// Fim do Construtor Orpheu
}// Fim da classe Orpheu
