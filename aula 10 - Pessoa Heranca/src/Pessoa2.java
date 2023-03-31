public class Pessoa2 {
    private String nome;
    private String fone;

    public Pessoa2() {
    }

    public Pessoa2(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void print(){
        System.out.println("Nome: "+nome+"\n"
        +"Telefone: "+fone);
    }
    
}
