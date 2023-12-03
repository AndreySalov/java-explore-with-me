package ru.practicum.ewm.compilation.service;

import ru.practicum.ewm.compilation.dto.CompilationDto;
import ru.practicum.ewm.compilation.dto.SavedCompilationDto;

import java.util.List;

public interface CompilationService {

    CompilationDto saveCompilation(SavedCompilationDto savedCompilationDto);

    void deleteCompilation(Long compId);

    CompilationDto updateCompilation(Long compId,
                                     SavedCompilationDto savedCompilationDto);

    CompilationDto getCompilation(Long compId);

    List<CompilationDto> getCompilations(Boolean pinned,
                                         Integer from,
                                         Integer size);
}