public class Quadrado {
    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    /**
     * 
     * metodos de acesso
     */
     
     
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

     
     /*
      * metodos de calculo
      */
    public double calcArea(){
        return(lado*lado);
    }

    


    public double calcPerimetro(){

        return(lado+lado+lado+lado);
    }

    
}
