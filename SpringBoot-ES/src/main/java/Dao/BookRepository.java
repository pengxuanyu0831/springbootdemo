package Dao;

import Entity.Books;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;



public interface BookRepository extends ElasticsearchRepository<Books,Integer> {
    List<Books> findBooksByNamesLike(String bookname);
}
