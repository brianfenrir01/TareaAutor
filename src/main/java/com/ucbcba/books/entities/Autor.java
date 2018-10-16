package com.ucbcba.books.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String Nombre;
    private String Apellid;

    public Integer getId(){return id;}
    public void setId(Integer id){this.id=id;}
    public String getNombre(){return Nombre;}
    public void setNombre(String Nombre){this.Nombre=Nombre;}
    public String getApellid(){return Apellid;}
    public void setApellid(String Apellid){this.Apellid=Apellid;}
}
