package model;


public class formador {
    private String nombre;
    private int codigo;

    private formador formador;

    public formador(String nombre, int codigo){
        super();
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public formador getFormador() {
        return formador;
    }
}
