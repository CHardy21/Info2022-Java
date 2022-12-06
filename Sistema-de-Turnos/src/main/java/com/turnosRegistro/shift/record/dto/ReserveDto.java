package com.turnosRegistro.shift.record.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.turnosRegistro.shift.record.model.Company;
import com.turnosRegistro.shift.record.model.Turn;
import com.turnosRegistro.shift.record.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Setter @Getter @AllArgsConstructor
public class ReserveDto {
    private Long id;
    private UserPartDto user;
    private CompanyPartDto company;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dateTurn;
    private TurnPartDto turn;
}
