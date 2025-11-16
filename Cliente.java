
import java.util.LinkedList;

public class Cliente {
    
    private String nome;
    private String sobrenome;
    private String telefone;
    private String rg;
    private LinkedList<Passagem> historico;
    
    public Cliente(String nome, String sobrenome,
                    String telefone, String rg){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.rg = rg;
        this.historico = new LinkedList<>();
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getRG(){
        return rg;
    }

    @Override
    public String toString(){
        return String.format("""
                Nome: %s %s; Telefone: %s;
                RG: %s 
        """, nome, sobrenome, telefone, rg);
    }
}
