import java.util.ArrayList;

public class Pasajeros {

    public int metros(ArrayList<int[]> cantidad){

        int count1=0;
        int count2=0;

        for(int i=0;i < cantidad.size()-1 ;i++){
            int[] total = cantidad.get(i);
            count1+=total[0];
            count2+=total[1];
        }

           return count1 - count2;
    }
    
}
