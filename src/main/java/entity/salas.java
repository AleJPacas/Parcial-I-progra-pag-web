package entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name ="sala")
public class salas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long id;
    private String pelicula_id;
    private String costo;
    private String fecha;
    private String capacidad;
    private String num_sala;
    private String num_pelicula;
    
    @ManyToOne
    @JoinColumn(name = "pelicula_id")
    private pelicula PEL;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(String pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(String num_sala) {
        this.num_sala = num_sala;
    }

    public String getNum_pelicula() {
        return num_pelicula;
    }

    public void setNum_pelicula(String num_pelicula) {
        this.num_pelicula = num_pelicula;
    }

    public pelicula getPEL() {
        return PEL;
    }

    public void setPEL(pelicula PEL) {
        this.PEL = PEL;
    }
    
    
    
    
    
}
