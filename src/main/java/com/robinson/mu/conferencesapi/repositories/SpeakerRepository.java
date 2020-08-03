package com.robinson.mu.conferencesapi.repositories;

import com.robinson.mu.conferencesapi.models.Speaker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}