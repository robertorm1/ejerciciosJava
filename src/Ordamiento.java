public class Ordamiento {

    public int[] impares(){

        int[] entrada ={7,2,1,4,8,5,3,1};
        int[] entrada1 ={1,3,2,8,5,4};
        int auxiliar=0;

        for(int i=0;i < entrada.length-1;i++){
            for(int j=i;j < entrada.length;j++){

                if(entrada[i]>entrada[j]){
                    //Validar si el primer elemento es impar
                    if(entrada[i]%2!=0){
                        //Validar si el segundo elemento es impar
                        if(entrada[j]%2!=0){
                            auxiliar=entrada[i];
                            entrada[i]=entrada[j];
                            entrada[j]=auxiliar;
                        }
                    }
                }
            }
        }

        return entrada;

    }

}
