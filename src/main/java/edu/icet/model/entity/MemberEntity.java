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
public class MemberEntity {
    @Id
    private String memberID;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private LocalDate dateOfBirth;
    private String city;
    private String gender;
    private Double weight;
    private Double height;
}
