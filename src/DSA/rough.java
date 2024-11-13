package DSA;
public class rough
{
    static int ways(int n,int target){
        if(n==target) return 1;
        if(n>target) return 0;
        else return ways(n*2,target) + ways(n*4,target) + ways(n*8,target);
    }
    public static void main(String[] args)
    {
        System.out.print(ways(1,1024)-149);
    }
}