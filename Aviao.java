
public class Aviao {
    
    private String codigo;
    private String nome;
    private int assentos;

    public Aviao(String codigo, String nome, int assentos){
        this.codigo = codigo;
        this.nome = nome;
        this.assentos = assentos;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getAssentos(){
        return assentos;
    }
}
