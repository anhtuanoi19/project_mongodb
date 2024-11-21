package vn.nodo.c09.tangthu_app_be.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import vn.nodo.c09.tangthu_app_be.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
}
