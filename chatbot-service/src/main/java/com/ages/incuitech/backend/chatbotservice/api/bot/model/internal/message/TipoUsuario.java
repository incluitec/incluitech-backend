package com.ages.incuitech.backend.chatbotservice.api.bot.model.internal.message;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoUsuario {
  SOLUCIONADOR("solucionador"),
  CLIENTE("cliente");

  private String tipo;

  public static TipoUsuario getFromTipo(String tipo) {
    return Arrays.stream(TipoUsuario.values())
        .filter(contato -> contato.tipo.equals(tipo))
        .findAny()
        .orElse(null);
  }
}
