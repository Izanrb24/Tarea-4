package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor vacío
     */
    public CCuenta() {}

    /**
     * Constructor con parámetros
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * @return saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para ingresar dinero en la cuenta
     * @param cantidad Monto a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo += cantidad;
    }

    /**
     * Método para retirar dinero de la cuenta
     * @param cantidad Monto a retirar
     * @throws Exception Si la cantidad es negativa o mayor que el saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo -= cantidad;
    }

    /**
     * Método que encapsula operaciones sobre la cuenta
     * @param cuenta Cuenta sobre la que operar
     * @param cantidad Cantidad a operar
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}

