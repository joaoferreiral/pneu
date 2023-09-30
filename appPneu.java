public class appPneu {
    public static void main(String[] args) {

        Pneu pneu = new Pneu(001, "R17", 110);

        System.out.println("*****************************");
        System.out.println("ID Pneu: " + pneu.getIdPneu());
        System.out.println("Modelo: " + pneu.getModelo());
        System.out.println("Indice de vida: " + pneu.getIndiceDeVida());
        System.out.println("*****************************");

        System.out.println(""); // pular linha

        pneu.desgastar(4, 14);
        System.out.println("Horas de uso: " + pneu.getHorasDeUso());
        System.out.println("Índice de vida: " + pneu.getIndiceDeVida());
        System.out.println("Estado: " + pneu.getEstado());
        System.out.println("");
        pneu.desgastar(15, 20);
        System.out.println("Horas de uso: " + pneu.getHorasDeUso());
        System.out.println("Índice de vida: " + pneu.getIndiceDeVida());
        System.out.println("Estado: " + pneu.getEstado());
        System.out.println("");
        pneu.desgastar(21, 23);
        System.out.println("Horas de uso: " + pneu.getHorasDeUso());
        System.out.println("Índice de vida: " + pneu.getIndiceDeVida());
        System.out.println("Estado: " + pneu.getEstado());
    }
}