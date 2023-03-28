package com.validator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.validator.entities.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
