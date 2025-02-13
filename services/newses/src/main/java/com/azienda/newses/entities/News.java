package com.azienda.newses.entities;

import com.azienda.dipendenti.entities.Dipendente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class News
{
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titolo;
    private String contenuto;
    private Long like = 0L;
    private String immagine;

    @ManyToOne
    @JoinColumn(name = "id_dipendente")
    private Long dipendente;

    @OneToMany
    @JoinColumn(name = "id_commento")
    private List<Commento> commenti = new ArrayList<>();
}
