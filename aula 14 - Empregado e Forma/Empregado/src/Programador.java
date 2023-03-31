public class Programador extends Empregado{

    private float qtdeHoras;
    private float valorHora;


    public Programador() {
    }


    public Programador(String nome, String matricula, float qtdeHoras, float valorHora) {
        super(nome, matricula);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }


    public float getQtdeHoras() {
        return qtdeHoras;
    }



    public void setQtdeHoras(float qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }



    public float getValorHora() {
        return valorHora;
    }



    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }



    @Override
    float calculaSalario() {
        float salario = valorHora * qtdeHoras;
        return salario;
    }
    
}
