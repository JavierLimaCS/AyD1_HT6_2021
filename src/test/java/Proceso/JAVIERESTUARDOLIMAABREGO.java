/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import Proceso.AsignarHorario;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author javes
 */
public class JAVIERESTUARDOLIMAABREGO {    

    @InjectMocks
    private AsignarHorario asignacion;
    
    @Mock
    private Horario horario;
    
    @Mock
    private RegistroAcademico carnet;
    
    @Mock
    private Carrera carrera;
    
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void getCodigoHorario() throws Exception
    {
        when(carnet.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(carnet.getAnio()).thenReturn(2016);
        
        asignacion = new AsignarHorario();
        int cod = 0;
        horario = asignacion.generarHorario(carrera, carnet);
        if (horario != null) {
            assertEquals(856, horario.getCodigoHorario());
            cod = horario.getCodigoHorario();
        }
        System.out.println("Codigo Horario: " + cod);
    }
    
    @Test
    public void getDescripcion() throws Exception
    {
        when(carnet.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(1);
        when(carnet.getAnio()).thenReturn(2016);
        
        asignacion = new AsignarHorario();
        String desc = "";
        horario = asignacion.generarHorario(carrera, carnet);
        if (horario != null) {
            assertEquals("Mixto", horario.getDescripcion());
            desc = horario.getDescripcion();
        }
        
        System.out.println("Descripcion Horario: "+desc);
    }

}
