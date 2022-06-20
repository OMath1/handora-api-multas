package br.com.zup.edu.multasmanager.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(nullable = false, length = 25)
    private String nome;

    @NonNull
    @Column(nullable = false, length = 25)
    private String sobrenome;

    @NonNull
    @Column(nullable = false, length = 11)
    private String cpf;

    @NonNull
    @Column(nullable = false)
    private Integer rg;

    @NonNull
    @Column(nullable = false, length = 200)
    private String endereco;

    @NonNull
    @Column(nullable = false)
    private String email;

    @NonNull
    @Column(nullable = false, length = 14)
    private String telefone;


    /**
     * @Deprecated construtor de uso exclusivo do hibernate
     **/
    @Deprecated
    public Cliente() {
    }

    public Long getId() {
        return id;
    }
}
