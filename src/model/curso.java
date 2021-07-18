package model;

public class curso {
    private int codigo;
    private String name;
    private char jornada;
    private formador formador;

    public curso(int pcodigo, String pname, char pjornada, int fCodigo, String fNombre) {
        super();
        this.codigo = pcodigo;
        this.name = pname;
        this.jornada = pjornada;
        formador = new formador(fNombre, fCodigo);
    }

    public int getCodigo() {
        return codigo;
    }
    public char getJornada() {
        return jornada;
    }
    public String getName() {
        return name;
    }

    public formador getFormador() {
        return formador;
    }
}
