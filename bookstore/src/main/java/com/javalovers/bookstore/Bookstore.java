package com.javalovers.bookstore;
import Library.Book;
import java.util.Scanner;
public class Bookstore {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Book metamorphosis = new Book("metamorphosis", "Kafka", "Psicológico", "1915", 's',10,5,"Matheo","06/03/24","06/04/24");
        Book luna = new Book("Luna de Plutón","Ángel David Revilla","Ciencia Ficción","2015",'s',30,15,"Brian","07/03/24","07/04/24");
        Book checkmate = new Book("Checkmate", "Bobby Fischer","Deporte","1996",'s',5,29,"Magnus","07/03/24","07/05/24");
        
        
        System.out.println("Escriba que desea hacer, escribe lo que hay dentro de las comillas únicas ('')");
        System.out.println("Cantidad de libros - 'cantidad'");
        System.out.println("Que libros hay - 'libros'");
        System.out.println("Informacion de todos los libros - 'informacion'");
        System.out.println("Usuarios registrados que tiene los libros - 'usuarios'");
        System.out.println("Disponibilidad de libros - 'disponible'");
        System.out.println("");
        String opcion = scanner.next();
        switch(opcion){
            case "cantidad":
                System.out.println("de que libro?, escribelo en minúsculas y pegado (en caso de que tenga separaciones)");
                metamorphosis.Title();
                luna.Title();
                checkmate.Title();
                String titulo = scanner.next();
                switch(titulo){
                    case "metamorphosis" -> metamorphosis.Quantity();
                    case "lunadepluton" -> luna.Quantity();
                    case "checkmate" -> checkmate.Quantity();
                    default -> System.out.println("no se ha escrito el libro, se termina el programa");
                }
                break;
            case "libros":
                System.out.println("libros en estantería:");
                metamorphosis.Title();
                luna.Title();
                checkmate.Title();
                break;
            case "informacion":
                metamorphosis.Information();
                luna.Information();
                checkmate.Information();
                break;
            case "usuarios":
                metamorphosis.User();
                luna.User();
                checkmate.User();
                break;
            case "disponible":
                metamorphosis.Available();
                luna.Available();
                checkmate.Available();
                break;
            default:
                break;
             
        }
        
    }
}
