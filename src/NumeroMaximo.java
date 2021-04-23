import java.util.ArrayList;

public class NumeroMaximo {


    public String NumMaximo(){

        int base=5;
        String entrada="-18";
        String [] parts=entrada.split("");
        ArrayList<Integer> array = new ArrayList<>();
        String salida = "";
        String signo = "-";
        Boolean estado = true;

        if(signo.equals(parts[0])){

            for(int i=1;i< parts.length;i++){
                int aux=Integer.valueOf(parts[i]);
                if(base<aux && estado){
                array.add(base);
                array.add(aux);
                estado = false;
                }else{
                    array.add(aux);
                }
            }

            if(array.size()==1){
                array.add(base);
            }
              

        }else{

            for(int i=0;i< parts.length;i++){
                int aux=Integer.valueOf(parts[i]);
                if(base>aux && estado){
                array.add(base);
                array.add(aux);
                estado = false;
                }else{
                array.add(aux);
                }
            }
            if(array.size()==1){
                array.add(base);
            }

            signo="";
       }   
        

        for(int i=0;i < array.size() ;i++){

            salida+=array.get(i).toString();
        }

        return signo+salida;
    }
}
