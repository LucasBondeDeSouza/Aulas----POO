public class Pessoa {
    protected String nomecompleto;
    protected int idade;

    public Pessoa() {
    }


    public Pessoa(String nomecompleto, int idade) {
        this.nomecompleto = nomecompleto;
        this.idade = idade;
    }


    public String getNomecompleto() {
        return nomecompleto;
    }


    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    
}
