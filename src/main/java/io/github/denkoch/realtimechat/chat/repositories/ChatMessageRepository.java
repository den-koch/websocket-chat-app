package io.github.denkoch.realtimechat.chat.repositories;

import io.github.denkoch.realtimechat.chat.entities.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatMessageRepository extends MongoRepository<ChatMessage, String>{

    List<ChatMessage> findByChatId(String s);

}
