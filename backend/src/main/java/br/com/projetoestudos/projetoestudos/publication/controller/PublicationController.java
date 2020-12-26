package br.com.projetoestudos.projetoestudos.publication.controller;

import br.com.projetoestudos.projetoestudos.publication.model.Publication;
import br.com.projetoestudos.projetoestudos.publication.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublicationController {

    @Autowired
    PublicationRepository repository;

    @GetMapping("/publication")
    public List<Publication> getAll(){
        return repository.findAll();
    }
}
