package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PublicacionEntity {
    private UUID identificador;
    private CategoriaEntity categoria;
    private TipoAccesoEntity tipoAcceso;
    private EstadoPublicacionEntity estadoPublicacion;
    
    private static final PublicacionEntity DEFAULT_OBJECT = new PublicacionEntity();
    
    private PublicacionEntity() {
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setCategoria(CategoriaEntity.getDefaultObject());
        setTipoAcceso(TipoAccesoEntity.getDefaultObject());
        setEstadoPublicacion(EstadoPublicacionEntity.getDefaultObject());
    }
    
    public PublicacionEntity(UUID identificador, CategoriaEntity categoria, TipoAccesoEntity tipoAcceso, EstadoPublicacionEntity estadoPublicacion) {
        setIdentificador(identificador);
        setCategoria(categoria);
        setTipoAcceso(tipoAcceso);
        setEstadoPublicacion(estadoPublicacion);
    }
    
    public static PublicacionEntity getDefaultObject() {
        return DEFAULT_OBJECT;
    }
    
    public UUID getIdentificador() {
        return identificador;
    }
    
    private void setIdentificador(final UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador); 
    }
    
    public CategoriaEntity getCategoria() {
        return categoria;
    }
    
    private void setCategoria(final CategoriaEntity categoria) {
        this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
    }
    
    public TipoAccesoEntity getTipoAcceso() {
        return tipoAcceso;
    }
    
    private void setTipoAcceso(final TipoAccesoEntity tipoAcceso) {
        this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoEntity.getDefaultObject());
    }
    
    public EstadoPublicacionEntity getEstadoPublicacion() {
        return estadoPublicacion;
    }
    
    private void setEstadoPublicacion(final EstadoPublicacionEntity estadoPublicacion) {
        this.estadoPublicacion = UtilObject.getDefault(estadoPublicacion, EstadoPublicacionEntity.getDefaultObject());
    }
}
