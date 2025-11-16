import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroVoo extends JFrame{
    
    public CadastroVoo(){
        super("Cadastrar vôo");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setLayout(null);

        /*Nome */
        JLabel origemLabel = new JLabel("Origem do vôo");
        origemLabel.setBounds(30, -1, 400, 25);
        add(origemLabel);

        JTextField origem = new JTextField("");
        origem.setBounds(30, 20, 220, 25);
        add(origem);

        /*Sobrenome */
        JLabel destinoLabel = new JLabel("Destino do vôo");
        destinoLabel.setBounds(30, 39, 400, 25);
        add(destinoLabel);
        
        JTextField destino = new JTextField("");
        destino.setBounds(30, 60, 220, 25);
        add(destino);

        /*CPF */
        JLabel aviaoLabel = new JLabel("Avião");
        aviaoLabel.setBounds(30, 119, 400, 25);
        add(aviaoLabel);
        
        JTextField aviao = new JTextField();
        aviao.setBounds(30, 140, 220, 25);
        add(aviao);

        JButton confirmar = new JButton("Confirmar cadastro");
        confirmar.setBounds(30, 160, 200,25);
        add(confirmar);

    }
}
