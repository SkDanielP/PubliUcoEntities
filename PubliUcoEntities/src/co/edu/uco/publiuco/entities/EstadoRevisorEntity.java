package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class EstadoRevisorEntity {
    private static final EstadoRevisorEntity DEFAULT_OBJECT = new EstadoRevisorEntity();
    private UUID identificador;
    private String nombre;
    private String descripcion;
    
    private EstadoRevisorEntity() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getUtilText().getDefaultValue());
        setDescripcion(UtilText.EMPTY);
    }
    
    public EstadoRevisorEntity(UUID identificador, String nombre, String descripcion) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }
    
    public static EstadoRevisorEntity getDefaultObject() {
        return DEFAULT_OBJECT;
    }
    
    public UUID getIdentificador() {
        return identificador;
    }
    
    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador); 
    }
    
    public String getNombre() {
        return nombre;
    }
    
    private void setNombre(final String nombre) {
        this.nombre = UtilText.getUtilText().applyTrim(nombre);
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    private void setDescripcion(final String descripcion) {
        this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
    }
}
