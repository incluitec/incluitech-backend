package com.ages.incuitech.backend.chatbotservice.api.bot.model.outgoing.attachment;

import com.ages.incuitech.backend.chatbotservice.api.bot.model.outgoing.button.Button;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@Builder
@ToString
public class ButtonsAttachment extends AttachmentBotMessagePayload {
    private String text;
    private List<Button> buttons;

    public ButtonsAttachment() {
        super(AttachmentTypes.BUTTON.getValor());
    }
}
