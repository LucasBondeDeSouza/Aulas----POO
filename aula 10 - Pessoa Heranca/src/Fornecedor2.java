public class Fornecedor2 extends Pessoa2{
    private float valorCompra;

    public Fornecedor2() {
    }
    
    public Fornecedor2(String nome, String fone, float v) {
        super(nome, fone);
        valorCompra = v;
    }



    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
    public void print(){
        System.out.println("*************************");
        System.out.println("Nome: "+getNome()+"\n"
        +"Telefone: "+getFone()+"\n"
        +"Valor da Compra: "+valorCompra);
        System.out.println("*************************");

    }

    
    
}
