package com.ages.incuitech.backend.chatbotservice.api.bot.model.internal.message;

import java.util.Map;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class MensagemInterna {
  private final UsuarioDaMensagem usuario;
  private final TipoMensagem tipo;
  private final String conteudo;
  private Map<String, Object> contexto;

  public MensagemInterna(UsuarioDaMensagem usuario, TipoMensagem tipo, String conteudo) {
    this.usuario = usuario;
    this.tipo = tipo;
    this.conteudo = conteudo;
  }
}
