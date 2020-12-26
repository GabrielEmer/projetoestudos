package br.com.projetoestudos.projetoestudos.user.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "publication")
@Getter
@Setter
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "")
}
