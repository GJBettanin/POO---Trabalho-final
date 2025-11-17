
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VendaPassagem extends JFrame{
    
    public VendaPassagem(){
        super("Registrar venda");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setLayout(null);

        /*RG do cliente*/
        JLabel rgClienteLabel = new JLabel("RG do cliente");
        rgClienteLabel.setBounds(30, -1, 400, 25);
        add(rgClienteLabel);

        JTextField rgCliente = new JTextField("");
        rgCliente.setBounds(30, 20, 220, 25);
        add(rgCliente);

        /*ID do vôo */
        JLabel vooLabel = new JLabel("ID do vôo");
        vooLabel.setBounds(30, 39, 400, 25);
        add(vooLabel);
        
        JTextField vooId = new JTextField("");
        vooId.setBounds(30, 60, 220, 25);
        add(vooId);

        /*ID do avião */
        JLabel aviaoLabel = new JLabel("ID do avião");
        aviaoLabel.setBounds(30, 79, 400, 25);
        add(aviaoLabel);
        
        JTextField idAviao = new JTextField("");
        idAviao.setBounds(30, 100, 220, 25);
        add(idAviao);

        JButton confirmar = new JButton("Confirmar venda");
        confirmar.setBounds(30, 130, 220, 25);
        add(confirmar);

        confirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int resultado = fileChooser.showOpenDialog(null);
                
                if(resultado == JFileChooser.APPROVE_OPTION){
                    File file = fileChooser.getSelectedFile();
                    System.out.println(file.getAbsolutePath());
                    
                    Passagem passagem = new Passagem(
                            vooId.getText(),
                            rgCliente.getText(),
                            idAviao.getText()
                    );
                    
                    try(FileWriter writer = new FileWriter(file, true)){
                        writer.write("\nVôo ID: " + passagem.getVooId() +
                                ", RG do cliente: " + passagem.getClienteRG() +
                                ", Avião ID: " + passagem.getAviaoId() );
                    }catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                }
            }
        });

        setVisible(true);

    }
}
