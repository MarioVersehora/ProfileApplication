package com.tcv.ProfileApplication.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder /* imi instantiaza obiectul cu builder pattern, ci nu cu constructorul */
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JsonBackReference
    User user;

    @ManyToOne
    @JsonBackReference
    Pet pet;


}
