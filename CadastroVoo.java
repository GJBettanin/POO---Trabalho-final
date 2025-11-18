import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroVoo extends JFrame {

    private String origemSelected, destinySelected;

    public CadastroVoo() {
        super("Comprar passagem");
        setSize(500, 650);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setLayout(null);


        JLabel aviaoLabel = new JLabel("Código do avião"); 
        aviaoLabel.setBounds(30, 15, 220, 25); 
        add(aviaoLabel);
        
        JTextField codigo = new JTextField("");
        codigo.setBounds(30, 35, 220, 25);
        add(codigo);

        String[] locais = {"SAO_PAULO", "PARIS", "LOS_ANGELES", "RIO_DE_JANEIRO", "PORTO_ALEGRE", 
                        "BUENOS_AIRES", "MONTEVIDEU", "EL_SANTIAGO", "NOVA_IORQUE", "BERLIM", "MUNIQUE"
        };

        JLabel origemLabel = new JLabel("Origem"); 
        origemLabel.setBounds(30, 95, 220, 25); 
        add(origemLabel);
    
        JComboBox<String> origem = new JComboBox<>(locais);
        origem.setBounds(30, 135, 220, 25);
        add(origem);

        origem.addActionListener(e -> {
            origemSelected = (String) origem.getSelectedItem();
        });

        JLabel destinoLabel = new JLabel("Destino"); 
        destinoLabel.setBounds(30, 195, 220, 25); 
        add(destinoLabel);
        
        JComboBox<String> destino = new JComboBox<>(locais);
        destino.setBounds(30, 225, 220, 25);
        add(destino);
        
        destino.addActionListener(e -> {
            destinySelected = (String) destino.getSelectedItem();
        });

        JButton confirmar = new JButton("Confirmar cadastro");
        confirmar.setBounds(30, 285, 200, 25);
        add(confirmar);

        confirmar.addActionListener(origemSelectede -> {
            JFileChooser fileChooser = new JFileChooser();
            int resultado = fileChooser.showOpenDialog(null);
           
            if(resultado == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();

                System.out.println("Arquivo selecionado: " + file.getAbsolutePath());

                Voo voo = new Voo(
                    origemSelected, 
                    destinySelected, 
                    codigo.getText()
                );

                DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM");
                String data = LocalDateTime.now().format(formater);

                try(FileWriter writer = new FileWriter(file, true)){
                    writer.write("\nAvião " + voo.getCodigoAviao() + ", Origem " + voo.getOrigem() + 
                    ", Destino " + voo.getDestino() + " Horário " + data);
                } catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }

        });

        setVisible(true);
    }
}