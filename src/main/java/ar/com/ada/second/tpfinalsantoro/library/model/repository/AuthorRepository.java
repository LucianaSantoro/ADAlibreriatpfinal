package ar.com.ada.second.tpfinalsantoro.library.model.repository;

import ar.com.ada.second.tpfinalsantoro.library.model.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AuthorRepository implements JpaRepository<Author, Long> {

    @Autowired
    private AuthorRepository authorRepository;


    @Override
    public List<Author> findAll() {
        return null;
    }

    @Override
    public List<Author> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Author> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Author> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Author author) {

    }

    @Override
    public void deleteAll(Iterable<? extends Author> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Author> S save(S s) {
        return null;
    }

    @Override
    public <S extends Author> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Author> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Author> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Author> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Author getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Author> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Author> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Author> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Author> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Author> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Author> boolean exists(Example<S> example) {
        return false;
    }
}
