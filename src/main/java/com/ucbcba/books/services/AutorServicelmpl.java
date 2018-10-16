package com.ucbcba.books.services;

import com.ucbcba.books.entities.Autor;
import com.ucbcba.books.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AutorServicelmpl implements AutorService {
    AutorRepository autorRepository;

    @Autowired
    @Qualifier(value="autorRepository")
    public void setAutorRepository(AutorRepository autorRepository){this.autorRepository=autorRepository;}

    @Override
    public Iterable<Autor> listAllAutores() {return autorRepository.findAll();}
}
