package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class LectorEntity {
    private UUID identificador;
    private TipoIdentificacionEntity tipoIdentificacion;
    private String numeroIdentificacion;
    private String nombre;
    private TipoRelacionInstitucionEntity tipoRelacionInstitucion;
    
    private static final LectorEntity DEFAULT_OBJECT = new LectorEntity();
    
    private LectorEntity() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setTipoIdentificacion(TipoIdentificacionEntity.getDefaultObject());
        setNumeroIdentificacion(UtilText.EMPTY);
        setNombre(UtilText.EMPTY);
        setTipoRelacionInstitucion(TipoRelacionInstitucionEntity.getDefaultObject());
    }
    
    public LectorEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion, String numeroIdentificacion, String nombre, TipoRelacionInstitucionEntity tipoRelacionInstitucion) {
        setIdentificador(identificador);
        setTipoIdentificacion(tipoIdentificacion);
        setNumeroIdentificacion(numeroIdentificacion);
        setNombre(nombre);
        setTipoRelacionInstitucion(tipoRelacionInstitucion);
    }
    
    public static LectorEntity getDefaultObject() {
        return DEFAULT_OBJECT;
    }
    
    public UUID getIdentificador() {
        return identificador;
    }
    
    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador); 
    }
    
    public TipoIdentificacionEntity getTipoIdentificacion() {
        return tipoIdentificacion;
    }
    
    private void setTipoIdentificacion(final TipoIdentificacionEntity tipoIdentificacion) {
        this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionEntity.getDefaultObject());
    }
    
    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    
    private void setNumeroIdentificacion(final String numeroIdentificacion) {
        this.numeroIdentificacion = UtilText.getUtilText().applyTrim(numeroIdentificacion);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    private void setNombre(final String nombre) {
        this.nombre = UtilText.getUtilText().applyTrim(nombre);
    }
    
    public TipoRelacionInstitucionEntity getTipoRelacionInstitucion() {
        return tipoRelacionInstitucion;
    }
    
    private void setTipoRelacionInstitucion(final TipoRelacionInstitucionEntity tipoRelacionInstitucion) {
        this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion, TipoRelacionInstitucionEntity.getDefaultObject());
    }
}
