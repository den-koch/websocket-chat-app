package io.github.denkoch.realtimechat.chatroom.repositories;

import io.github.denkoch.realtimechat.chatroom.entities.ChatRoom;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ChatRoomRepository extends MongoRepository<ChatRoom, String> {

    Optional<ChatRoom> findBySenderIdAndRecipientId(String senderId, String recipientId);
}
