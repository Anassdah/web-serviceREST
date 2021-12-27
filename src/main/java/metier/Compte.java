package metier;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Compte")
public class Compte implements Serializable {
    @XmlAttribute
    private int code;
    @XmlAttribute
    private double solde;
    @XmlElement
    private Date dateCreation;

    public Compte() {
        super();

    }
    public Compte(int code,double solde, Date dateCreation){
        super();
        this.code = code;
        this.solde=solde;
        this.dateCreation=dateCreation;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}