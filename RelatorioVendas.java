import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class RelatorioVendas extends JFrame {

    public RelatorioVendas(){
        super("Relatório de vendas");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setLayout(null);

        JButton clientes = new JButton("Relatório de clientes");
        clientes.setBounds(30, 30, 200, 25);
        add(clientes);

        clientes.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int selecao = fileChooser.showOpenDialog(null);
    
            if(selecao == JFileChooser.APPROVE_OPTION){
    
                File file = fileChooser.getSelectedFile();
                try(BufferedReader r = new BufferedReader(new FileReader(file))){
                    String linha;
                    while((linha = r.readLine()) != null){
                        System.out.println(linha);
                    }
                } catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }   
        });

        JButton voos = new JButton("Relatório de vôos");
        voos.setBounds(30,60,200,25);
        add(voos);

        voos.addActionListener(e -> {

        });

        JButton avioes = new JButton("Relatório de aviões");
        avioes.setBounds(30,90,200,25);
        add(avioes);

        avioes.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int selecao = fileChooser.showOpenDialog(null);
    
            if(selecao == JFileChooser.APPROVE_OPTION){
    
                File file = fileChooser.getSelectedFile();
                try(BufferedReader r = new BufferedReader(new FileReader(file))){
                    String linha;
                    while((linha = r.readLine()) != null){
                        System.out.println(linha);
                    }
                } catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            }   
        });

        setVisible(true);
    }
}