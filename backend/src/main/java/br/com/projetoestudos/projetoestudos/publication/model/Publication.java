package br.com.projetoestudos.projetoestudos.publication.model;


import br.com.projetoestudos.projetoestudos.user.model.User;
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

    @Column(name = "description", length = 2000)
    private String description;

    @JoinColumn(name = "user")
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
