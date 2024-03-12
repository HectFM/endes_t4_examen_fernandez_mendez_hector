package javadoc;
/**
 * Clase Cuenta Bancaria.
 * La clase CuentaBancaria representa una cuenta bancaria con un número de cuenta, saldo y propietario asociado.
 *
 * @author Héctor Fernández Méndez
 * @version 1.0 12/03/2024
 */
public class CuentaBancaria {

    /**
     * Número de cuenta de la cuenta bancaria.
     */
    private String numeroCuenta;

    /**
     * Saldo actual de la cuenta bancaria.
     */
    private double saldo;

    /**
     * Propietario de la cuenta bancaria (objeto Cliente).
     */
    private Cliente propietario;

    /**
     * Constructor para crear una nueva cuenta bancaria con número de cuenta, saldo inicial y propietario.
     *
     * @param numeroCuenta El número de cuenta de la nueva cuenta bancaria.
     * @param saldo        El saldo inicial de la nueva cuenta bancaria.
     * @param propietario  El propietario de la nueva cuenta bancaria (objeto Cliente).
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    /**
     * Obtiene el número de cuenta de la cuenta bancaria.
     *
     * @return El número de cuenta de la cuenta bancaria.
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Establece el número de cuenta de la cuenta bancaria.
     *
     * @param numeroCuenta El nuevo número de cuenta de la cuenta bancaria.
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta bancaria.
     *
     * @return El saldo actual de la cuenta bancaria.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo actual de la cuenta bancaria.
     *
     * @param saldo El nuevo saldo de la cuenta bancaria.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el propietario de la cuenta bancaria.
     *
     * @return El propietario de la cuenta bancaria (objeto Cliente).
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     * Establece el propietario de la cuenta bancaria.
     *
     * @param propietario El nuevo propietario de la cuenta bancaria (objeto Cliente).
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     * Depositar cantidad.
     * Realiza un depósito en la cuenta bancaria aumentando el saldo.
     *
     * @param cantidad La cantidad a depositar en la cuenta bancaria.
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    /**
     * Retirar cantidad.
     * Retira una cantidad de dinero de la cuenta bancaria si hay suficiente saldo.
     *
     * @param cantidad La cantidad a retirar de la cuenta bancaria.
     * @return true si la operación de retiro fue exitosa, false de lo contrario.
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    /**
     * Mostrar Cuenta y Propietaro.
     * Representación en cadena del objeto CuentaBancaria.
     *
     * @return Una cadena que representa la cuenta bancaria y su propietario.
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}