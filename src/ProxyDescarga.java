public class ProxyDescarga implements Spotify{
    private Usuario usuario;
    private ServicioDescarga servicioDescarga;

    public ProxyDescarga(Usuario usuario, ServicioDescarga servicioDescarga) {
        this.usuario = usuario;
        this.servicioDescarga = servicioDescarga;
    }

    @Override
    public void Descargar(String cancion) {
        if(this.usuario.getTipoDeCuenta().equals("Premium")){
             this.servicioDescarga.Descargar(cancion);
        } else if
            (this.usuario.getTipoDeCuenta().equals("Free")){
            System.out.println("necesita ser usuario premium");
            }

        }

    }

