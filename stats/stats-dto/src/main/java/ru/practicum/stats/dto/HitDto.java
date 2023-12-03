package ru.practicum.stats.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

import static com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING;

@Data
@Builder
public class HitDto {

    public Long id;

    @NotBlank
    public String ip;

    @NotBlank
    public String app;

    @NotBlank
    public String uri;

    @JsonFormat(shape = STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    public LocalDateTime timestamp;
}

