package entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Product")
@NamedQueries({
        @NamedQuery(name = "Product.findAll", query = "from Product")
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productID;

    @Column(nullable = false, unique = true, length = 50)
    private String productName;

    @Column(nullable = false, unique = true, length = 255)
    private String description;

    @Column(nullable = false, unique = true)
    private long manID;

    public Product() {
    }

    public Product(long productID, String productName, String description, long manID) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.manID = manID;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getManID() {
        return manID;
    }

    public void setManID(long manID) {
        this.manID = manID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", manID='" + manID + '\'' +
                '}';
    }
}
