package OOPs;

public class BoxWeight extends Box{
    int weihgt;

    BoxWeight(int h,int w,int l){
        super(h,w,l);
    }
    public BoxWeight(int h, int w, int l, int weihgt) {
        super(h, w, l);
        this.weihgt = weihgt;
    }

    public static void main(String[] args) {
//        BoxWeight a = new Box(1,2,3);

    }
}


