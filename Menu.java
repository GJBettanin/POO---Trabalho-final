import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {

    public Menu() {
        super("Menu de passagens aéreas");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Título estilizado
        JLabel titulo = new JLabel("Sistema de Passagens Aéreas", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(0, 51, 102));
        titulo.setBorder(new EmptyBorder(0, 0, 30, 0));

        JTextField campo = new JTextField();
        campo.setBounds(30, 20, 220, 25);
        add(campo);

        JLabel resultado = new JLabel("");
        resultado.setBounds(30, 90, 400, 25);
        add(resultado);

        JButton botao = new JButton("Relatório de vendas");
        botao.setBounds(370, 95, 100, 25);
        add(botao);

        JButton cadastrarAviao = new JButton("Cadastrar avião");
        cadastrarAviao.setBounds(30, 55, 150, 25);
        add(cadastrarAviao);

        JButton comprar = new JButton("Comprar passagem");
        comprar.setBounds(200, 55, 150,25);
        add(comprar);
        
        JButton cadastrarCliente = new JButton("Cadastrar novo cliente");
        cadastrarCliente.setBounds(370, 55, 150,25);
        add(cadastrarCliente);

        
        comprar.addActionListener(e -> {
            new VendaPassagem();
        });

        cadastrarCliente.addActionListener(e -> {
            try {
                new CadastroCliente();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });

        cadastrarAviao.addActionListener(e -> {
            try {
                new CadastroAviao();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });

        comprar.addActionListener(e -> {
            new RelatorioVendas();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}