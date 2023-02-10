public class CountUp implements Runnable{

    //create run method for counting up
    public void run() {
        for(int i = 0; i <= 20; i++)
            System.out.println(i);
    }
}