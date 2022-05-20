import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpotifyTest {
    @Test

    public void TestSpotigy (){

        String respuestaEsperada = "Decargando Cancion";

        Usuario usuario1 =  new Usuario("Premium", 1);
        ServicioDescarga servicioDescarga =new ServicioDescarga();

        Spotify proxy = new ProxyDescarga(usuario1, servicioDescarga);



    }

}