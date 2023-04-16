package day17;

public class ConstractorCall {
    int x=5;
    ConstractorCall(){
        System.out.println("-x" + x);
    }
    ConstractorCall(int x){
        this();
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        ConstractorCall c1=new ConstractorCall(4);

        ConstractorCall c2=new ConstractorCall();
    }
}
