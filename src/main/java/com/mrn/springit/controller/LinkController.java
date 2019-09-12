package com.mrn.springit.controller;

import com.mrn.springit.domain.Link;
import com.mrn.springit.repositories.LinkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class LinkController {

    private LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/links")
    public List<Link> list() {
        return linkRepository.findAll();
    }

    @PostMapping("/create")
    public Link create(@ModelAttribute Link link) {
        return linkRepository.save(link);

    }

    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id) {
        return linkRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Link update(@PathVariable Long id, @ModelAttribute Link link) {
        return linkRepository.save(link);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        linkRepository.deleteById(id);

    }
}
