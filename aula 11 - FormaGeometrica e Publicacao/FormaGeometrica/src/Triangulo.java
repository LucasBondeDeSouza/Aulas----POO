public class Triangulo extends Forma{
    private float base;
    private float altura;


    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }


    public float getBase() {
        return base;
    }


    public void setBase(float base) {
        this.base = base;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    @Override
    public float area() {
        return base*altura/2;
    }


    @Override
    public void mostrar() {
        System.out.println("\n\n ******************************");
        System.out.println("\t\t\t ** Triangulo ** ");
        System.out.println("Base: "+getBase());
        System.out.println("Altura: "+getAltura());
        System.out.println("A area: "+area());
        System.out.println("O Perimetro: "+perimetro());
        System.out.println("\n\n ******************************");
        
    }


    
    
    
}
