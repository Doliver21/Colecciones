package collecciones;


import collecciones.Marca;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Coche {
    private Marca Marca;
    private int Cilindrada;
    private String Modelo;
    private String DniPropietario;
    
    
    public Coche(Marca Marca, int Cilidrada,String Modelo ,String DniPropietario){
        
    }

    public Marca getMarca() {
        return Marca;
    }

    public void setMarca(Marca Marca) {
        this.Marca = Marca;
    }

    public int getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(int Cilindrada) {
        this.Cilindrada = Cilindrada;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getDniPropietario() {
        return DniPropietario;
    }

    public void setDniPropietario(String DniPropietario) {
        this.DniPropietario = DniPropietario;
    }
    
}
