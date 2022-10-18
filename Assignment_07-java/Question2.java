
import java.util.*;
import java.io.*;

class Clicker implements Runnable {
int click ;
boolean running=true;
Thread t;
public Clicker(int p,int i) {
    this.click=i;
t = new Thread(this);
if(p<=1)
t.setPriority(Thread.MIN_PRIORITY);
else
t.setPriority(p);
}
public void run() {
while (running) {
System.out.print(click--+" ");
if(click<=0)
  running=false;
}
System.out.println( t.getPriority()+"process exit");
}
public void start() {
t.start();
}
}
class Question2{
    public static void main(String args[]) {
         Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        
      for (int i=0;i<12 ;i++ ) {
          Clicker hi = new Clicker(Thread.MAX_PRIORITY-i,i);
          hi.start();
      }
  }
}