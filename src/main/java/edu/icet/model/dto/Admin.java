package edu.icet.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admin {
    private String adminID;
    private String name;
    private String email;
    private String contactNumber;
}
