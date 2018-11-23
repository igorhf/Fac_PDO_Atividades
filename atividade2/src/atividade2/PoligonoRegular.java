package atividade2;

public class PoligonoRegular {
    
    private int nunLados;
    private int tamanhoLados;
    
    public int getNunLados() {
        return nunLados;
    }

    public void setNunLados(int nunLados) {
        this.nunLados = nunLados;
    }

    public int getTamanhoLados() {
        return tamanhoLados;
    }

    public void setTamanhoLados(int tamanhoLados) {
        this.tamanhoLados = tamanhoLados;
    }
    public void PoligonoRegular(int numLados, int tamanhoLados){
    this.nunLados=numLados;
    this.tamanhoLados=tamanhoLados;
    }
    
    public int calculoPerimetro(int a,int b){
        int p = a * b;
        return p;
    }
    
    public double calculoAnguloInterno(int a){
        int somadoAngulo = (a-2)*180;
        double angulo= somadoAngulo/a;
        return angulo;
    }
    
    public double calculoArea(int a,int b){
        double area = (a*b)/2;
        return area;
    }
}
