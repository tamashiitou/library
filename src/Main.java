public class Main {
    Library library = new Library();
    Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        showMenu();
        while(true){
            String calledFuntionc = sc.nextLine();
            if(calledFunction==1){
                lendBook();
            }
        }
    }
    public static void showMenu(){
        System.out.println("Please choose a function:");
        System.out.println("1. Lend books");
        System.out.println("2. Redeem books");
        System.out.println("3. Show library information");
        System.out.println("4. Show customer information");
    }
    public static void lendBook(){
        System.out.println("Type in book information:");
        System.out.print("Name: ")
    }
}

