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
public class Bola extends BangunRuang{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double Volume() {
        return (((4 * r * r* r *22)/3)/7);
    }
}
