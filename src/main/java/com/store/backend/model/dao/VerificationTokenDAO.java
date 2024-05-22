package com.store.backend.model.dao;

import com.store.backend.model.LocalUser;
import com.store.backend.model.VerificationToken;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long> {


    Optional<VerificationToken> findByToken(String token);

    void deleteByUser(LocalUser user);
}
