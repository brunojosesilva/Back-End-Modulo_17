public class Carro implements ICarro {
    private String fabricante;
    private String modelo;
    private String tipo;

    public Carro(String fabricante, String modelo, String tipo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}