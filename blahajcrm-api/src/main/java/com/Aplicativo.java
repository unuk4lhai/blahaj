package com;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Aplicativo implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

  private long id;
  private String nome;
  private String desenvolvedor;
  private long downloads;

  public Aplicativo() {
    nome = "";
    desenvolvedor="";
    
    downloads=0;
    
  }

  public Aplicativo(long id, String nome, String desenvolvedor, long downloads) {
    this.nome = nome;
    this.id=id;
    this.desenvolvedor=desenvolvedor;
    this.downloads=downloads;
    
  }

  public long getId() { return this.id; }

  public void setId(long id) {
      this.id = id;
  }

  public String getNome() { return this.nome; }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public String getDesenvolvedor() {
      return desenvolvedor;
  }

  public void setDesenvolvedor(String desenvolvedor) {
      this.desenvolvedor = desenvolvedor;
  }

  public long getDownloads() {
      return downloads;
  }

  public void setDownloads(long downloads) {
      this.downloads = downloads;
  }


  public String toString() {
    return "Aplicativo " + nome + ", Dev: " + desenvolvedor+" Downloads: "+downloads;
  }
}
    
