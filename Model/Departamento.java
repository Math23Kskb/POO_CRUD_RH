package Model;

public class Departamento {
    private int codDep;
    private String cnpj;
    private String nome;
    private String endereco_dep;
    private int ddd_dep;
    private int telefone_dep;

    public Departamento() {
    }

    public Departamento(int codDep, String cnpj, String nome, String endereco_dep, int ddd_dep, int telefone_dep) {
        this.codDep = codDep;
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco_dep = endereco_dep;
        this.ddd_dep = ddd_dep;
        this.telefone_dep = telefone_dep;
    }

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

    public String getEndereco_dep() {
        return endereco_dep;
    }

    public void setEndereco_dep(String endereco_dep) {
        this.endereco_dep = endereco_dep;
    }

    public int getDdd_dep() {
        return ddd_dep;
    }

    public void setDdd_dep(int ddd_dep) {
        this.ddd_dep = ddd_dep;
    }

    public int getTelefone_dep() {
        return telefone_dep;
    }

    public void setTelefone_dep(int telefone_dep) {
        this.telefone_dep = telefone_dep;
    }

    @Override
    public String toString() {
        return "Departamento:\n" +
                "\ncodDep:" + codDep +
                "\nCNPJ:" + cnpj +
                "\nNome:" + nome +
                "\nEndereço:" + endereco_dep +
                "\nDDD:" + ddd_dep +
                "\nTelefone:" + telefone_dep;
    }
}
