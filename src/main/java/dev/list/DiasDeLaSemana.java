package dev.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DiasDeLaSemana {
    private List<String> dias;


    public DiasDeLaSemana() {
        dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");
    }


    public List<String> obtenerDias() {
        return dias;
    }

    
    public int obtenerLargo() {
        return dias.size();
    }

   
    public boolean eliminarDia(String dia) {
        return dias.remove(dia);
    }

   
    public String obtenerDia(int indice) {
        if (indice >= 0 && indice < dias.size()) {
            return dias.get(indice);
        }
        return null;
    }

 
    public boolean existeDia(String dia) {
        return dias.contains(dia);
    }

  
    public void ordenarDias() {
        Collections.sort(dias);
    }

   
    public void vaciarLista() {
        dias.clear();
    }

    public static void main(String[] args) {
        DiasDeLaSemana diasDeLaSemana = new DiasDeLaSemana();

        
        System.out.println("Días de la semana: " + diasDeLaSemana.obtenerDias());

      
        System.out.println("Largo de lista: " + diasDeLaSemana.obtenerLargo());

      
        diasDeLaSemana.eliminarDia("Miércoles");
        System.out.println("Días de la semana: " + diasDeLaSemana.obtenerDias());

       
        System.out.println("Día obtenido: " + diasDeLaSemana.obtenerDia(2));

       
        System.out.println("Existe Viernes: " + diasDeLaSemana.existeDia("Viernes"));
       
       
        diasDeLaSemana.ordenarDias();
        System.out.println("Días de la semana ordenados: " + diasDeLaSemana.obtenerDias());

        
        diasDeLaSemana.vaciarLista();
        System.out.println("Días de la semana después de vaciar la lista: " + diasDeLaSemana.obtenerDias());
    }
}