package io.github.denkoch.realtimechat.user.repositories;

import io.github.denkoch.realtimechat.user.entities.User;
import io.github.denkoch.realtimechat.user.entities.enums.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> findAllByStatus(Status status);
}
