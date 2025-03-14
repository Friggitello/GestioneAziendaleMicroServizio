package com.azienda.dipendenti.dtos.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record DipendenteRequestRegister(
        @NotBlank(message = "Il nome non può essere blank o null")
        String nome,
        @NotBlank(message = "Il cognome non può essere blank o null")
        String cognome,
        @Email(message = "Email non valida")
        String email,
        String password,
        @Past(message = "La data di nascita deve essere nel passato")
        LocalDate data_nascita,
        @NotBlank(message = "Luogo di nascita non può essere null o blank")
        String luogo_nascita,
        @Pattern(
                regexp = "^\\+?[0-9]+$",
                message = "Telefono non valido")
        String telefono,
        String immagine_profilo,
        Long id_dipartimento,
        Long id_posizione,
        Long id_timbratura
) {
}
