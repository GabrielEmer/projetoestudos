package br.com.projetoestudos.projetoestudos.user.controller;

import br.com.projetoestudos.projetoestudos.user.model.User;
import br.com.projetoestudos.projetoestudos.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/user")
    public List<User> getAll() {
        return repository.findAll();
    }


}
