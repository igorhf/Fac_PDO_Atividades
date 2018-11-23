package atividade2;

public class TrianguloEq extends PoligonoRegular{
    
    public void TrianguloEq(int a,int b){
    setNunLados(a);
    setTamanhoLados(b);
    }
    
    public double areaTrianguno(int a, double b){
    double area = (a * b)/2;
    return area;
    }
}
