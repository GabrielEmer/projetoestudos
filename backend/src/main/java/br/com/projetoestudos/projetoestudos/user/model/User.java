package br.com.projetoestudos.projetoestudos.user.model;

import br.com.projetoestudos.projetoestudos.publication.model.Publication;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.List;

@Entity(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 60)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity=Publication.class)//, mappedBy="user")
    private List<Publication> publication;
}
