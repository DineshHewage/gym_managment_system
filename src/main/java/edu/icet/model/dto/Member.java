package edu.icet.model.dto;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
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
