package javadoc;

import java.util.ArrayList;
import java.util.List;


/**
 * Clase Cliente
 * La clase Cliente representa a un cliente con información personal y una lista de cuentas bancarias.
 * @author Héctor Fernández Méndez
 * @version 1.0 12/03/2024
 */
public class Cliente {

    /**
     * Nombre del cliente.
     */
    private String nombre;

    /**
     * Apellido del cliente.
     */
    private String apellido;

    /**
     * Identificación única del cliente.
     */
    private String id;

    /**
     * Lista de cuentas bancarias asociadas al cliente.
     */
    private List<CuentaBancaria> cuentas;

    /**
     * Constructor Cliente.
     * Constructor para crear un nuevo cliente con nombre, apellido e identificación.
     *
     * @param nombre   El nombre del cliente.
     * @param apellido El apellido del cliente.
     * @param id       La identificación única del cliente.
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    /**
     * Método getNombre
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre
     * Establece el nombre del cliente.
     *
     * @param nombre El nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getApellido.
     * Obtiene el apellido del cliente.
     *
     * @return El apellido del cliente.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método setApellido
     * Establece el apellido del cliente.
     *
     * @param apellido El nuevo apellido del cliente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método getId
     * Obtiene la identificación única del cliente.
     *
     * @return La identificación única del cliente.
     */
    public String getId() {
        return id;
    }

    /**
     * Método setId
     * Establece la identificación única del cliente.
     *
     * @param id La nueva identificación única del cliente.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Lista cuentas.
     * Obtiene una copia de la lista de cuentas bancarias asociadas al cliente.
     *
     * @return Lista de cuentas bancarias del cliente.
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     * Método agregar cuenta.
     * Agrega una nueva cuenta bancaria a la lista del cliente.
     *
     * @param cuenta La nueva cuenta bancaria a agregar.
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * Método cerrar cuenta
     * Cierra una cuenta bancaria del cliente dado su número de cuenta.
     *
     * @param numeroCuenta El número de cuenta de la cuenta a cerrar.
     * @return true si la cuenta se cerró exitosamente, false de lo contrario.
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    /**
     * Cadena informacion.
     * Muestra el objeto cliente por pantalla.
     *
     * @return Una cadena que representa al cliente y sus cuentas bancarias.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}

