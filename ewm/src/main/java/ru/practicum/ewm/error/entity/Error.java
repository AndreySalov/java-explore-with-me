package ru.practicum.ewm.error.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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