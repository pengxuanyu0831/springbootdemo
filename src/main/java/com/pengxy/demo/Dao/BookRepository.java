package com.pengxy.demo.Dao;

import com.pengxy.demo.entity.Books;
import org.elasticsearch.client.ElasticsearchClient;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookRepository extends ElasticsearchRepository<Books,Integer> {
    List<Books> findBooksByNamesLike(String bookname);
}
