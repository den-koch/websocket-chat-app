package io.github.denkoch.realtimechat.entities;

import io.github.denkoch.realtimechat.entities.enums.MessageType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;
}
