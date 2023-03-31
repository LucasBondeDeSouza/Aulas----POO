import javax.swing.*;
public class App3 {
    public static void main(String[] args) throws Exception {
        Pessoa2 p = new Pessoa2(); 
        
        JOptionPane.showMessageDialog(null, 
        "Olá mensagem");

        String nome = JOptionPane.showInputDialog(
            "Digite seu nome");

        JOptionPane.showMessageDialog(null,
        "Olá "+nome+", tudo bem??");

        int idade = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Digite sua idade: "));
        p.idade = idade;
        p.nome = nome;

        JOptionPane.showMessageDialog(null,
         "O valor do objeto pessoa é "+p);
         JOptionPane.showMessageDialog( null ,
          " nome de pessoa: "+p.nome+"\n sua idade: "+p.idade+
          "\n sua renda é:"+p.renda);
        
    }
}
