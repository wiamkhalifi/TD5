package com.example.td5_leslistes;

public class Contact {
    private String Nom;
    private String Prenom;
    private String Image;

    public Contact() {}

    public Contact(String nom, String prenom, String image) {
        Nom = nom;
        Prenom = prenom;
        Image = image;
    }


    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
        }
}