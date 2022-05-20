public class Usuario {
    private String tipoDeCuenta;
    private int id;

    public Usuario(String tipoDeCuenta, int id) {
        this.tipoDeCuenta = tipoDeCuenta;
        this.id = id;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
