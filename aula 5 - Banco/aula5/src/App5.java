import javax.swing.JOptionPane;
public class App5 {
    public static void main(String[] args) throws Exception {
        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente("fulano",
         0.0f,'P');
        float valor;
        int resp;
       resp = Integer.parseInt(JOptionPane.showInputDialog("\t\t\t ***Bem-vindo ao banco seu dinheiro é nosso***\n"
            +"1 - Cadastrar \n"
            +"2 - Consultar \n"
            +"3 - Depositar \n"
            +"4 - Sacar "));
        switch (resp) {
            case 1:
                JOptionPane.showMessageDialog(null, 
                    "\t\t\t ***Bem-vindo ao banco seu dinheiro é nosso***\n"
                    +"Vamos começar o cadastro co primeiro objeto");
                cc1.cadastrarDados();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, cc1.imprimiDados());
                break;

            case 3:
                 valor = Float.parseFloat(JOptionPane.showInputDialog(
                         "\t\t\t ** Banco seu dinheiro é nosso \n"
                        +"Digite o valor a ser depositado: "));
                cc1.depositar(valor); 
                break;
            case 4: 
                 valor = Float.parseFloat(JOptionPane.showInputDialog(
                         "\t\t\t ***Bem-vindo ao banco seu dinheiro é nosso***\n"
                         +"Digite o valor do saque:"));
                cc1.sacar(valor);
                break;
            default:
                JOptionPane.showMessageDialog(null, 
                "Ação não encontrada");
                break;
        }
        
        
           

    }
}
