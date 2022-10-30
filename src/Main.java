public class Main {
    public static void printEquals() {
        System.out.println("===============================");
    }

    public static void main(String[] args) {
        Author authorOne = new Author("Александр", " Пушкин");
        Author authorOne1 = new Author("Александр", " Пушкин");
        Book bookOne = new Book(authorOne, "Капитанская дочка: ", 1836);
        Book bookOne1 = new Book(authorOne, "Капитанская дочка: ", 1836);
        Author authorTwo = new Author("Лев", "Толстой");
        Author authorTwo2 = new Author("Лев", "Толстой");
        Book bookTwo = new Book(authorTwo, "Детсво: ", 1852);
        Book bookTwo2 = new Book(authorTwo, "Детсво: ", 1852);
        System.out.println(authorOne.toString());
        System.out.println(bookOne.toString());
        System.out.println(authorTwo.toString());
        System.out.println(bookTwo.toString());

        printEquals();
        System.out.println("Копия автора: " + authorOne.equals(authorOne1));
        System.out.println("Вторая копия автора: " + authorOne.equals(authorTwo));
        System.out.println("Копия автора по hashCode: " + (authorOne.hashCode() == authorOne1.hashCode()));
        System.out.println("Вторая копия автора по hashCode: " + (authorOne.hashCode() == authorTwo.hashCode()));

        printEquals();
        System.out.println("Копия книги: " + bookOne.equals(bookOne1));
        System.out.println("Вторая копия книги: " + bookOne.equals(bookTwo));
        System.out.println("Копия книги по hashCode: " + (bookOne.hashCode() == bookOne1.hashCode()));
        System.out.println("Вторая копия книги по hashCode: " + (bookOne.hashCode() == bookTwo.hashCode()));


    }
}