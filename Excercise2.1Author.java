package com.exercise2_1;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0; 
    }
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    @Override
    public String toString() {
        return "Book[name=" + name + ",author=" + author + ",price=" + price + ",qty=" + qty + "]";
    }
}
public class TestMain {
    public static void main(String[] args) {
        
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(a1);  
        a1.setEmail("ahteck@somewhere.com");
       
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());
        
        Book b1 = new Book("Java for dummies", a1, 8.8, 88);
        System.out.println(b1); 
        b1.setPrice(9.9);
        b1.setQty(99);
        
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author's name: " + b1.getAuthor().getName());  
        System.out.println("author's email: " + b1.getAuthor().getEmail());      }
} 
