package alura.com.livrariamob.OBJETOS;

public class Usuario {
    Integer usuario_id;
    String usuario_nome;
    String usuario_CPF;
    String usuario_nasc;
    String usuario_senha;

    public String getUsuario_senha() {
        return usuario_senha;
    }

    public void setUsuario_senha(String usuario_senha) {
        this.usuario_senha = usuario_senha;
    }

    boolean usuario_adm;

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public String getUsuario_nome() {
        return usuario_nome;
    }

    public void setUsuario_nome(String usuario_nome) {
        this.usuario_nome = usuario_nome;
    }

    public String getUsuario_CPF() {
        return usuario_CPF;
    }

    public void setUsuario_CPF(String usuario_CPF) {
        this.usuario_CPF = usuario_CPF;
    }

    public String getUsuario_nasc() {
        return usuario_nasc;
    }

    public void setUsuario_nasc(String usuario_nasc) {
        this.usuario_nasc = usuario_nasc;
    }

    public boolean isUsuario_adm() {
        return usuario_adm;
    }

    public void setUsuario_adm(boolean usuario_adm) {
        this.usuario_adm = usuario_adm;
    }


}
