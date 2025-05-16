package ru.maverick.subscriptionservice.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
@Builder
public class SubscriptionCreateRequest {
    @NotBlank
    String serviceName;

    @NotNull
    @Future
    LocalDate expirationDate;

    boolean autoRenew;
}