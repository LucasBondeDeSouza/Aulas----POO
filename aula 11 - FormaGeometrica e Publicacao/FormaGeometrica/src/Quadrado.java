public class Quadrado  extends Forma{
    // atributo
   private float base;

public Quadrado(float base) {
    this.base = base;
}

public float getBase() {
    return base;
}

public void setBase(float base) {
    this.base = base;
}

@Override
public float area() {
    return base*base;
}

@Override
public void mostrar() {
    System.out.println("\n\n ******************************");
    System.out.println("A base do quadrado é: "+getBase());
    System.out.println("A area é"+area());
    System.out.println("O perimetro é: "+perimetro());
    System.out.println("\n\n ******************************");
    
}

public float perimetro(){
    return base+base+base+base;
}



   
    
}
