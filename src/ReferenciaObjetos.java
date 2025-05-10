class Persona {
    String apellido;
}

     public class ReferenciaObjetos {
     public static void main(String[] args) {

        Persona persona = new Persona();
        persona.apellido= "Quintero";
        modificarApelido(persona);
        System.out.println("Apellido despues de modificar " + persona.apellido);
        
    }

    public static void modificarApelido(Persona persona)
    {
        persona.apellido= "Sanchez";
        

    }
    }
   
    
   
