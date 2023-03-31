public class Usuario extends Pessoa implements Seguranca,Imprimivel{

   private String nomeusuario;
   private String senha;

   public Usuario(){}

    public Usuario(String nomeusuario, String senha) {
    this.nomeusuario = nomeusuario;
    this.senha = senha;
}

    public Usuario(String nomecompleto, int idade, String nomeusuario, String senha) {
    super(nomecompleto, idade);
    this.nomeusuario = nomeusuario;
    this.senha = senha;
}


    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String formatoString() {
        String texto = " ** Nome: "+getNomecompleto()
        +nlin+" ** Idade: "+getIdade()+nlin
        +"-- Usuario: "+getNomeusuario()+nlin
        +"-- Senha: "+getSenha();

        return texto;
    }

    @Override
    public void formatoSystemOut() {
        System.out.println(nlin+"********************************"+nlin);
        System.out.println("nome:"+getNomecompleto());
        System.out.println("idade:"+getIdade());
        System.out.println("usuario: "+getNomeusuario());
        System.out.println("senha: "+getSenha());
        System.out.println("********************************"+nlin);
    }

    @Override
    public boolean validar() {
        
        return false;
    }
    
}
