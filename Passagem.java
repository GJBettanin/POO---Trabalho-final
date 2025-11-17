
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Passagem {
    
    private String vooId;
    private String rgCliente;
    private String idAviao;
    private LocalDateTime horario;
    

    public Passagem(String vooId, String rgCliente, String idAviao){
        this.vooId = vooId;
        this.rgCliente = rgCliente;
        this.idAviao = idAviao;
        this.horario = LocalDateTime.now();
    }   

    public String getVooId(){
        return vooId;
    }

    public String getClienteRG(){
        return rgCliente;
    }

    public String getAviaoId(){
        return idAviao;
    }

    @Override
    public String toString(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM");
        String data = horario.format(format);
        return String.format("%d - rg do cliente %s, avião %s, às %s",    
                    vooId, rgCliente, idAviao, data);
    }
}
