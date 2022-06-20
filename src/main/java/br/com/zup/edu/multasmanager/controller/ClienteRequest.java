package br.com.zup.edu.multasmanager.controller;

import br.com.zup.edu.multasmanager.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequest {
    @NotBlank
    @Length(min = 3, max = 25)
    private String nome;

    @NotBlank
    @Length(min = 3, max = 25)
    private String sobrenome;

    @CPF
    @NotNull
    private String cpf;

    @Positive
    @NotNull
    private Integer rg;

    @NotBlank
    @Length(min = 10, max = 200)
    private String endereco;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Length(min = 10, max = 24)
    private String telefone;

    public Cliente paraCliente() {
        return new Cliente(
                nome, sobrenome, cpf, rg, endereco, email, telefone
        );
    }
}

