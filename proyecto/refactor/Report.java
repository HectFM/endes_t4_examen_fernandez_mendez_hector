package refactor;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printReport() {
        String titulo=" ", conclusion=" ";

        // imprimir título
        imprimirTitulo(titulo);

        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...

        // imprimir conclusión
        imprimirConclusion(conclusion);

    }
    private void imprimirTitulo(String titulo){
        System.out.println(titulo);
    }
    private void imprimirConclusion(String conclusion){
        System.out.println(conclusion);
    }
}