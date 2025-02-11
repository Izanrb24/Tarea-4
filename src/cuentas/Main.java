package cuentas;

/**
 * Clase principal con el punto de entrada del programa.
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        System.out.println("El saldo actual es " + cuenta1.getSaldo());

        // Llamada al método operativa_cuenta
        CCuenta.operativa_cuenta(cuenta1, 2300);
        CCuenta.operativa_cuenta(cuenta1, 695);

        System.out.println("Saldo final: " + cuenta1.getSaldo());
    }
}
