import java.util.ArrayList;
import java.util.List;

public class BookManager implements IBookManger {
    private final List<Book> bookList = new ArrayList<>();

    public BookManager() {
        this.createListBooks();
    }

    @Override
    public List<Book> filteringByAuthorBook(String author) {
        return filtering(book -> book.getAuthor().equals(author));
    }

    @Override
    public List<Book> filteringByPublisherBook(String publisher) {
        return filtering(book -> book.getPublisher().equals(publisher));
    }

    @Override
    public List<Book> sortingByYearOfPublishingBook(int yearOfPublishing) {
        List<Book> list = new ArrayList<>();
        for (Book book : bookList){
            if (book.getYearOfPublishing() >= yearOfPublishing){
                list.add(book);
            }
        }
        return list;
    }

    private ArrayList<Book> filtering(Predicate predicate) {
        ArrayList<Book> list = new ArrayList();

        for (Book book : bookList) {
            if (predicate.checked(book)) {
                list.add(book);
            }
        }
        return list;
    }

    private void createListBooks() {
        this.bookList.add(new Book(1, "Эффективная Java", "Джошуа Блох", "ДМК", 2013, 294, 29, "Мягкая обложка"));
        this.bookList.add(new Book(2, "Совершенный код", "Макконнелл Стив", "БХВ-Петербург", 2017, 896, 33, "Твердый переплет"));
        this.bookList.add(new Book(3, "Thinking in Java", "Брюс Эккель", "Питер", 2019, 1168, 88, "Твердый переплет"));
        this.bookList.add(new Book(4, "Алгоритмы на Java", "Роберт Седжвик, Кевин Уэйн", "Вильямс", 2016, 848, 75, "Твердый переплет"));
        this.bookList.add(new Book(5, "Современный Java. Рецепты программирования", "Кен Коузен", "ДМК", 2018, 274, 40, "Твердый переплет"));
        this.bookList.add(new Book(6, "Thinking in Enterprise Java", "Брюс Эккель", "MindView", 2016, 274, 50, "Твердый переплет"));
    }

    interface Predicate {
        boolean checked(Book book);
    }
}
