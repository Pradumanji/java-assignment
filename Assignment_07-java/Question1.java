class main extends Thread{
    public void run() {
        for (char i = 'a'; i<='z'; i++)
          System.out.print(i+",");
          
        }
}
public class Question1 {
    public static void main(String[] args) {
      main thread = new main();
      thread.start();
  
    }
   
  }
  