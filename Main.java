public class Main {
    public static void main(String[] args) {
        Book book = new Book("Джордж", "Оруэлл", 10, "1984", 1949, 384);
        System.out.println(book);

        String info = book.estimatePrice(book.getPages()) +
                "\n" +
                book.isBig(book.getPages()) +
                "\n" +
                book.matches("Оруэлл");
        System.out.println(info);
    }
}
