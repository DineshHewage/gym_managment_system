package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class TrainerEntity {
    @Id
    private String trainerID;
    private String name;
    private String contactNumber;
    private String email;

}
