package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        // Llamamos al método operativa_cuenta y pasamos el valor para el parámetro cantidad
        operativa_cuenta(cuenta1, 695);  // Puedes cambiar este valor según las operaciones
    }

    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;

        // Mostramos el saldo actual
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        // Operaciones de retirar e ingresar
        try {
            cuenta1.retirar(2300);  // Operación de retirar un monto fijo
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);  // Usamos el parámetro cantidad para ingresar
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}