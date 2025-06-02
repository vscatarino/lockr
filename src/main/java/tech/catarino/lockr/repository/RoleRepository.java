package tech.catarino.lockr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.catarino.lockr.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
