import java.util.ArrayList;

class GestionBanco {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<SucursalBancaria> sucursales = new ArrayList<>();

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarSucursal(SucursalBancaria sucursal) {
        sucursales.add(sucursal);
    }

    public void asociarCuentaACliente(Cliente cliente, CuentaBancaria cuenta) {
        cliente.agregarCuenta(cuenta);
    }

    public ArrayList<CuentaBancaria> obtenerCuentasCliente(Cliente cliente) {
        return cliente.getCuentas();
    }

    public ArrayList<CuentaBancaria> obtenerCuentasAhorroSucursal(SucursalBancaria sucursal) {
        return sucursal.getCuentasAhorro();
    }

    public ArrayList<CuentaBancaria> obtenerCuentasCorrientesSucursal(SucursalBancaria sucursal) {
        return sucursal.getCuentasCorrientes();
    }

}