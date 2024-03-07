package Library;
public class Book {
        String title;
        String author;
        String genre;
        String datepub;
        char available;
        int quantity;
        int loantime;
        String user;
        String loandate;
        String returndate;
        
        
        public Book(String title, String author, String genre, String datepublic, char available, int quantity, int loantime, String user, String loandate, String returndate) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.datepub = datepublic;
            this.available = available;
            this.quantity = quantity;
            this.loantime = loantime;
            this.user = user;
            this.loandate = loandate;
            this.returndate = returndate;
        }

        public void Quantity(){
            System.out.println("Cantidad disponible: " + this.quantity);
        }
        
        public void Title(){
            System.out.println(this.title);
        }
        
        public void User(){
            System.out.println("el usuario " + this.user + " está usando el libro " + this.title + " desde el día: " + this.loandate);
        }
        
        public void Available(){
            System.out.println("el libro " + this.title + " tiene disponibilidad: " + this.available);
        }
        
        public void Search(){
            
        }
        
        public void Information(){
            System.out.println("The title is: " + this.title);
            System.out.println("The author of the book is: "+ this.author);
            System.out.println("the genre of the literary work is: " + this.genre);
            System.out.println("The publication date of the book is: " + this.datepub);
            System.out.println("Are there books available? " + this.available);
            System.out.println("How many books are there? " + this.quantity);
            System.out.println("The loan time (in days) is: " + this.loantime);
            System.out.println("The user is: " + this.user);
            System.out.println("The loan date: " + this.loandate);
            System.out.println("The return date: " + this.returndate);
            System.out.println(" ");
            
        }
        
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDatepub() {
        return datepub;
    }

    public void setDatepub(String datepub) {
        this.datepub = datepub;
    }

    public char getAvailable() {
        return available;
    }

    public void setAvailable(char available) {
        this.available = available;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLoantime() {
        return loantime;
    }

    public void setLoantime(int loantime) {
        this.loantime = loantime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLoandate() {
        return loandate;
    }

    public void setLoandate(String loandate) {
        this.loandate = loandate;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }
        
}
