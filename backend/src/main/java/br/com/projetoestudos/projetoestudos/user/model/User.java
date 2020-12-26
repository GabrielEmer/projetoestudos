package br.com.projetoestudos.projetoestudos.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 60)
    private String name;
}
