package org.ron.authservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class UserRole {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "credential_id")
    @JsonIgnore
    private UserCredential credential;
}
