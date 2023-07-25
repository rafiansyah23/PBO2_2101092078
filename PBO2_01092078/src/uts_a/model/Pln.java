/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_a.model;

/**
 *
 * @author LENOVO
 */
public class Pln {
    private String kodepelanggan;
    private String namapelanggan;
    private String meterbulanini;
    private String meterbulanlalu;
    private String tarif;
    private String potongan;
    private String total;
    
    public Pln(){
        
    }

    public Pln(String kodepelanggan, String namapelanggan, String meterbulanini, String meterbulanlalu, String tarif, String potongan, String total) {
        this.kodepelanggan = kodepelanggan;
        this.namapelanggan = namapelanggan;
        this.meterbulanini = meterbulanini;
        this.meterbulanlalu = meterbulanlalu;
        this.tarif = tarif;
        this.potongan = potongan;
        this.total = total;
    }
    
    
    public String getKodePelanggan() {
        return kodepelanggan;
    }

    public void setKodepelanggan(String kodepelanggan) {
        this.kodepelanggan = kodepelanggan;
    }

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public String getMeterbulanini() {
        return meterbulanini;
    }

    public void setMeterbulanini(String meterbulanini) {
        this.meterbulanini = meterbulanini;
    }
    
    public String getMeterbulanlalu() {
        return meterbulanlalu;
    }

    public void setMeterbulanlalu(String meterbulanlalu) {
        this.meterbulanlalu = meterbulanlalu;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }
    
    public String getPotongan() {
        return tarif;
    }

    public void setPotongan(String potongan) {
        this.potongan = potongan;
    }
    
    public String getTotal() {
        return total;
    }

    public void setTotal(String potongan) {
        this.total = total;
}
}