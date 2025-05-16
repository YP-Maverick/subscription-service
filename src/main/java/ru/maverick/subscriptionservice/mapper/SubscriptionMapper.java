package ru.maverick.subscriptionservice.controller;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.maverick.subscriptionservice.dto.SubscriptionCreateRequest;
import ru.maverick.subscriptionservice.dto.SubscriptionDto;
import ru.maverick.subscriptionservice.model.Subscription;
import ru.maverick.subscriptionservice.model.User;

import java.time.LocalDate;

@Mapper(componentModel = "spring",
        imports = {LocalDate.class, java.time.temporal.ChronoUnit.class})
public interface SubscriptionMapper {

    @Mapping(target = "startDate", expression = "java(LocalDate.now())")
    @Mapping(target = "expirationDate", source = "request.expirationDate")
    @Mapping(target = "autoRenew", source = "request.autoRenew")
    Subscription fromCreateRequest(SubscriptionCreateRequest request, User user);

    SubscriptionDto toDto(Subscription subscription);
}