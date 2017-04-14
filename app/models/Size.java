package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;
import models.*;
import models.users.*;


@Entity
public class Size extends Model {
    private String sizeName;

    @ManyToOne
    private Product product;

    public Size(String sizeName, Product product) {
        this.sizeName = sizeName;
        this.product = product;
    }

    public String getSizeName() {
        return sizeName;
    }

    public Product getProduct() {
        return product;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    
}
