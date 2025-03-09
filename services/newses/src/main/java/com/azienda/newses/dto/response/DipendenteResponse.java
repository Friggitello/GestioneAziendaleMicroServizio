package com.azienda.newses.dto.response;

import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public record DipendenteResponse(
        Long id,
        String nome,
        String cognome,
        String email,
        String password,
        LocalDate dataNascita,
        String luogoNascita,
        String telefono,
        Long dipartimento,
        Long posizione,
        List<Long> commenti,
        List<Long> newses,
        List<Long> comunicazioni,
        List<Long> timbrature

) {

}
