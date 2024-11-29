class Book{
    String title;
    String author;
    double price;

    // TODO : 1
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // TODO : 2
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // TODO: Complete the rest of this constructor.
    }

    // TODO : 3
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
    }

    // TODO : 4 Think about the case if new price is invalid (e.g., negative)
    public void updatePrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
        }
        else {
            System.out.println("ERROR!: PLZ INPUT NEW PRICE");
        }
    }

    public void applyDiscount(double discountPercen) {
        if (discountPercen > 0.0 && discountPercen < 100.0) {
            double newprice = (price * discountPercen) / 100;
            price -= newprice;
            System.out.printf("Discount %.2f%%. New price: $%.2f%n", discountPercen, price);
        } else {
            System.out.println("Error!: plz input new discount");
        }
    }

    public static void main(String[] args) {
        Book unknownBook = new Book();
        unknownBook.displayDetails();
        System.out.println();

        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 100.00);
        hp1Book.displayDetails();
        System.out.println();

        hp1Book.updatePrice(-32000.00);
        System.out.println();

        Book book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 100.00);
        book.displayDetails();
        System.out.println();
        book.applyDiscount(-20);  // Invalid
        book.applyDiscount(0);    // Invalid
        System.out.println();
        book.applyDiscount(0.5);  // Valid
        book.displayDetails();
        System.out.println();
        book.applyDiscount(25.00); // Valid
        book.displayDetails();
        System.out.println();
        book.applyDiscount(50);    // Valid
        book.displayDetails();
        System.out.println();
        book.applyDiscount(100.00); // Invalid
        book.applyDiscount(150); // Invalid


    }
}