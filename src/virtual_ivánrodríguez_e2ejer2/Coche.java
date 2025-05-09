/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package virtual_ivánrodríguez_e2ejer2;
import java.util.*;

public class Coche implements Comparable<Coche> {
    
    private String matricula = null, marca = null, modelo = null;
    
    
    public Coche() {}
    
    /**
     * Constructor de la clase Coche
     * @param matricula
     * @param marca
     * @param modelo 
     */
    public Coche(String matricula, String marca, String modelo) {
    
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    
    }

    //Getters y setters
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    
    /**
     * Este método devuelve la información de un objeto coche, es decir, su marca, modelo y matrícula.
     * @return Información sobre un objeto coche 
     */
    @Override
    public String toString() {
        return "Datos del coche: [Matricula: " + this.matricula + " || Marca: " + this.marca + " ||  Modelo: " + this.modelo + "]"; 
    }

    
    /**
     * 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    
    /**
     * Este método compara dos objetos coche y devuelve si son iguales o no
     * @param obj Un objeto coche
     * @return True si son iguales false si no lo son
     */
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
        final Coche other = (Coche) obj;
        return Objects.equals(this.matricula, other.matricula);
    }
    
    
        /**
         * Este método compara dos matriculas de dos objetos coche y devuelve si son iguales o no
         * @param obj Un objeto coche
         * @return True si sus matriculas son iguales false si no lo son
         */
        public boolean equalsMarca(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coche other = (Coche) obj;
        return Objects.equals(this.marca, other.marca);
         }

        
/**
 * Compara este coche con otro usando la matrícula.
 * Devuelve un número negativo, cero o positivo según si esta matrícula
 * es menor, igual o mayor que la del otro coche.
 * Si el otro coche es null, se considera menor.
 *
 * @param o el coche con el que se compara
 * @return un número negativo, cero o positivo según el orden
 */
    @Override
    public int compareTo(Coche o) {
        if (o == null) return 1;
        return this.matricula.compareTo(o.matricula);
    }
    

    
    
    
    

}
