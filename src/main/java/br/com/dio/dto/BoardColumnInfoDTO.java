package main.java.br.com.dio.dto;

import main.java.br.com.dio.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}