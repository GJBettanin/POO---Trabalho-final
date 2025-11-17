
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroCliente extends JFrame {
    
    public CadastroCliente() throws IOException{
        super("Cadastro de cliente");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setLayout(null);

        /*Nome */
        JLabel nomeLabel = new JLabel("Nome do cliente");
        nomeLabel.setBounds(30, -1, 400, 25);
        add(nomeLabel);

        JTextField nome = new JTextField("");
        nome.setBounds(30, 20, 220, 25);
        add(nome);

        /*Sobrenome */
        JLabel sobrenomeLabel = new JLabel("Sobrenome do cliente");
        sobrenomeLabel.setBounds(30, 39, 400, 25);
        add(sobrenomeLabel);
        
        JTextField sobrenome = new JTextField("");
        sobrenome.setBounds(30, 60, 220, 25);
        add(sobrenome);

        /*Telefone */
        JLabel telefoneLabel = new JLabel("Telefone");
        telefoneLabel.setBounds(30, 79, 400, 25);
        add(telefoneLabel);
        
        JTextField telefone = new JTextField("");
        telefone.setBounds(30, 100, 220, 25);
        add(telefone);

        /*CPF */
        JLabel rgLabel = new JLabel("RG");
        rgLabel.setBounds(30, 119, 400, 25);
        add(rgLabel);
        
        JTextField rg = new JTextField();
        rg.setBounds(30, 140, 220, 25);
        add(rg);

        /*Confirmar cadastro */
        JButton confirmar = new JButton("Confirmar cadastro");
        confirmar.setBounds(30, 180, 200, 25);
        add(confirmar);

        confirmar.addActionListener(e -> {

            JFileChooser fileChooser = new JFileChooser();
            int resultado = fileChooser.showOpenDialog(null);

            if(resultado == JFileChooser.APPROVE_OPTION){
                File arquivoSelecionado = fileChooser.getSelectedFile();
                System.out.println("Arquivo selecionado: " + arquivoSelecionado.getAbsolutePath());

                Cliente c2 = new Cliente(
                    nome.getText(),
                    sobrenome.getText(),
                    telefone.getText(),
                    rg.getText()
                );

                try(FileWriter writer = new FileWriter(arquivoSelecionado, true)){
                    writer.write("\nNome: " + c2.getNome() + " " + c2.getSobrenome()  + 
                                " Telefone: " + c2.getTelefone() + ";RG:" + c2.getRG());
                } catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }
        });

        setVisible(true);
    }
}
