
public class OddNums{

    public static void main(String args[]){
        int count = 0;
        int i = 1;
        while(count < 100){
            if(i % 2 != 0){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}