package br.com.zup.LeadCollector.usuario;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String senha;
}
