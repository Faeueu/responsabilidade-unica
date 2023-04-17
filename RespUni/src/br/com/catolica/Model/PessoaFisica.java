package br.com.catolica.Model;
import java.time.LocalDate;

public class PessoaFisica extends Cliente{

    public String nome;

    public String cpf;

    public String rg;

    public LocalDate dataNascimento;

    public String genero;

    public PessoaFisica(){}

    public PessoaFisica(Endereco endereco, Contato contato, String nome, String cpf, String rg, LocalDate dataNascimento, String genero) {
        super(endereco, contato);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ClienteFisico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", genero='" + genero + '\'' +
                ", endereco=" + endereco +
                ", contato=" + contato +
                ", clienteAtivo=" + clienteAtivo +
                '}';
    }
}
