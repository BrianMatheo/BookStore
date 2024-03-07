package com.javalovers.bookstore;
import Library.Book;
import java.util.Scanner;
public class Bookstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Book metamorphosis = new Book("metamorphosis", "Kafka", "Psicológico", "1915", 's',10,5,"Matheo","06/03/24","06/04/24");
        Book luna = new Book("Luna de Plutón","Ángel David Revilla","Ciencia Ficción","2015",'s',30,15,"Brian","07/03/24","07/04/24");
        Book checkmate = new Book("Checkmate", "Bobby Fischer","Deporte","1996",'s',5,29,"Magnus","07/03/24","07/05/24");
        
        Book[] entitulado = new Book[3];
        entitulado[0] = metamorphosis;
        entitulado[1] = luna;
        entitulado[2] = checkmate;
        
        
        System.out.println("Escriba que desea hacer, escribe lo que hay dentro de las comillas únicas ('')");
        System.out.println("Cantidad de libros - 'cantidad'");
        System.out.println("Que libros hay - 'libros'");
        System.out.println("Informacion del libro - 'informacion'");
        System.out.println("Usuarios registrados que tienen algún libro - 'usuarios'");
        System.out.println("Disponibilidad de libros - 'disponible'");
        System.out.println("Buscar libros - 'buscador'");
        System.out.println("");
        String opcion = scanner.next();
        switch(opcion){
            case "cantidad":
                System.out.println("de que libro?, escribelo en minúsculas y pegado (en caso de que tenga separaciones)");
                metamorphosis.Title();
                luna.Title();
                checkmate.Title();
                String cantidad = scanner.next();
                switch(cantidad){
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
                System.out.println("de que libro?, escribelo en minúsculas y pegado (en caso de que tenga separaciones)");
                metamorphosis.Title();
                luna.Title();
                checkmate.Title();
                String informacion = scanner.next();
                switch (informacion) {
                    case "metamorphosis" ->
                metamorphosis.Information();
                    case "lunadepluton" ->
                luna.Information();
                    case "checkmate" ->
                checkmate.Information();
                    default ->
                        System.out.println("no se ha escrito el libro, se termina el programa");
                }
                break;
            case "usuarios":
                System.out.println("de que libro?, escribelo en minúsculas y pegado (en caso de que tenga separaciones)");
                metamorphosis.Title();
                luna.Title();
                checkmate.Title();
                String usuarios = scanner.next();
                switch (usuarios) {
                    case "metamorphosis" ->
                metamorphosis.User();
                    case "lunadepluton" ->
                luna.User();
                    case "checkmate" ->
                checkmate.User();
                    default ->
                        System.out.println("no se ha escrito el libro, se termina el programa");
                }
                break;
            case "disponible":
                metamorphosis.Available();
                luna.Available();
                checkmate.Available();
                break;
            case "buscador":
                System.out.println("diga que libro desea buscar, en minusculas y todo pegado");
                String buscador = scanner.next();
                for(int i = 0;i<entitulado.length;i++){
                    if(buscador.equals(entitulado[i].getTitle())){
                       entitulado[i].Information();  
                    }
                }
                break;
            default:
                break;
             
        }
        
    }
}
