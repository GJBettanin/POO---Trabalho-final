package entidades;
import java.time.LocalDateTime;

public class Voo {
    
    private static long ID_GERAL = 0;

    private Long id;
    private Local origem;
    private Local destino;
    private LocalDateTime saida;
    private LocalDateTime chegada;
    private Companhia companhia;

    public Voo(Local origem, Local destino, Companhia companhia,
                LocalDateTime saida, LocalDateTime chegada){
        this.origem = origem;
        this.destino = destino;
        this.companhia = companhia;
        this.saida = saida;
        this.chegada = chegada;
        this.id = ID_GERAL++;
    }
}
