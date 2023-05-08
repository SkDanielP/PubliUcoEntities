package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class AdministradorCategoriaEntity {
    private static final AdministradorCategoriaEntity DEFAULT_OBJECT = new AdministradorCategoriaEntity();
    private UUID identificador;
    private String nombre;
    private String correo;
    private TipoRelacionInstitucionEntity tipoRelacionInstitucion;
    private EstadoAdministradorCategoriaEntity estado;
    
    private AdministradorCategoriaEntity() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setNombre(UtilText.getUtilText().getDefaultValue());
        setCorreo(UtilText.EMPTY);
        setTipoRelacionInstitucion(TipoRelacionInstitucionEntity.getDefaultObject());
        setEstado(EstadoAdministradorCategoriaEntity.getDefaultObject());
    }
    
    public AdministradorCategoriaEntity(UUID identificador, String nombre, String correo, TipoRelacionInstitucionEntity tipoRelacionInstitucion, EstadoAdministradorCategoriaEntity estado) {
        super();
        setIdentificador(identificador);
        setNombre(nombre);
        setCorreo(correo);
        setTipoRelacionInstitucion(tipoRelacionInstitucion);
        setEstado(estado);
    }
    
    public static AdministradorCategoriaEntity getDefaultObject() {
        return DEFAULT_OBJECT;
    }
    
    public UUID getIdentificador() {
        return identificador;
    }
    
    private void setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    private void setNombre(String nombre) {
        this.nombre = UtilText.getUtilText().applyTrim(nombre);
    }
    
    public String getCorreo() {
        return correo;
    }
    
    private void setCorreo(String correo) {
        this.correo = UtilText.getUtilText().applyTrim(correo);
    }
    
    public TipoRelacionInstitucionEntity getTipoRelacionInstitucion() {
        return tipoRelacionInstitucion;
    }
    
    private void setTipoRelacionInstitucion(TipoRelacionInstitucionEntity tipoRelacionInstitucion) {
        this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion, TipoRelacionInstitucionEntity.getDefaultObject());
    }
    
    public EstadoAdministradorCategoriaEntity getEstado() {
        return estado;
    }
    
    private void setEstado(EstadoAdministradorCategoriaEntity estado) {
        this.estado = UtilObject.getDefault(estado, EstadoAdministradorCategoriaEntity.getDefaultObject());
    }
}



