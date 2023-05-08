package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class CategoriaEntity {
    private static final CategoriaEntity DEFAULT_OBJECT = new CategoriaEntity();
    private UUID identificador;
    private String nombre;
    private String descripcion;
    private EstadoCategoriaEntity estado;
    
    private CategoriaEntity() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getUtilText().getDefaultValue());
        setDescripcion(UtilText.EMPTY);
        setEstado(EstadoCategoriaEntity.getDefaultObject());
    }
    
    public CategoriaEntity(UUID identificador, String nombre, String descripcion, EstadoCategoriaEntity estado) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
    }
    
    public static CategoriaEntity getDefaultObject() {
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
    
    public EstadoCategoriaEntity getEstado() {
        return estado;
    }
    
    public void setEstado(EstadoCategoriaEntity estado) {
        this.estado = estado;
    }
}

