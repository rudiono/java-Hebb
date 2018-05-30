import java.awt.*;
import java.util.*;
public class Hebb_Rule {
    public double bobot[]={0,0};
    double bias, yOut;
    int y;
    int epoh;
 
    void learn(double[][] inputan,double[] target){
        epoh=0;
        double bias=1;
        for(int a=0; a<inputan.length; a++){
            //pencarian bobot
            for(int b=0; b<inputan[0].length; b++){
                bobot[b]=bobot[b]+inputan[a][b]*target[a];
            }
            //pencarian bias
            bias+=1*target[a];
        }
    }
 
    void test(double in1, double in2){
        yOut=bias+in1*bobot[0]+in2*bobot[1];
 
        //penggunaan pengaktifan biner
        if(yOut>=2)
         y=1;
        else
         y=0;
 
        System.out.println((int)in1+" "+(int)in2+" = "+(int)y);
    }
 
    public static void main(String haripinter[]){
        Hebb_Rule hebb = new Hebb_Rule();
        double data[][] = {{1,1},{4,2},{2,1},{1,4}};
        double target[] = {0,1,0,1};
        hebb.learn(data, target);
        
        hebb.test(1, 1);
        hebb.test(4, 2);
        hebb.test(2, 1);
        hebb.test(1, 4);
        
    }
}
