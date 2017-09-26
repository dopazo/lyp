package cl.uai.lyp;

public class AguaTonica extends Trago {
    public AguaTonica(){
        this.calorias200ML = 30.0;
    }
    public Double calculaCantidad(Double calorias) {

        return (calorias * 200)/calorias200Ml;
    }

}
