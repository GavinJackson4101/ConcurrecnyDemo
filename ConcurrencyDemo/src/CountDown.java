public class CountDown implements Runnable{

    //create run method for counting down
    public void run(){
        for(int i = 20; i >= 0; i--)
            System.out.println(i);
    }
}