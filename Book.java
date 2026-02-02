public class Book {
    
    private String title;

    public String toString() {
        return "Book title: " + title;
    }

    public String getTitle() {
        return title;
    }

    public Book() {
        title = "Untitled";
    }

    public Book(String title) {
        this.title = title;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Book other = (Book) obj;
        return title.equals(other.title);

            
    }

}
