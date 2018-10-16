package com.ucbcba.books.repositories;

import com.ucbcba.books.entities.Autor;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface AutorRepository extends CrudRepository<Autor,Integer> {

}
