import java.awt.event.*; 
import java.io.File; 
import javax.swing.*;

public class Menu extends JFrame {
    
    public Menu(){
        super("Compra de passagens aéreas");
        setSize(800, 600); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(null);
         
        JTextField campo = new JTextField(); 
        campo.setBounds(30, 20, 220, 25); 
        add(campo);

        JButton comprar = new JButton("Compra de passagem");
        comprar.setBounds(30,55,100,25);
        add(comprar);

        comprar.addActionListener(e -> {
            new ComprarPassagem();
        });

        JButton consulta = new JButton("Consultar vôos"); 
        consulta.setBounds(150, 55, 100, 25); 
        add(consulta);

        setVisible(true);

    }

    public static void main(String[] args){
        new Menu();
    }

}

//fazer método que traz todos os dados do arquivo para a memoria
//só se faz pesquisa em memória
