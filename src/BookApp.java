public class BookApp {

  public static void main(String[] args) {

      Book book = new Book();
      book.setTitle("Crazy Rich Asians");
      book.setAuthor("Kevin Kwan");
      book.setDescription("They are Asians and they are crazy rich.");

      Book b = new Book("A Walk to Remember", "Nicholas Sparks", "Popular boy falls in love with outcast girl, they start dating, then he finds out she has cancer. He spends the rest of her short life helping her check off items on her bucket list.");
      System.out.println(b.getDisplayText());
      System.out.println(book.getDisplayText());
    }


    public static void Books(String[] args)
    {


    }

}


