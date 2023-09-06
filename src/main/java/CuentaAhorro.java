public class CuentaAhorro extends CuentaBancaria {
    private double porcentajeReajusteAnual;

    public CuentaAhorro(String numeroCuenta, String fechaApertura, double saldo, double porcentajeReajusteAnual) {
        super(numeroCuenta, fechaApertura, saldo);
        this.porcentajeReajusteAnual = porcentajeReajusteAnual;
    }

    @Override
    public String getTipoCuenta() {
        return "Ahorro";
    }

    public double getPorcentajeReajusteAnual() {
        return porcentajeReajusteAnual;
    }

    public void setPorcentajeReajusteAnual(double porcentajeReajusteAnual) {
        this.porcentajeReajusteAnual = porcentajeReajusteAnual;
    }
}