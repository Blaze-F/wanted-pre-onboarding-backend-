package com.myapp.BackendInternship.models.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CompanyDTO {
    @Id
    private Long id;
    private String name;
    private String nation;
    private String location;

}
