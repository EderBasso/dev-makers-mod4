public class Contato{
    private String nome;
    private String telefone;

    private boolean ativo;

    public Contato(String nome, String telefone, boolean ativo) {
        this.nome = nome;
        this.telefone = telefone;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isAtivo() {
        return ativo;
    }

    @Override
    public String toString(){
        return nome + " - " + telefone;
    }
}
