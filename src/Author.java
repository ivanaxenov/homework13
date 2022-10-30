public class Author {
    private String name;
    private String lastName;


    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return getName() + " " + getLastName();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return lastName.equals(author.lastName) && name.equals(author.name);
    }

    public int hashCode() {
        return java.util.Objects.hash(lastName, name);
    }


}


