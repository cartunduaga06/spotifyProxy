public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Usuario usuario1 =  new Usuario("Premium", 1);
        ServicioDescarga servicioDescarga =new ServicioDescarga();

        Spotify proxy = new ProxyDescarga(usuario1, servicioDescarga);

                proxy.Descargar("basbcacs");
    }
}