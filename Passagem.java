
import java.math.BigDecimal;

public class Passagem {
    
    private Long vooId;
    private BigDecimal preco;
    private String cpfCliente;

    public Passagem(Long vooId, Double preco, String cpfCliente){
        this.vooId = vooId;
        this.preco = BigDecimal.valueOf(preco);
        this.cpfCliente = cpfCliente;
    }   

    @Override
    public String toString(){
        return String.format("%d - %s, $%.2f%n",    
                    vooId, cpfCliente, preco);
    }
}
