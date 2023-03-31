public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /** metodos de acesso */
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /* metodos de calculo */
    public double calcArea(){
        return (base*altura);
    }

    

    public double calcPerimetro(){
        return(base+base+altura+altura);
    }

    
}
