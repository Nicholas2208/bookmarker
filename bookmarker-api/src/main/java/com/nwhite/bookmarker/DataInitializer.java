package com.nwhite.bookmarker;

import com.nwhite.bookmarker.domain.Bookmark;
import com.nwhite.bookmarker.domain.BookmarkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository repository;

    public DataInitializer(BookmarkRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null, "SivaLabs", "https://sivalabs.in", Instant.now()));
        repository.save(new Bookmark(null, "Spring Boot", "https://spring.io/blog", Instant.now()));
        repository.save(new Bookmark(null, "Quarkus", "https://quarkus.io", Instant.now()));
        repository.save(new Bookmark(null, "Micronaut", "https://micronaut.io", Instant.now()));
        repository.save(new Bookmark(null, "JOOQ", "https://jooq.org", Instant.now()));
        repository.save(new Bookmark(null, "Baeldung", "https://www.baeldung.com", Instant.now()));
        repository.save(new Bookmark(null, "Spring Guides", "https://spring.io/guides", Instant.now()));
        repository.save(new Bookmark(null, "Spring Initializr", "https://start.spring.io", Instant.now()));
        repository.save(new Bookmark(null, "Spring Boot Docs", "https://docs.spring.io/spring-boot", Instant.now()));
        repository.save(new Bookmark(null, "Spring Data JPA", "https://docs.spring.io/spring-data/jpa", Instant.now()));
        repository.save(new Bookmark(null, "Spring Security", "https://docs.spring.io/spring-security", Instant.now()));
        repository.save(new Bookmark(null, "Hibernate ORM", "https://hibernate.org/orm", Instant.now()));
        repository.save(new Bookmark(null, "PostgreSQL", "https://www.postgresql.org", Instant.now()));
        repository.save(new Bookmark(null, "Testcontainers", "https://testcontainers.com", Instant.now()));
        repository.save(new Bookmark(null, "Docker", "https://www.docker.com", Instant.now()));
        repository.save(new Bookmark(null, "Kubernetes", "https://kubernetes.io", Instant.now()));
        repository.save(new Bookmark(null, "Gradle", "https://gradle.org", Instant.now()));
        repository.save(new Bookmark(null, "Maven", "https://maven.apache.org", Instant.now()));
        repository.save(new Bookmark(null, "Lombok", "https://projectlombok.org", Instant.now()));
        repository.save(new Bookmark(null, "MapStruct", "https://mapstruct.org", Instant.now()));
    }
}
