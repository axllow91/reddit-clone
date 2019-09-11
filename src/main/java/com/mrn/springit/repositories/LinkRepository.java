package com.mrn.springit.repositories;

import com.mrn.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LinkRepository extends JpaRepository<Link, Long> {
    Link findByTitle(String title);
}
