package com.mrn.springit;

import com.mrn.springit.domain.Comment;
import com.mrn.springit.domain.Link;
import com.mrn.springit.repositories.CommentRepository;
import com.mrn.springit.repositories.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	//@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
		return args -> {
			Link link = new Link("Getting started with Spring Boot 2", "www.google.com");
			linkRepository.save(link);

			Comment comment = new Comment("This is a spring project", link);
			commentRepository.save(comment);

			// add comment to the link
			link.addComment(comment);

			Link firstLink = linkRepository.findByTitle("Getting started with Spring Boot 2");
			System.out.println(link.getTitle());

		};
	}


}
