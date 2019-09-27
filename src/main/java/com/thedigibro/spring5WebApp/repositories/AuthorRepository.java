package com.thedigibro.spring5WebApp.repositories;

import com.thedigibro.spring5WebApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
