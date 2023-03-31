public class Cliente2 extends Pessoa2{
    private float valorDivida;

    public Cliente2() {
    }
    
    public Cliente2(String n, String f, float v){
        super(n,f);
        valorDivida = v;

    }
    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void print(){
        System.out.println("*************************");
        System.out.println("Nome: "+getNome()+"\n"
        +"Telefone: "+getFone()+"\n"
        +"Valor da Divida: "+valorDivida);
        System.out.println("*************************");

    }
   

    
    
}
