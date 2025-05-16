package ru.maverick.subscriptionservice.service;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maverick.subscriptionservice.model.Subscription;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.maverick.subscriptionservice.model.Subscription;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


public interface UserRepository extends JpaRepository<Subscription, UUID> {
}
