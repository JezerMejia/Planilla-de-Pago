package Planilla;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import Registros.RegistroAdelanto;
import Registros.RegistroAsistencia;
import Tablas.TablaAdelantos;
import Tablas.TablaAsistencia;
import Tablas.TablaEmpleados;
import Tablas.TablaPagos;
import Usuarios.Empleado;

/**
 * @author Roire
 * @version 1.0
 * @created 20-nov.-2021 22:34:03
 */
public class PlanillaPago {

    private Float pagoHora = 33.3f;
    private TablaEmpleados tablaEmpleados;
    private TablaPagos tablaPagos;
    private TablaAdelantos tablaAdelantos;
    private TablaAsistencia tablaAsistencia;

    public PlanillaPago(){
        this.tablaEmpleados = new TablaEmpleados(this);
        this.tablaPagos = new TablaPagos(this);
        this.tablaAdelantos = new TablaAdelantos(this);
        this.tablaAsistencia = new TablaAsistencia(this);
        this.cargarDatos();
    }

    public TablaEmpleados getTablaEmpleados() {
        return tablaEmpleados;
    }

    public void setTablaEmpleados(TablaEmpleados tablaEmpleados) {
        this.tablaEmpleados = tablaEmpleados;
    }

    public TablaPagos getTablaPagos() {
        return tablaPagos;
    }

    public void setTablaPagos(TablaPagos tablaPagos) {
        this.tablaPagos = tablaPagos;
    }

    public TablaAdelantos getTablaAdelantos() {
        return tablaAdelantos;
    }

    public void setTablaAdelantos(TablaAdelantos tablaAdelantos) {
        this.tablaAdelantos = tablaAdelantos;
    }

    public TablaAsistencia getTablaAsistencia() {
        return tablaAsistencia;
    }

    public void setTablaAsistencia(TablaAsistencia tablaAsistencia) {
        this.tablaAsistencia = tablaAsistencia;
    }

    /**
     * Aceptar o rechazar el adelanto
     * @param aceptado El valor del adelanto, ya sea aceptado o rechazado
     * @param num El número del registro
     */
    public boolean aceptarAdelanto(int aceptado, int numRegistro){
        RegistroAdelanto adelanto = null;

        for (RegistroAdelanto registro : this.tablaAdelantos.getTabla()) {
            if (registro.getNum() == numRegistro) {
                adelanto = registro;
                break;
            }
        }
        if (adelanto == null) return false;

        this.tablaAdelantos.editarRegistro(numRegistro, aceptado);

        Date today = Calendar.getInstance().getTime();
        return this.tablaPagos.añadirRegistro(adelanto.getAdelanto(), today, adelanto.getEmpleado());
    }

    /**
     * Calcula el pago según las horas del empleado
     * @param empleado El empleado
     */
    private Float calcularPago(Empleado empleado){
        ArrayList<RegistroAsistencia> asistencias = new ArrayList<>();

        for (RegistroAsistencia registro : this.tablaAsistencia.getTabla()) {
            if (registro.getEmpleado().getId() == empleado.getId())
                asistencias.add(registro);
        }

        System.out.println(asistencias);

        Double diffTime = 0d;
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        for (int i = 0; i < asistencias.size() - 1; i += 2) {
            Date entrada = asistencias.get(i).getFecha();
            Date salida = asistencias.get(i + 1).getFecha();
            System.out.println(df.format(entrada) + " diff " + df.format(salida));
            diffTime += salida.getTime() - entrada.getTime();
        }

        Double hours = (diffTime / (1000 * 60 * 60)) % 24;
        System.out.println("Tiempo horas: " + hours);

        return (float) (this.pagoHora * hours);
    }

    /**
     * Carga/actualiza los datos de cada tabla
     */
    private void cargarDatos(){
        this.tablaEmpleados.actualizarRegistros();
        this.tablaPagos.actualizarRegistros();
        this.tablaAsistencia.actualizarRegistros();
        this.tablaAdelantos.actualizarRegistros();
    }

    /**
     * Realiza el pago debido al empleado
     * @param empleado El empleado al cual pagar según sus horas
     */
    public boolean realizarPago(Empleado empleado){
        Date today = Calendar.getInstance().getTime();
        float pago = this.calcularPago(empleado);

        return this.tablaPagos.añadirRegistro(pago, today, empleado);
    }

    /**
     * Se registra la debida asistencia del empleado
     * @param empleado El empleado a registrar su asistencia
     */
    public boolean registrarAsistencia(Empleado empleado){
        Date today = Calendar.getInstance().getTime();

        ArrayList<RegistroAsistencia> asistencias = new ArrayList<>();

        for (RegistroAsistencia registro : this.tablaAsistencia.getTabla()) {
            if (registro.getEmpleado().getId() == empleado.getId())
                asistencias.add(registro);
        }
        System.out.println("Asistencias: " +asistencias);
        int ultima = 0;
        if (asistencias.size() == 0)
            ultima = 0;
        else
            ultima = asistencias.get(asistencias.size() - 1).getAsistencia();

        if (ultima == 1)
            return this.tablaAsistencia.añadirRegistro(2, today, empleado); // Añadir salida
        else
            return this.tablaAsistencia.añadirRegistro(1, today, empleado); // Añadir entrada
    }

    /**
     * Solicita el adelanto de un empleado
     * @param empleado El empleado que solicita el adelanto
     * @param adelanto El monto
     * @param justificacion La justificación de tal adelanto
     */
    public boolean solicitarAdelanto(Empleado empleado, Float adelanto, String justificacion){
        Date today = Calendar.getInstance().getTime();
        if (adelanto <= 0) return false;
        return this.tablaAdelantos.añadirRegistro(adelanto, today, justificacion, empleado);
    }

    /**
     * Se crea un empleado con privilegios 0
     * @param id El ID del empleado
     * @param nombre El nombre
     * @param apellido Su apellido
     * @param cargo Su cargo en la empresa
     * @param contraseña Su contraseña de accesso
     */
    public boolean crearEmpleado(Integer id, String nombre, String apellido, String cargo, String contraseña) {
        return this.tablaEmpleados.añadirEmpleado(id, nombre, apellido, cargo, contraseña);
    }

    /**
     * Se edita el empleado según su ID
     * @param id El ID del empleado
     * @param nombre El nombre
     * @param apellido Su apellido
     * @param cargo Su cargo en la empresa
     * @param contraseña Su contraseña de accesso
     * @param privilegios Sus privilegios. 0: empleado, 1: administrador
     */
    public boolean editarEmpleado(Integer id, String nombre, String apellido, String cargo, String contraseña, Integer privilegios) {
        return this.tablaEmpleados.editarEmpleado(id, nombre, apellido, cargo, contraseña, privilegios);
    }

    public static void main(String[] argv) {
        PlanillaPago planilla = new PlanillaPago();

        Empleado empleado = planilla.getTablaEmpleados().buscarEmpleado(356);

        System.out.println(planilla.getTablaEmpleados().getTabla());

        planilla.realizarPago(empleado);
        
        //planilla.registrarAsistencia(empleado);
    }
}//end PlanillaPago
