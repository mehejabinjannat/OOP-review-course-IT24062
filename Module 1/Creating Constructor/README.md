# 📚 Book Management System (Java OOP)

This is a simple Java project demonstrating **Object-Oriented Programming (OOP)** concepts such as:
- Constructors (Default & Parameterized)
- Encapsulation
- Method Overloading (Constructor Overloading)
- Getters and Setters
- `toString()` Method

---

## 📁 Project Structure

The project contains two classes:

- `Book` → Represents a book with properties and behaviors  
- `BookAccess` → Main class to test the Book class  

---

## 📌 Book Class

```java
public class Book {
    private String title;
    private String author;
    private float price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    public String toString() {
        return "Title - " + this.title + "\nAuthor - "
                + this.author + "\nPrice - " + String.format("%.2f", this.price);
    }
    public Book() {
        this.title = null;
        this.author = null;
    }
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
```
## 📌 BookAccess Class (Main Program)
public class BookAccess {
    public static void main(String s[]) {

        // Using parameterized constructor
        Book book1 = new Book("Atomic Habits", "James Clear", 30.00f);

        // Using default constructor + setters
        Book book2 = new Book();
        book2.setTitle("Sapiens");
        book2.setAuthor("Yuval Noah Harari");
        book2.setPrice(25.00f);

        System.out.println("The first book object is ");
        System.out.println(book1);

        System.out.println("The second book object is ");
        System.out.println(book2);
    }
}
## ▶️ Output Example
~~~
The first book object is 
Title - Atomic Habits
Author - James Clear
Price - 30.00

The second book object is 
Title - Sapiens
Author - Yuval Noah Harari
Price - 25.00

~~~
## 🎯 Concepts Covered
~~~
Java Classes & Objects
Encapsulation
Constructors (Default & Parameterized)
Method Overloading
Getters & Setters
toString() Method
~~~

