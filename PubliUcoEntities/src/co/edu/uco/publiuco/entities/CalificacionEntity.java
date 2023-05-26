package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class CalificacionEntity {
    private static final CalificacionEntity DEFAULT_OBJECT = new CalificacionEntity();
    private UUID identificador;
    private LectorEntity lector;
    private PublicacionEntity publicacion;
    
    private CalificacionEntity() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setLector(LectorEntity.getDefaultObject());
        setPublicacion(PublicacionEntity.getDefaultObject());
    }
    
    public CalificacionEntity(UUID identificador, LectorEntity lector, PublicacionEntity publicacion) {
        super();
        setIdentificador(identificador);
        setLector(lector);
        setPublicacion(publicacion);
    }
    
    public static CalificacionEntity getDefaultObject() {
        return DEFAULT_OBJECT;
    }
    
    public UUID getIdentificador() {
        return identificador;
    }
    
    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador); 
    }
    
    public LectorEntity getLector() {
        return lector;
    }
    
    public void setLector(LectorEntity lector) {
        this.lector = lector;
    }
    
    public PublicacionEntity getPublicacion() {
        return publicacion;
    }
    
    public void setPublicacion(PublicacionEntity publicacion) {
        this.publicacion = publicacion;
    }
}
