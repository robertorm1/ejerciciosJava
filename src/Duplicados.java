import java.util.ArrayList;

public class Duplicados {

    public ArrayList<Integer> numeros(){

        int[] entrada={1,2,3,1,2,1,2,3};
        ArrayList<Integer> bd = new ArrayList<>();
        int contador=0;
    

        for(int i=0; i < entrada.length;i++){

            int auxiliar = entrada[i];
            boolean indice = bd.contains(auxiliar);

            if(!indice){
                bd.add(auxiliar);
            }else{
                for(int a=0;a<bd.size()-1;a++){
                   if(auxiliar == bd.get(a)){
                       contador++;
                   }
                }
                if(contador>2){
                    bd.add(auxiliar);
                }
            }
        }

        
        return bd;

    }
    
}
