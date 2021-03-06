package com.uwhiz.user.repo;

import com.uwhiz.user.domain.UwhizUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UwhizUser, Long> {

    Optional<UwhizUser> findByEmail(String email);

}
