package edu.icet.model.dto;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Shedual {
    private String shedualID;
    private String shedualName;
    private LocalDate startDate;
    private LocalDate endDate;
}
