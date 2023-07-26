/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import models.Category;

/**
 *
 * @author Diego
 */
public class DaoCategory {
    private ArrayList<Category> listCategory = new ArrayList<>();

    public DaoCategory() {
    }
    
    /**Agrega a un nivel local**/
    public void saveCategory(String categoryName){
        Category category = new Category(0, categoryName);
        listCategory.add(category);
        
    }

    public ArrayList<Category> getListCategory() {
        return listCategory;
    }

    public void setListCategory(ArrayList<Category> listCategory) {
        this.listCategory = listCategory;
    }
    
    
}
