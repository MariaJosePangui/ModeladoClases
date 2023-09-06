
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de GestionBanco
        GestionBanco banco = new GestionBanco();

        // Crear clientes
        Cliente cliente1 = new Cliente("Ignacio Fuentes", "12314567-8");
        Cliente cliente2 = new Cliente("Nayareth Rivera", "8765432-1");

        // Agregar clientes al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // Crear cuentas
        CuentaBancaria cuenta1 = new CuentaAhorro("001", "01/01/2023", 1000.0, 0.03);
        CuentaBancaria cuenta2 = new CuentaCorriente("002", "02/01/2023", 2000.0, 500.0);

        // Asociar cuentas a clientes
        cliente1.agregarCuenta(cuenta1);
        cliente2.agregarCuenta(cuenta2);

        // Crear sucursal
        SucursalBancaria sucursal = new SucursalBancaria("S001", "12345");

        // Agregar cuentas a la sucursal
        sucursal.agregarCuentaAhorro(cuenta1);
        sucursal.agregarCuentaCorriente(cuenta2);

        // Agregar sucursal al banco
        banco.agregarSucursal(sucursal);

        // Mostrar información de cliente1 y sus cuentas
        System.out.println("Información de cliente1:");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("RUT: " + cliente1.getRut());
        System.out.println("Cuentas:");

        for (CuentaBancaria cuenta : cliente1.getCuentas()) {
            System.out.println("Número de Cuenta: " + cuenta.getNumeroCuenta() + ", Saldo: " + cuenta.getSaldo());
            System.out.println("Tipo de Cuenta: " + cuenta.getTipoCuenta());
        }

        // Mostrar información de cliente2 y sus cuentas
        System.out.println("\nInformación de cliente2:");
        System.out.println("Nombre: " + cliente2.getNombre());
        System.out.println("RUT: " + cliente2.getRut());
        System.out.println("Cuentas:");

        for (CuentaBancaria cuenta : cliente2.getCuentas()) {
            System.out.println("Número de Cuenta: " + cuenta.getNumeroCuenta() + ", Saldo: " + cuenta.getSaldo());
            System.out.println("Tipo de Cuenta: " + cuenta.getTipoCuenta());
        }
    }
}
