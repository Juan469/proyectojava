public class DescuentoRopa {
    
        public static void main(String[] args) {
           
            float precioCamiseta = 25.0f;
            float precioPantalon = 30.0f;
            float descuentoGeneral = 0.15f;
            float descuentoAdicionalCamiseta = 0.05f;
            
            float precioCamisetaDescuento = precioCamiseta * (1 - descuentoGeneral);
            float precioPantalonDescuento = precioPantalon * (1 - descuentoGeneral);
            
            
            float precioSegundaCamiseta = precioCamisetaDescuento * (1 - descuentoAdicionalCamiseta);
            
            
            float precioTotal = precioCamisetaDescuento + precioPantalonDescuento + precioSegundaCamiseta;
            
            
            System.out.printf("Precio total después de descuentos: $%.2f\n", precioTotal);
}


}