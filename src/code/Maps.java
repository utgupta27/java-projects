// package code;

// import java.util.*;

// class Book{
//     int id, quantity;
//     String name, author, publisher;
//     Book(int id, String name, String author, String publisher, int quantity){
//         this.id = id;
//         this.name = name;
//         this.author = author;
//         this.publisher = publisher;
//         this.quantity = quantity;
//     }
// }

// public class Maps {
//     public static void main(String[] args){
//         Map<Integer, Book> bookData = new HashMap<Integer, Book>();
//         Book b1= new Book(1, "C++", "Utsav Gupta", "UT PVT LTD", 100);
//         Book b2= new Book(2, "C", "Utsav Gupta", "UT PVT LTD", 100);
//         Book b3= new Book(3, "Python", "Utsav Gupta", "UT PVT LTD", 100);
//         Book b4= new Book(4, "Java", "Utsav Gupta", "UT PVT LTD", 100);
//         Book b5= new Book(5, "Dart", "Utsav Gupta", "UT PVT LTD", 100);
//         bookData.put(1, b1);
//         bookData.put(2, b2);
//         bookData.put(3, b3);
//         bookData.put(4, b4);
//         bookData.put(5, b5);
//         for(Map.Entry<Integer, Book> m : bookData.entrySet()){
//             Book b = m.getValue();
//             System.out.println(m.getKey() + "  " + b.id+"  "+ b.name+"  "+b.author+"  "+b.publisher+"  "+b.quantity);
//         }
//     }
// }


