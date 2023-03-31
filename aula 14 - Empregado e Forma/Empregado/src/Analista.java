public class Analista extends Empregado{

    private float[] valorPorProjeto;
    

    public Analista() {
    }


    public Analista(String nome, String matricula, float[] valorPorProjeto) {
        super(nome, matricula);
        this.valorPorProjeto = valorPorProjeto;
    }

    public float[] getValorPorProjeto() {
        return valorPorProjeto;
    }


    public void setValorPorProjeto(float[] valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }


    @Override
    float calculaSalario() {
        float soma = 0;
        for(int i = 0; i< valorPorProjeto.length; i++){
            soma = soma+valorPorProjeto[i];
        }
        return soma;
    }

    
  
    
}
