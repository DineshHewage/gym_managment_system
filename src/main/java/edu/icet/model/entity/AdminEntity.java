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
public class AdminEntity {
    @Id
    private String adminID;
    private String name;
    private String email;
    private String contactNumber;
}
