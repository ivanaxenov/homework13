public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(Author author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;

    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public String toString() {
        return title + author.toString() + " " + year;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title);
    }

    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}


