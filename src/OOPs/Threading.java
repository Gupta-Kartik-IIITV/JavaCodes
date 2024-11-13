package OOPs;
import java.util.*;
import java.util.concurrent.SynchronousQueue;

class Thread1 implements Runnable{
    public ArrayList<Double> f;
    int n;
    Thread1(ArrayList<Double> f,int n){
        this.f = f;
        this.n = n;
    }
    @Override
    public void run(){
        int cnt;
        f.add((double)0);
        f.add((double)1);
        for(cnt = 2;cnt<n;cnt++){
            f.add(f.get(cnt-1) + f.get(cnt-2));
            System.out.println("Fibbonacci Number= " + f.getLast()+" ");
        }
    }

}

class Thread2 implements Runnable{
    public  ArrayList<Double> currentSum;
    ArrayList<Double> f;
    int n;
    Thread2(ArrayList<Double> f,ArrayList<Double> currentSum,int n){
        this.f = f;
        this.currentSum = currentSum;
        this.n = n;
    }


    @Override
    public void run() {
        currentSum.add((double)0);
        currentSum.add((double)1);
        int i = 2;
        while(i<n)  {
            currentSum.add(currentSum.getLast() + f.getLast());
            System.out.println("Sum = " + currentSum.getLast()+" ");
            i++;
        }
    }
}

class Thread3 implements Runnable{
    public ArrayList<Integer> isPrime;
    ArrayList<Double> f;
    int n;
    Thread3(ArrayList<Double> f,ArrayList<Integer> isPrime,int n){
        this.f = f;
        this.isPrime = isPrime;
        this.n = n;
    }

    public int prime(double a){
        if(a<0) return 0;
        if(a==2) return 1;
        for(int i=2;i*i<=a;i++){
            if(a%i==0) return 0;
        }
        return 1;
    }

    @Override
    public void run() {
        isPrime.add(0);
        isPrime.add(0);
        int i = 2;
        while(i<n){
            isPrime.add(prime(f.getLast()));
            System.out.println("IsPrime = " + isPrime.getLast()+" ");
            i++;
        }
    }
}


public class Threading {
    public static void main(String[] args) {
        ArrayList<Double> f = new ArrayList<>();
        ArrayList<Double> currsum = new ArrayList<>();
        ArrayList<Integer> isPrime = new ArrayList<>();



        Thread1 th1 = new Thread1(f,1000);
        Thread2 th2 = new Thread2(f,currsum,1000);
        Thread3 th3 = new Thread3(f,isPrime,1000);

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        Thread t3 = new Thread(th3);



        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();



    }


}
