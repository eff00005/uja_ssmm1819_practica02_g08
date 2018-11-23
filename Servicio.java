/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_ssmm;

    
public interface Servicio {
    String server = "127.0.0.1";
    int port = 80;
    String[] recursos = new String[]{"autentica.php", "registra.php", "listar.php", "eliminar.php"};

    String Autentica(String nombre, String pass);

    String Registra(int nombre, String pass, String email, String tipo, String domicilio);

    void Elimina(int id_domicilio);

    String Lista(int id_domicilio, String domicilio, String n_propietario);

}
