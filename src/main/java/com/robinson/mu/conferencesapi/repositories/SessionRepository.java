package com.robinson.mu.conferencesapi.repositories;

import com.robinson.mu.conferencesapi.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}