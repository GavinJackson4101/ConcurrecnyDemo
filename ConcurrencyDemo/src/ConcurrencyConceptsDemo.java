public class ConcurrencyConceptsDemo {
    public static void main(String[] args){
        //use constructors to call countUp and countDown
        CountUp countUp = new CountUp();
        CountDown countDown = new CountDown();

        //create threads using constructed methods
        Thread t1 = new Thread(countUp);
        Thread t2 = new Thread(countDown);

        //start each thread in correct order
        t1.start();
        t2.start();
    }
}