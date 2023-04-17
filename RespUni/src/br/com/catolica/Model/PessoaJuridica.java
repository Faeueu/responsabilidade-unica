package br.com.catolica.Model;

public class PessoaJuridica extends Cliente {

    public String cnpj;

    public String nomeFantasia;

    public String razaoSocial;

    public Endereco endereco;

    public Contato contato;

    public String numeroInscricaoMunicipal;

    public String numeroInscricaoEstadual;

    public String indicadorInscricaoEstadual;

    public PessoaJuridica(Endereco endereco, Contato contato, String cnpj, String nomeFantasia, String razaoSocial, Endereco endereco1, Contato contato1, String numeroInscricaoMunicipal, String numeroInscricaoEstadual, String indicadorInscricaoEstadual) {
        super(endereco, contato);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco1;
        this.contato = contato1;
        this.numeroInscricaoMunicipal = numeroInscricaoMunicipal;
        this.numeroInscricaoEstadual = numeroInscricaoEstadual;
        this.indicadorInscricaoEstadual = indicadorInscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getNumeroInscricaoMunicipal() {
        return numeroInscricaoMunicipal;
    }

    public void setNumeroInscricaoMunicipal(String numeroInscricaoMunicipal) {
        this.numeroInscricaoMunicipal = numeroInscricaoMunicipal;
    }

    public String getNumeroInscricaoEstadual() {
        return numeroInscricaoEstadual;
    }

    public void setNumeroInscricaoEstadual(String numeroInscricaoEstadual) {
        this.numeroInscricaoEstadual = numeroInscricaoEstadual;
    }

    public String getIndicadorInscricaoEstadual() {
        return indicadorInscricaoEstadual;
    }

    public void setIndicadorInscricaoEstadual(String indicadorInscricaoEstadual) {
        this.indicadorInscricaoEstadual = indicadorInscricaoEstadual;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "id=" + id +
                ", cnpj='" + cnpj + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", endereco=" + endereco +
                ", contato=" + contato +
                ", numeroInscricaoMunicipal='" + numeroInscricaoMunicipal + '\'' +
                ", numeroInscricaoEstadual='" + numeroInscricaoEstadual + '\'' +
                ", indicadorInscricaoEstadual='" + indicadorInscricaoEstadual + '\'' +
                ", endereco=" + endereco +
                ", contato=" + contato +
                ", clienteAtivo=" + clienteAtivo +
                '}';
    }
}
