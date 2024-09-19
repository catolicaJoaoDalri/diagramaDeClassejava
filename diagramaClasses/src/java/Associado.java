package java;

public class Associado {
    private int id;
    private String nome;
    private String rg;
    private String cpf;
    private String telefone;
    private String endereco;
    private int banco;
    private int agencia;
    private String conta;
    private boolean associadoDependente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public boolean isAssociadoDependente() {
        return associadoDependente;
    }

    public void setAssociadoDependente(boolean associadoDependente) {
        this.associadoDependente = associadoDependente;
    }

    public void cadastrarAssociado() {
        // Lógica para cadastrar um associado
    }

    public void associarPatrocinador() {
        // Lógica para associar patrocinador
    }

    public void excluirCadastro() {
        // Lógica para excluir o cadastro
    }
}
