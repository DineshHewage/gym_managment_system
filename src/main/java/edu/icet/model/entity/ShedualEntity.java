package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class ShedualEntity {
    @Id
    private String shedualID;
    private String shedualName;
    private LocalDate startDate;
    private LocalDate endDate;
}
