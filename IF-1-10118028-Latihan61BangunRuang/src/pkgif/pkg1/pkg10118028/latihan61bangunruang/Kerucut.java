/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan61bangunruang;

/**
 *
 * @author User
 */
public class Kerucut extends BangunRuang{
private double r, t;    

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    @Override
    public double Volume() {
        return r * r * t* 22 / 21;
    }
}
