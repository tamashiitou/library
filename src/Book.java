public class Book {
  private String name;
  private String writer;
  private int year;
  private int quantity;
  public Book(String name, String writer, int year, int quantity){
    this.name=name;
    this.writer=writer;
    this.year=year;
    this.quantity=quantity;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setWriter(String writer){
    this.writer=writer;
  }
  public void setYear(int year){
    this.year=year;
  }
  public void setQuantity(int quantity){
    this.quantity=quantity;
  }
  public String getName(){
    return name;
  }
  public String getWriter(){
    return writer;
  }
  public int getYear(){
    return year;
  }
  public int getQuantity(){
      return quantity;
  }
}
