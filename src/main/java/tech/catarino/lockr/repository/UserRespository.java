package tech.catarino.lockr.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.catarino.lockr.entities.User;
@Repository
public interface UserRespository extends JpaRepository<User, UUID> {

}
