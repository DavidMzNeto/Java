package com.dev.loja.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EnderecoRecordDto(
        @NotBlank String rua,
        @NotBlank String bairro,
        @NotNull Integer numero,
        @NotBlank String cidade,
        @NotBlank String estado,
        @NotBlank String cep
) {
}
