package br.com.catolica.Model;
import java.util.UUID;

public class Contato {

    public UUID id;
    public String numeroTelefone;

    public String email;

    public Contato( String numeroTelefone, String email) {
        this.id = UUID.randomUUID();
        this.numeroTelefone = numeroTelefone;
        this.email = email;
    }
}
