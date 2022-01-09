package br.com.zup.LeadCollector.lead;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Lead {

    @Id
    private String email;
    @Column(nullable = false)
    private String nome;
    private String observacoes;

}
