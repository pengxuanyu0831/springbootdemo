package com.pengxy.demo;

import com.pengxy.demo.Dao.BookRepository;
import com.pengxy.demo.entity.Books;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/23 23:47
 */

@SpringBootTest
public class SpringbootElasticsearchApplicationTests {
    @Autowired
    BookRepository bookRepository;

    @Test
    public void createIndex2(){
        Books book = new Books();
        book.setId(1);
        book.setBookname("西游记");
        book.setAuthor( "吴承恩" );
        bookRepository.index( book );
    }

    @Test
    public void useFind() {
        List<Books> list = bookRepository.findBooksByNamesLike( "游" );
        for (Books book : list) {
            System.out.println(book);
        }

    }
}
