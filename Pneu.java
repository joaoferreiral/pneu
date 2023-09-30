public class Pneu {
    private int idPneu;
    private String modelo;
    private double indiceDeVida;
    private char estado;
    private int horasDeUso;

    public Pneu(int idPneu, String modelo,  double indiceDeVida) {
        this.idPneu = idPneu;
        this.modelo = modelo;
        this.indiceDeVida = indiceDeVida;
        this.estado = 'N';
        this.horasDeUso = 0;
    }

    public int getIdPneu() {
        return idPneu;
    }
    public String getModelo() {
        return modelo;
    }
    public char getEstado() {
        return estado;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getIndiceDeVida() {
        return indiceDeVida;
    }
    public void setIndiceDeVida(double indiceDeVida) {
        this.indiceDeVida = indiceDeVida;
    }
    public int getHorasDeUso() {
        return horasDeUso;
    }

    public boolean desgastar(int horaInicial, int horaFinal) {
        if(this.estado == 'N' || this.estado == 'U') {
            if (this.estado == 'N') {
                this.estado = 'U';
            }

            this.horasDeUso = (horaFinal - horaInicial);
            this.indiceDeVida -= ((double) (horaFinal - horaInicial) / 60) * 0.12345;
            if (this.indiceDeVida <= 0) {
                this.estado = 'F';
            }

            return true;
        } return false;
    }
}
