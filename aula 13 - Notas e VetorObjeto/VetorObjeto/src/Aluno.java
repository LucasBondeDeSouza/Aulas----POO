public class Aluno {
    private String rgm;
    private String nome;
    private int idade;

    public Aluno() {
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void print(){
        System.out.println("Nome: "+nome+"\n"
           +"RGM: "+rgm+"\n"
           +"Idade: "+idade);
    }
    

}
