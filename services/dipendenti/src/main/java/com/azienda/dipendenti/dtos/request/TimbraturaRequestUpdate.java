package com.azienda.dipendenti.dtos.request;

import jakarta.validation.constraints.NotNull;

public record TimbraturaRequestUpdate (
        @NotNull
        Integer id_timbratura,
        @NotNull
        Integer numero_scelta,
        @NotNull
        Long id_dipendente
)
{


}
