package Entity;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/23 23:31
 */
public class Books {
    private String bookname;
    private String author;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( "{\"Book\":{" );
        sb.append( "\"id\":" )
                .append( id );
        sb.append( ",\"bookname\":\"" )
                .append( bookname ).append( '\"' );
        sb.append( ",\"author\":\"" )
                .append( author ).append( '\"' );
        sb.append( "}}" );
        return sb.toString();
    }
}
