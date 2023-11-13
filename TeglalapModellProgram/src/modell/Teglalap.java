/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author tegzes.marton
 */
public class Teglalap {
    public Teglalap(){
        this.a = 1;
        this.b = 2;
    }
     public Teglalap(int a, int b) {
        this.a = a;
        this.b = b;
        if(a == 0 || b == 0){
            
        }
        
    }
     
    
    private int a;
    private int b;
private double Terulet(){
       double ter = a*b;
       return ter;
    }
private double Kerulet(){
       double ker = 2*(a+b);
       return ker;
    }

    @Override
    public String toString() {
        return "Teglalap{" + "a=" + a + ", b=" + b + '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    private String ellenorzes(Teglalap masik){
        String egyezik = "";
        if(this.Terulet() == masik.Terulet()){
            egyezik = "A két téglalap ugyan az";
        }
        else{
           egyezik = "A két téglalap nem ugyan az"; 
        }
        return egyezik;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.a;
        hash = 17 * hash + this.b;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teglalap other = (Teglalap) obj;
        if (this.a != other.a) {
            return false;
        }
        return this.b == other.b;
    }

}
