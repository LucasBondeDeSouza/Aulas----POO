public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    /** metodos de acesso */

    public void setBase(double b){
        base = b;
    }

    public void setAltura(double a){
        altura = a;
    }

    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }


    /** metodos de calculo */
    public double calcArea(){
        return((base*altura)/2);
    }
    

    
}
