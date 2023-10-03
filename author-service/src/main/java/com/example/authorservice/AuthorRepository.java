package com.example.authorservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
    public List<Author> findByOrderByNameDesc();

    public List<Author> findByNameStartingWith(String prefix);

}