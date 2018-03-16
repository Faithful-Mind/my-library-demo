package com.lpyy.library.model;

/**
 * 加入图书馆的书。<br/>
 * The model.Book added to library.
 *
 * @author Faithful-Mind
 */
public class Book implements Comparable<Book> {
    private final String name;
    // TODO add publication date, author, pages etc.
    // private LocalDate publicationDate;
    // private Person author;
    // private int pages;
    private final String press;
    private final String isbn;
    private final Category category;
    private final int id; // Id starts from 1.
    private boolean lent;

    public Book(String name, String press, String isbn, Category category, int id) {
        super();
        this.name = name;
        this.press = press;
        this.isbn = isbn.replace(" ", "").replace("-", "");
        this.category = category;
        this.id = id;
        this.lent = false;
    }

    /**
     * 用于排序,分类相同比较id。 For sorting in a bookshelf. Compare its id if same category.
     */
    @Override
    public int compareTo(Book o) {
        if (this.category.compareTo(o.category) == 0) {
            return this.id - o.id;
        } else {
            return this.category.compareTo(o.category);
        }
    }

    @Override
    public String toString() {
        return "[" + name + ", press=" + press + ", isbn=" + isbn + ", category=" + category + ", id=" + id + ", "
                + (lent ? "已借出" : "在库") + "]";
    }

    public boolean isLent() {
        return lent;
    }

    public void setLent(boolean lent) {
        this.lent = lent;
    }

    public String getName() {
        return name;
    }

    public String getPress() {
        return press;
    }

    public String getIsbn() {
        return isbn;
    }

    public Category getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }
}