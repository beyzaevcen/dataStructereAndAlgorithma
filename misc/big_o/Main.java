package misc.big_o;

public class Main {
//O(n)
    public static void printItem(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(i+" "+j);
            }
        }


    }

    public static void main(String[] args) {
        printItem(10);
    }
}
