# 📚 Book Management System (Java)

This is a simple Java project demonstrating **Object-Oriented Programming (OOP)** concepts such as:
- Classes and Objects
- Encapsulation
- Getters and Setters
- Method Overriding (`toString()`)

---

## 📁 Project Structure

The project contains two classes:

1. `Book` → Represents a book object  
2. `BookAccess` → Main class to create and display books  

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
}
```
## 📌 BookAccess Class (Main Program)
````
public class BookAccess {
    public static void main(String s[]) {
        Book book1 = new Book();
        book1.setTitle("Atomic Habits");
        book1.setAuthor("James Clear");
        book1.setPrice(30.00f);

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
````
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
Getters & Setters
toString() Method
Object Printing
~~~
