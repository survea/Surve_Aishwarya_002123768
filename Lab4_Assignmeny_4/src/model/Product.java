/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private List<Feature> productFeatures;
    private ImageIcon logoImage;

    

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        productFeatures = new ArrayList<Feature>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return name;
    }
    
    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    public List<Feature> getFeatures() {
        return productFeatures;
    }

    public Feature addNewFeature() {
        Feature f = new Feature();
        productFeatures.add(f);
        return f;
    }

}
