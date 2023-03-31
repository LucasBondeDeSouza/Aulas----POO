import javax.swing.JOptionPane;
public class ContaCorrente {

    String nome;
    float limite;
    float saldo;
    char tipo;
    
    
    public ContaCorrente() {
    }
    public ContaCorrente(String nome, float limite, char tipo) {
        this.nome = nome;
        this.limite = limite;
        this.tipo = tipo;
    }
    public ContaCorrente(String nome, float limite, float saldo, char tipo) {
        this.nome = nome;
        this.limite = limite;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public void cadastrarDados(){
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        limite = Float.parseFloat(
            JOptionPane.showInputDialog("Digite o limite: "));
        tipo = JOptionPane.showInputDialog("Digite o Tipo: ").charAt(0);
    }

    public String imprimiDados(){
        String texto;
        texto = "\t\t\t*** Bem-vindo ao Banco seu dinheiro é nosso \n\n";
        texto = texto+"Olá "+nome+"\n";
        texto = texto+"Seu saldo é: "+saldo+"\n";
        texto = texto+"Seu limite é: "+limite+"\n"
                +"O tipo da sua conta é: "+tipo+"\n";
        texto += "************************************";
        return texto;
    }

    public void sacar(float valor){
        if(saldo >= valor){
            limite=  limite+saldo;
        }
        else if (saldo+limite >= valor){
            saldo -= valor;
            if(saldo<0){
                limite=  limite+saldo;
                saldo = 0.00f;
            }
        }else{
            JOptionPane.showMessageDialog(null,
            "\t\t\t ** Não é possivel realizar a ação \n"
            +" SALDO INSUFICIENTE!!!!! :(");
        }
    }

    public void depositar(float valor){
        saldo = saldo+valor;
    }

    
    
}
