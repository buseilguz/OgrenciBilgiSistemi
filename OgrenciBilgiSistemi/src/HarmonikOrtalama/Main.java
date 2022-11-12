package HarmonikOrtalama;

public class Main {
    public static void main(String[] args) {
    	int[] array={1,2,3,4,5};
        double hormonic;
        float sum=0;

        for (int i:array){
            sum+=1.0/i;

        }
        hormonic=array.length/sum;
        System.out.println("HORMONÝK ORTALAMA : " + hormonic);
    }
}

