public class Vocales {

    public String limpiarCadena(){

        String entrada="This website is for losers LOL!";

        return entrada.replaceAll("[aeiouAEIOU]", "").toString();
    }
    
}
