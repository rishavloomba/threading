import java.lang.*;
class thread2 extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
try{Thread.sleep(500);}
catch(InterruptedException e){
System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String[] args)
{
thread2 th=new thread2();
th.start();
}
}