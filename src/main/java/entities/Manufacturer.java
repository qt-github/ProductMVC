package entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Manufacturer")
@NamedQueries({
        @NamedQuery(name = "Manufacturer.findAll", query = "from Manufacturer ")
})
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long manID;

    @Column(nullable = false, unique = true, length = 50)
    private String manName;

    @Column(nullable = false, unique = true, length = 50)
    private String manContactName;

    @Column(nullable = false, length = 50)
    private String manContactEmail;

    @Column(nullable = false, length = 12)
    private String manContactPhone;

    @Column(nullable = false, unique = true, length = 50)
    private String manWebsite;

    public Manufacturer() {
    }

    public Manufacturer(long manID, String manName, String manContactName, String manContactEmail, String manContactPhone, String manWebsite) {
        this.manID = manID;
        this.manName = manName;
        this.manContactName = manContactName;
        this.manContactEmail = manContactEmail;
        this.manContactPhone = manContactPhone;
        this.manWebsite = manWebsite;
    }

    public long getManID() {
        return manID;
    }

    public void setManID(long manID) {
        this.manID = manID;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public String getManContactName() {
        return manContactName;
    }

    public void setManContactName(String manContactName) {
        this.manContactName = manContactName;
    }

    public String getManContactEmail() {
        return manContactEmail;
    }

    public void setManContactEmail(String manContactEmail) {
        this.manContactEmail = manContactEmail;
    }

    public String getManContactPhone() {
        return manContactPhone;
    }

    public void setManContactPhone(String manContactPhone) {
        this.manContactPhone = manContactPhone;
    }

    public String getManWebsite() {
        return manWebsite;
    }

    public void setManWebsite(String manWebsite) {
        this.manWebsite = manWebsite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return manID == that.manID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manID);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "manID=" + manID +
                ", manName='" + manName + '\'' +
                ", manContactName='" + manContactName + '\'' +
                ", manContactEmail='" + manContactEmail + '\'' +
                ", manContactPhone='" + manContactPhone + '\'' +
                ", manWebsite='" + manWebsite + '\'' +
                '}';
    }
}
