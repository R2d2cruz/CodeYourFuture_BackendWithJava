package ClassTwentyfour.models;

import Utils.OwnFunctions;

public class Book {
    private String title;
    private String writer;
    private int pages;
    private final int id;
    private static int n = 0;

    public Book(String title,String writer, int blocks){
        this.title = OwnFunctions.capitalizeString(title);
        this.writer = OwnFunctions.capitalizeWords(writer);
        pages = obtainPages(blocks);
        id = n++;
    }

    public Book(){
        title = "";
        writer = "";
        pages = 0;
        id = n++;
    }

    public String getTitle(){
        return title;
    }

    public String getWriter(){
        return writer;
    }

    public int getId(){
        return id;
    }

    public int getPages(){
        return pages;
    }

    public void setTitle(String title){
        this.title = OwnFunctions.capitalizeString(title);
    }

    public void setWriter(String writer){
        this.writer = OwnFunctions.capitalizeWords(writer);
    }

    public void setPages(int blocks) {
        pages = obtainPages(blocks);
    }

    private static int obtainPages(int blocks){
        return blocks * 7;
    }

    public void printDetails(){
        System.out.printf("\nTitulo: %s\nAutor: %s\nPaginas: %d\n", title, writer, pages);
    }

    @Override
    public String toString(){
        return String.format("Id: %d\tTitulo: %s", id, title);
    }
}
