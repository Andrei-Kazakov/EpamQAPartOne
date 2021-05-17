public class Book {

    private final int id;
    private final String name;
    private final String author;
    private final String publisher;
    private final int yearOfPublishing;
    private final int pages;
    private final int price;
    private final String binding;

    public Book(int id, String name, String author, String publisher, int yearOfPublishing, int pages, int price, String binding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {return id;}

    public String getName() {return name;}

    public String getAuthor() {return author;}

    public String getPublisher() {return publisher;}

    public int getYearOfPublishing() { return yearOfPublishing;}

    public int getPages() {return pages;}

    public int getPrice() {return price;}

    public String getBinding() {return binding;}

    @Override
    public  String toString() {
        return "Book{" +
                "id=" + id +
                ", Название='" + name + '\'' +
                ", Автор='" + author + '\'' +
                ", Издательство='" + publisher + '\'' +
                ", Год публикации=" + yearOfPublishing +
                ", Страницы=" + pages +
                ", Цена=" + price +
                ", Тип переплета='" + binding + '\'' +
                '}';
    }
}
