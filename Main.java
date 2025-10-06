public class Main {
    public static void main(String[] args) {
        Author author = new Author("Джордж", "Оруэлл", 1);
        Book book = new Book("1984", 1956, 384, author);
        System.out.println(book);

        String info = book.estimatePrice(book.getPages()) + "\n" + book.isBig() + "\n" + book.matches("Оруэлл");
        System.out.println(info);
    }
}
