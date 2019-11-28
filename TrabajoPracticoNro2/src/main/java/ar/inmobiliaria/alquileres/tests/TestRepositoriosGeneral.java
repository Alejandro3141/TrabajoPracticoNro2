package ar.inmobiliaria.alquileres.tests;
/* 
    *    - Reiniciar la BD
    *    - LOS TEST TIENEN UN ORDEN DE EJECUCIÓN
*/
public class TestRepositoriosGeneral {
    public static void main(String[] args) {
        TestConnection.main(null);
        System.out.println("****************************************************");
        TestPropiedadRepository.main(null);
        System.out.println("****************************************************");
        TestClienteRepository.main(null);
        System.out.println("****************************************************");
        TestContratoRepository.main(null);
        System.out.println("****************************************************");
        TestFacturaRepository.main(null);
        System.out.println("****************************************************");
        TestHistoriaInmobiliariaRepository.main(null);
    }
}
