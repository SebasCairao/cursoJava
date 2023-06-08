package EJ1.Entidades;

public class ClaseBancaria {

    //atributos
    private int numeroCuenta;
    private int dniCliente;
    private double saldoAtual;

    public ClaseBancaria() {
    }

    public ClaseBancaria(int numeroCuenta, int dniCliente, double saldoAtual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoAtual = saldoAtual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public void getNumeroCuenta(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ClaseBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoAtual=" + saldoAtual + '}';
    }
    

}
