package com.azienda.dipendenti.dtos.response;

import lombok.Builder;

@Builder
public record PosizioneLavorativaResponse(
        Long id,
        String nome,
        String descrizione
) {
}
