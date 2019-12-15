package pl.patryk.springwithgit.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
public class Address {
    @Id
    private Long id;
    private String city;

}
