import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo {
    
    private String origem;
    private String destino;
    private LocalDateTime horario;
    private String codigoAviao;

    public Voo(String origem, String destino, 
                String codigoAviao){
        this.origem = origem;
        this.destino = destino;
        this.codigoAviao = codigoAviao;
        this.horario = LocalDateTime.now();
    }

    public String getOrigem(){
        return origem;
    }

    public String getDestino(){
        return destino;
    }

    public String getCodigoAviao(){
        return codigoAviao;
    }

    public String getHorario(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM");
        return horario.format(format);
    }
}