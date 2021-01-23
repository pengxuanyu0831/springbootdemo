import Dao.BookRepository;
import Entity.Books;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/24 00:08
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootElasticsearchApplicationTests.class})
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
