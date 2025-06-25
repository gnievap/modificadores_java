public class Padre {
    // miembros de la clase padre
    public int variable1;  // sólo debe aceptar valores positivos
    private int variable2; // sólo debe aceptar valores negativos

    public int getVariable2() {
        return variable2;
    }
    public void setVariable2(int variable2) {
        if ( variable2 < 0 )
            this.variable2 = variable2;
        else
            this.variable2 = 0;
    }
    @Override
    public String toString() {
        return "Padre [variable1=" + variable1 + ", variable2=" + variable2 + "]";
    }

    

}