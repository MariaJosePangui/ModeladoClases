public class CuentaCorriente extends CuentaBancaria {
    private double lineaSobregiro;

    public CuentaCorriente(String numeroCuenta, String fechaApertura, double saldo, double lineaSobregiro) {
        super(numeroCuenta, fechaApertura, saldo);
        this.lineaSobregiro = lineaSobregiro;
    }

    @Override
    public String getTipoCuenta() {
        return "Corriente";
    }

    public double getLineaSobregiro() {
        return lineaSobregiro;
    }

    public void setLineaSobregiro(double lineaSobregiro) {
        this.lineaSobregiro = lineaSobregiro;
    }
}