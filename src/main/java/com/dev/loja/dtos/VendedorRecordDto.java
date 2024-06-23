package com.dev.loja.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.Date;

public record VendedorRecordDto(
        @NotBlank String nome,
        @NotBlank @Pattern(regexp = "\\d{11}") String cpf,
        @NotBlank String telefone,
        @NotBlank @Email String email,
        @NotNull @Past Date dataNascimento,
        @NotBlank String sexo,
        @NotNull BigDecimal salario,
        @NotNull Long enderecoId
) {
}
