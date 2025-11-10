import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ComprarPassagem extends JFrame {

    public ComprarPassagem() {
        super("Comprar passagem");
        setSize(500, 650);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setLayout(null);

        JLabel resultado = new JLabel("Nome do passageiro"); 
        resultado.setBounds(30, 15, 220, 25); 
        add(resultado);
        
        JTextField nome = new JTextField("");
        nome.setBounds(30, 35, 220, 25);
        add(nome);

        JLabel sobrenomeLabel = new JLabel("Sobrenome do passageiro"); 
        sobrenomeLabel.setBounds(30, 75, 220, 25); 
        add(sobrenomeLabel);
        
        JTextField sobrenome = new JTextField("");
        sobrenome.setBounds(30, 115, 220, 25);
        add(sobrenome);

        JLabel origemLabel = new JLabel("Origem"); 
        origemLabel.setBounds(30, 155, 220, 25); 
        add(origemLabel);
        
        JTextField origem = new JTextField("");
        origem.setBounds(30, 195, 220, 25);
        add(origem);

        JLabel destinoLabel = new JLabel("Destino"); 
        destinoLabel.setBounds(30, 235, 220, 25); 
        add(destinoLabel);
        
        JTextField destino = new JTextField("");
        destino.setBounds(30, 275, 220, 25);
        add(destino);

        JLabel companhiaLabel = new JLabel("COmpanhia"); 
        companhiaLabel.setBounds(30, 315, 220, 25); 
        add(companhiaLabel);
        
        JTextField companhia = new JTextField("");
        companhia.setBounds(30, 345, 220, 25);
        add(companhia);

        JButton confirmar = new JButton("Confirmar compra");
        confirmar.setBounds(30, 395, 200, 25);
        add(confirmar);

        confirmar.addActionListener(e -> {
            System.out.printf("Dados do voo: %s %s; %s -> %s%n",
                nome.getText(), sobrenome.getText(),
                origem.getText(), destino.getText());
        });

        setVisible(true);
    }
}