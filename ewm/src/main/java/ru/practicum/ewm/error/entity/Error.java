package ru.practicum.ewm.error.entity;

import lombok.*;

import java.util.Objects;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Error {

    private String status;
    private String reason;
    private String message;
    private String timestamp;
}