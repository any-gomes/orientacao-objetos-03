package exercicios;

public class Correntista {
    private Double codigo;
    private String nome;
    private String email;
    private String telefone;

    public Correntista(Double codigo, String nome, String email, String telefone) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public void setCodigo(Double codigo){
        if (codigo <= 0.0){
            throw new IllegalArgumentException("Código tem que ser maior que zero");
        }
        this.codigo = codigo;
    }

    public Double getCodigo(){
        return codigo;
    }

    public void setNome(String nome){
        if (nome.length() < 2){
            throw new IllegalArgumentException("Nome Inválido");
        }
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEmail(String email){
        if (email.length() < 10){
            throw new IllegalArgumentException("E-mail Inválido");
        }
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setTelefone(String telefone){
        if (telefone.length() < 8){
            throw new IllegalArgumentException("Telefone Inválido");
        }
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }


}