package Model;

import java.util.Date;

public class Funcionario {

    private int cod_func;
    private String cpf;
    private String primeiro_nome;
    private String ultimo_nome;
    private String endereco_func;
    private Date data_nasc;
    private int ddd_func;
    private int telefone_func;
    private int departamento_cod_dep;

    public Funcionario() {
    }

    public Funcionario(String cpf, String primeiro_nome, String ultimo_nome, String endereco_func, Date data_nasc,
                       int ddd_func, int telefone_func, int departamento_cod_dep) {
        this.cpf = cpf;
        this.primeiro_nome = primeiro_nome;
        this.ultimo_nome = ultimo_nome;
        this.endereco_func = endereco_func;
        this.data_nasc = data_nasc;
        this.ddd_func = ddd_func;
        this.telefone_func = telefone_func;
        this.departamento_cod_dep = departamento_cod_dep;
    }

    public Funcionario(int cod_func, String cpf, String primeiro_nome, String ultimo_nome, String endereco_func, Date data_nasc,
                       int ddd_func, int telefone_func, int departamento_cod_dep) {
        this.cod_func = cod_func;
        this.cpf = cpf;
        this.primeiro_nome = primeiro_nome;
        this.ultimo_nome = ultimo_nome;
        this.endereco_func = endereco_func;
        this.data_nasc = data_nasc;
        this.ddd_func = ddd_func;
        this.telefone_func = telefone_func;
        this.departamento_cod_dep = departamento_cod_dep;
    }

    public int getCod_func() {
        return cod_func;
    }


    public void setCod_func(int codFunc) {
        this.cod_func = codFunc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPrimeiro_nome() {
        return primeiro_nome;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getUltimo_nome() {
        return ultimo_nome;
    }

    public void setUltimo_nome(String ultimo_nome) {
        this.ultimo_nome = ultimo_nome;
    }

    public String getEndereco_func() {
        return endereco_func;
    }

    public void setEndereco_func(String endereco_func) {
        this.endereco_func = endereco_func;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public int getDdd_func() {
        return ddd_func;
    }

    public void setDdd_func(int ddd_func) {
        this.ddd_func = ddd_func;
    }

    public int getTelefone_func() {
        return telefone_func;
    }

    public void setTelefone_func(int telefone_func) {
        this.telefone_func = telefone_func;
    }

    public int getDepartamento_cod_dep() {
        return departamento_cod_dep;
    }

    public void setDepartamento_cod_dep(int departamento_cod_dep) {
        this.departamento_cod_dep = departamento_cod_dep;
    }

    @Override
    public String toString() {
        return "Funcionario " +
                "[cod_func=" + cod_func +
                ", cpf=" + cpf +
                ", primeiro_nome=" + primeiro_nome +
                ", ultimo_nome=" + ultimo_nome +
                ", endereco_func=" + endereco_func +
                ", data_nasc=" + data_nasc +
                ", ddd_func=" + ddd_func +
                ", telefone_func=" + telefone_func +
                ", departamento_cod_dep=" + departamento_cod_dep +
                "]";
    }
}
