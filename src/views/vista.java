package views;

import model.curso;

public class vista {
    
    public static void main(String[] args) {
        curso cursoFrances = new curso(52441, "Frances 101", 'N',07400,"guillaume");
        System.out.println(cursoFrances.getCodigo());
        System.out.println(cursoFrances.getJornada());

        System.out.println(cursoFrances.getFormador().getNombre());
    }
}
