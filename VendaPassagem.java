import javax.swing.*;

public class VendaPassagem extends JFrame {

    public VendaPassagem() {
        super("Comprar passagem");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setLayout(null);

        /*
         * registra uma venda, 
         * relacionando o cliente, voo e horário da compra,
         * controle da quantidade de assentos.
         */

        JTextField campo = new JTextField("Nome do passageiro");
        campo.setBounds(30, 20, 220, 25);
        add(campo);

        JTextField campo1 = new JTextField("Origem");
        campo1.setBounds(30, 60, 220, 25);
        add(campo1);

        JTextField campo2 = new JTextField("Destino");
        campo2.setBounds(30, 100, 220, 25);
        add(campo2);

        JButton confirmar = new JButton("Confirmar compra");
        confirmar.setBounds(30, 140, 200, 25);
        add(confirmar);

        setVisible(true);
    }
}