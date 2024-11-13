package OOPs;
import java.util.*;

class Thread1 extends Thread{
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
            System.out.println("Fibonacci Number= " + f.getLast()+" ");
        }
    }

}

class Thread2 extends Thread{
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

class Thread3 extends Thread{
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

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Terms: ");
        int n = sc.nextInt();

        Thread1 t1 = new Thread1(f,n);
        Thread2 t2 = new Thread2(f,currsum,n);
        Thread3 t3 = new Thread3(f,isPrime,n);


        t1.setPriority(3);
        t2.setPriority(2);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();



    }


}
