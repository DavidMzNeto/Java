package com.dev.loja.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProdutosRecordDto(@NotBlank String name, @NotNull BigDecimal value, @NotNull Integer quantidade) {
}
