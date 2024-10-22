import java.util.ArrayList;
public class Library {
  private ArrayList<Book> books = new ArrayList<>();
  
  public void addBook(Book newBook){
    boolean available = false;
    for(Book book : books){
      if(book.getName().equals(newBook.getName()) && book.getWriter().equals(newBook.getWriter())){
        book.setQuantity(book.getQuantity()+newBook.getQuantity());
        available=true;
        break;
      }
      else{
        available = false;
      }
    }
    if(!available){
      books.add(newBook);
    }
  }
  
  public void eraseBook(Book erasedBook){
    boolean available = false;
    for(Book book : books){
      if(book.getName().equals(erasedBook.getName()) && book.getWriter().equals(erasedBook.getWriter())){
        if (book.getQuantity() >= erasedBook.getQuantity()) {
          book.setQuantity(book.getQuantity() - erasedBook.getQuantity());
        } else {
          System.out.println("There's not enough book!");
        }
        available = true;
        break;
      }
    }
    if(!available) System.out.println("There's no such book to erase!");
  }
  
  public int getBookNumbers(Book book){
    return books.size();
  }
  
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (Book book : books) {
      result.append("Book: ");
      if(book.getName().length()<=20){
        result.append(book.getName());
        for(int i=1; i<22-book.getName().length(); i++){
          result.append(" ");
        }
        result.append("   ||");
      }
      else  {
        result.append(book.getName().substring(0,20)).append("... ||");
      }
        
        result.append(" Writer: ").append(book.getWriter()).append(" - Quantity: ").append(book.getQuantity()).append(" *** \n");
    }
    return result.toString();
  }
}

