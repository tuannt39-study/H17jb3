/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.spring.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author haopv
 */

@Entity
@Table(name = "newscategories")
public class NewsCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //private Long parentId;
    private String image;
    private String name;
    private int order;
    private String description;
    private int published;
    private int lang;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "parentId")
    private NewsCategories parent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public int getLang() {
        return lang;
    }

    public void setLang(int lang) {
        this.lang = lang;
    }

    public NewsCategories getParent() {
        return parent;
    }

    public void setParent(NewsCategories parent) {
        this.parent = parent;
    }


    
}
