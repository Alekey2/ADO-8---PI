import java.util.Random;
public class Main{
    
    public static void main (String [] args){
    
    Random x = new Random();
    
    int s[] = new int [7];
    
    for(int i =1; i<=1000000;i++){
        int dado = x.nextInt(6)+1;
        s[dado]++;
    }
    
    for(int i = 1 ; i<7; i++){
       System.out.println(i+ ": "+ s[i]+ " - "+ s[i]/10000.0 + "%");
    }
}
}