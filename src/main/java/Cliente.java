import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String rut;
    private ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
        cuenta.setCliente(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setCuentas(ArrayList<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }
}