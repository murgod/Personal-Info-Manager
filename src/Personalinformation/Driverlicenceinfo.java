/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personalinformation;

/**
 *
 * @author varsha
 */
public class Driverlicenceinfo {
    private String Licenseno;
    private String dateofissue;
    private String dateofexpiration;
    private String bloodtype;
    private String picture;

    public String getLicenseno() {
        return Licenseno;
    }

    public void setLicenseno(String Licenseno) {
        this.Licenseno = Licenseno;
    }

    public String getDateofissue() {
        return dateofissue;
    }

    public void setDateofissue(String dateofissue) {
        this.dateofissue = dateofissue;
    }

    public String getDateofexpiration() {
        return dateofexpiration;
    }

    public void setDateofexpiration(String dateofexpiration) {
        this.dateofexpiration = dateofexpiration;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    
}
