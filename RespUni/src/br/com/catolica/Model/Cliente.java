package br.com.catolica.Model;
import java.util.UUID;

public abstract class Cliente {
    public UUID id;

    public Endereco endereco;

    public Contato contato;

    public boolean clienteAtivo;

    public Cliente(){}

    public Cliente(Endereco endereco, Contato contato) {
        this.id = UUID.randomUUID();
        this.endereco = endereco;
        this.contato = contato;
        this.clienteAtivo = true;
    }
}
