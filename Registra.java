/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_ssmm;


public class Registra {

    protected String nombre;
    protected String pass;
    protected String email;
    protected String tipo;
    protected String domicilio;
    protected String recurso;
    protected String data;
    protected final String CRLF = "CRLF";
    

    public Registra(String nombre, String pass, String email, String tipo, String domicilio) {
        this.nombre = nombre;
        this.pass = pass;
        this.email = email;
        this.tipo = tipo;
        this.domicilio = domicilio;
        this.recurso = Servicio.recursos[2];
        this.data = nombre + "&" + pass + "&" + email + "&" + tipo + "&" + domicilio;
    }

    public byte[] toByteArray() {
        String msg = this.recurso + "" + this.data.toString() + "CRLF";
        return msg.getBytes();
    }

    public String toArrayByte(Byte[] bytes) {
        String msg = bytes.toString();
        return msg;
    }

    @Override
    public String toString() {
        return this.recurso + "?" + this.data.toString();
    }
}
