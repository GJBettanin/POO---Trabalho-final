import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroAviao extends JFrame{

     public CadastroAviao(){
        super("Cadastro de avião");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setLayout(null);

        /*Código do avião */
        JLabel codigoLabel = new JLabel("Codigo");
        codigoLabel.setBounds(30, -1, 400, 25);
        add(codigoLabel);

        JTextField codigo = new JTextField("");
        codigo.setBounds(30, 20, 220, 25);
        add(codigo);

        /*Nome */
        JLabel nomeLabel = new JLabel("Nome do avião");
        nomeLabel.setBounds(30, 39, 400, 25);
        add(nomeLabel);
        
        JTextField nome = new JTextField("");
        nome.setBounds(30, 60, 220, 25);
        add(nome);

        /*Assentos */
        JLabel assentosLabel = new JLabel("Quantidade de assentos");
        assentosLabel.setBounds(30, 79, 400, 25);
        add(assentosLabel);
        
        JFormattedTextField assentos = new JFormattedTextField(NumberFormat.getIntegerInstance());
        assentos.setBounds(30, 100, 220, 25);
        assentos.setValue(0);
        add(assentos);

        /*Confirmar cadastro */
        JButton confirmar = new JButton("Confirmar cadastro");
        confirmar.setBounds(30, 180, 200, 25);
        add(confirmar);

        
        confirmar.addActionListener(e -> {

            JFileChooser fileChooser = new JFileChooser();
            int resultado = fileChooser.showOpenDialog(null);

            if(resultado == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();

                Aviao aviao = new Aviao(
                    codigo.getText(),
                    nome.getText(),
                    ((Number) assentos.getValue()).intValue()
                );

                try(FileWriter writer = new FileWriter(file, true)){
                    writer.write("\nCódigo "+ aviao.getCodigo()  + 
                            ", Nome " + aviao.getNome() +
                            ", Assentos " + aviao.getAssentos()
                    );
                } catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }

        });

        setVisible(true);
    }
}

