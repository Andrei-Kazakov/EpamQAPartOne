import java.util.List;

public interface IBookManger {
    List<Book> filteringByAuthorBook(String author);
    List<Book> filteringByPublisherBook(String publisher);
    List<Book> sortingByYearOfPublishingBook(int yearOfPublishing);
}
