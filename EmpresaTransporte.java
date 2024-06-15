public class EmpresaTransporte {
    private static Camion[] camiones = new Camion[4];

    public static void main(String[] args) {
        // Inicializar los camiones
        camiones[0] = new Camion("057809", 2400, 140);
        camiones[1] = new Camion("123456", 2000, 130);
        camiones[2] = new Camion("789012", 3000, 150);
        camiones[3] = new Camion("345678", 1800, 120);

        // Ejemplo de carga de un camión
        cargarCamion("057809", 500);

        // Ejemplo de búsqueda del mejor camión para una carga
        Camion mejorCamion = encontrarMejorCamion(1500);
        if (mejorCamion != null) {
            System.out.println("El mejor camión para la carga es: " + mejorCamion.getMatricula());
        } else {
            System.out.println("No hay camiones disponibles con suficiente capacidad.");
        }
    }

    public static boolean cargarCamion(String matricula, float peso) {
        for (Camion camion : camiones) {
            if (camion.getMatricula().equals(matricula)) {
                if (camion.cargar(peso)) {
                    System.out.println("Carga exitosa en el camión " + matricula);
                    return true;
                } else {
                    System.out.println("El camión " + matricula + " no tiene suficiente capacidad.");
                    return false;
                }
            }
        }
        System.out.println("Camión no encontrado.");
        return false;
    }

    public static Camion encontrarMejorCamion(float peso) {
        Camion mejorCamion = null;
        for (Camion camion : camiones) {
            if (camion.getCapacidadCarga() - camion.getCargaActual() >= peso) {
                if (mejorCamion == null || camion.getConsumoGasolina() < mejorCamion.getConsumoGasolina()) {
                    mejorCamion = camion;
                }
            }
        }
        return mejorCamion;
    }
}
