package com.azienda.newses.dto.response;

import lombok.Builder;

@Builder
public record GenericResponse(
        String message
) {
}
