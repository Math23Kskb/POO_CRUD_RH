package Model;

import java.util.Date;

    public class Funcionario {

        private int cod_func;
        private String cpf;
        private String primeiro_nome;
        private String ultimo_nome;
        private String endereco;
        private Date data_nasc;
        private int ddd;
        private int telefone;
        private int departamento_cod_dep;


        public Funcionario() {
        }

        public Funcionario(String cpf, String primeiro_nome, String ultimo_nome, String endereco, Date data_nasc,
                           int ddd, int telefone, int departamento_cod_dep) {
            this.cpf = cpf;
            this.primeiro_nome = primeiro_nome;
            this.ultimo_nome = ultimo_nome;
            this.endereco = endereco;
            this.data_nasc = data_nasc;
            this.ddd = ddd;
            this.telefone = telefone;
            this.departamento_cod_dep = departamento_cod_dep;
        }

        public Funcionario(int cod_func, String cpf, String primeiro_nome, String ultimo_nome, String endereco, Date data_nasc,
                           int ddd, int telefone, int departamento_cod_dep) {
            this.cod_func = cod_func;
            this.cpf = cpf;
            this.primeiro_nome = primeiro_nome;
            this.ultimo_nome = ultimo_nome;
            this.endereco = endereco;
            this.data_nasc = data_nasc;
            this.ddd = ddd;
            this.telefone = telefone;
            this.departamento_cod_dep = departamento_cod_dep;
        }

        public int getCod_func() {
            return cod_func;
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
        public String getEndereco() {
            return endereco;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        public Date getData_nasc() {
            return data_nasc;
        }
        public void setData_nasc(Date data_nasc) {
            this.data_nasc = data_nasc;
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
        public int getDepartamento_cod_dep() {
            return departamento_cod_dep;
        }
        public void setDepartamento_cod_dep(int departamento_cod_dep) {
            this.departamento_cod_dep = departamento_cod_dep;
        }

        @Override
        public String toString() {
            return "Model.Funcionario [cod_func=" + cod_func + ", cpf=" + cpf + ", primeiro_nome=" + primeiro_nome
                    + ", ultimo_nome=" + ultimo_nome + ", endereco=" + endereco + ", data_nasc=" + data_nasc + ", ddd="
                    + ddd + ", telefone=" + telefone + ", departamento_cod_dep=" + departamento_cod_dep + "]";
        }
    }

