/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_ssmm;

public class Datos {
    String nombre = "";
    String pass = "";
    String email = "";
    String tipo = "";
    String domicilio = "";

    public Datos(String nombre, String pass, String email, String tipo, String domicilio) {
        this.nombre = nombre;
        this.pass = pass;
        this.email = email;
        this.tipo = tipo;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Data{nombre=" + this.nombre + ", pass=" + this.pass + ", email=" + this.email + ",tipo=" + this.tipo + ", domicilio=" + this.domicilio + '}';
    }
}
