package com.azienda.dipendenti.dtos.request;

import jakarta.validation.constraints.NotBlank;

import java.util.Set;

public record DipartimentoRequestUpdate(
        @NotBlank(message = "Il nome del dipartimento non può essere blank o null")
        String nome,
        @NotBlank(message = "La descrizione del dipartimento non può essere blank o null")
        String descrizione,
        Set<Long> id_posizione_lavorativa,
        Long id_dipedente
) {
}
