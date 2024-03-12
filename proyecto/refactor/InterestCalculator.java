package refactor;

/*
 * Refactoriza el siguiente código de forma para evitar utilizar un número mágico
 * y repetir el número cada vez que se utiliza.
 */

public class InterestCalculator {
    /*
     * Declaramos una constante para almacenar los dias del año.
     */
    private static final int DIAS=365;
    double calculateInterest(double principal, double rate, int time) {
        // Cálculo del interés compuesto para 365 días al año
        return principal * Math.pow(1 + (rate /DIAS), time *DIAS);
    }
}
