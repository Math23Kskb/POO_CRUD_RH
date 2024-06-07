package Model;

public class Departamento {
    private int codDep;
    private String cnpj;
    private String nome;
    private String endereco;
    private int ddd;
    private int telefone;

    // Construtores, getters e setters

    public Departamento() {
    }

    public Departamento(String cnpj, String nome, String endereco, int ddd, int telefone) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    public Departamento(int codDep, String cnpj, String nome, String endereco, int ddd, int telefone) {
        this.codDep = codDep;
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    // Getters e Setters
    public int getCodDep() {
        return codDep;
    }

    public void setCodDep(int codDep) {
        this.codDep = codDep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "codDep=" + codDep +
                ", cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", ddd=" + ddd +
                ", telefone=" + telefone +
                '}';
    }
}
