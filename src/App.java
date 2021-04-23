import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {


        //Obtener el total de pasajeros de un camion
        Pasajeros pasajeros = new Pasajeros();

        ArrayList<int[]> arrayList= new ArrayList<>();
        arrayList.add(new int[]{10,0});
        arrayList.add(new int[]{5,3});
        arrayList.add(new int[]{2,1});

        System.out.println("Pasajeros:"+" "+pasajeros.metros(arrayList));

        //Ordenar acendente solo numeros impares de una arreglo de enteros
        //Metodo de ordenamiento de burbuja

        Ordamiento orden = new Ordamiento();
        for(int i=0;i < orden.impares().length; i++){
            System.out.println(orden.impares()[i]);
        }

        //Numero Maximo
        NumeroMaximo numeroMaximo = new NumeroMaximo();
        System.out.println(numeroMaximo.NumMaximo());

        Vocales vocales = new Vocales();
        System.out.println(vocales.limpiarCadena().toString());

        //Numeros Duplicados
        Duplicados duplicados = new Duplicados();
        for(int i=0;i<duplicados.numeros().size();i++){
            System.out.println(duplicados.numeros().get(i));
        }



   }
}  