package br.com.icarros.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface AbstractRepo<T , E extends Serializable> extends MongoRepository<T,E>{
    T findByTags(List<String> tags);
}
