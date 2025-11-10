import java.time.LocalDateTime;

public class Voo {
    
    private static long ID_GERAL = 0;

    private Long id;
    private String origem;
    private String destino;
    private LocalDateTime saida;
    private LocalDateTime chegada;

    public Voo(String origem, String destino, 
                LocalDateTime saida, LocalDateTime chegada){
        this.origem = origem;
        this.destino = destino;
        this.saida = saida;
        this.chegada = chegada;
        this.id = ID_GERAL++;
    }
}
