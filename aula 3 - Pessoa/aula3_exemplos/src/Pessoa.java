public class Pessoa {
    String nome;
    int idade;
    double renda;

    /* Método construtor vazio */
    public Pessoa(){}

    /* Método construtor com parametro */
    public Pessoa(String n, int i, double r){
        nome = n;
        idade = i;
        renda = r;
    }
    
    public Pessoa(String n, int i){
        nome = n;
        idade = i;
    }
}
