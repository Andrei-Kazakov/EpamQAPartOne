import java.util.List;

public class Application {
    public static void main(String[] args) {
        IBookManger manager = new BookManager();
        System.out.println("Список книг заданного автора: ");
        List<Book> listSearch = manager.filteringByAuthorBook("Брюс Эккель");

        for (Book book : listSearch) {
            System.out.println(book.toString());
        }
        System.out.println("\n" + "Список книг заданного издательства: ");
        List<Book> listSearch2 = manager.filteringByPublisherBook("ДМК");

        for (Book book : listSearch2) {
            System.out.println(book.toString());
        }
        System.out.println("\n" + "Список книг выпущенных после заданного года: ");
        List<Book> listSearch3 = manager.sortingByYearOfPublishingBook(2016);

        for (Book book : listSearch3) {
            System.out.println(book.toString());
        }

    }
}
