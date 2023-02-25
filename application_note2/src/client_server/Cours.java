/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package client_server;

/**
 *
 * @author Sara Mousselmal
 */
public class Cours {
   
    int IdCours;
    int CofficientCours;
    int CreditCours;
    String  NomCours;
    String NomProfesseur;

    public Cours() {
    }

    public Cours(int IdCours, int CofficientCours, int CreditCours, String NomCours, String NomProfesseur) {
        this.IdCours = IdCours;
        this.CofficientCours = CofficientCours;
        this.CreditCours = CreditCours;
        this.NomCours = NomCours;
        this.NomProfesseur = NomProfesseur;
    }

    
    public int getIdCours() {
        return IdCours;
    }

    public void setIdCours(int IdCours) {
        this.IdCours = IdCours;
    }

    public int getCofficientCours() {
        return CofficientCours;
    }

    public void setCofficientCours(int CofficientCours) {
        this.CofficientCours = CofficientCours;
    }

    public int getCreditCours() {
        return CreditCours;
    }

    public void setCreditCours(int CreditCours) {
        this.CreditCours = CreditCours;
    }

    public String getNomCours() {
        return NomCours;
    }

    public void setNomCours(String NomCours) {
        this.NomCours = NomCours;
    }

    public String getNomProfesseur() {
        return NomProfesseur;
    }

    public void setNomProfesseur(String NomProfesseur) {
        this.NomProfesseur = NomProfesseur;
    }

         
}
