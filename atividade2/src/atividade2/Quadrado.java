package atividade2;

public class Quadrado extends PoligonoRegular{
    
    public void Quadrado(int a, int b){
    setNunLados(a);
    setTamanhoLados(b);
    }
    
    public int areaQuadrado(int lado){
        int area = lado * lado;
        return area;
    }
}
