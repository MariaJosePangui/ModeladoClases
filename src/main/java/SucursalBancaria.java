import java.util.ArrayList;

class SucursalBancaria {
    private String codigoSucursal;
    private String codigoPostal;
    private ArrayList<CuentaBancaria> cuentasAhorro = new ArrayList<>();
    private ArrayList<CuentaBancaria> cuentasCorrientes = new ArrayList<>();

    public SucursalBancaria(String codigoSucursal, String codigoPostal) {
        this.codigoSucursal = codigoSucursal;
        this.codigoPostal = codigoPostal;
    }

    public void agregarCuentaAhorro(CuentaBancaria cuenta) {
        cuentasAhorro.add(cuenta);
    }

    public void agregarCuentaCorriente(CuentaBancaria cuenta) {
        cuentasCorrientes.add(cuenta);
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public ArrayList<CuentaBancaria> getCuentasAhorro() {
        return cuentasAhorro;
    }

    public ArrayList<CuentaBancaria> getCuentasCorrientes() {
        return cuentasCorrientes;
    }
}