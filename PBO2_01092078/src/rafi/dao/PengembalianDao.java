/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafi.dao;

import java.sql.Connection;
import java.util.List;
import rafi.model.Pengembalian;

/**
 *
 * @author LENOVO
 */
public interface PengembalianDao {
    public void insert(Connection con, Pengembalian pengembalian) throws Exception;
    public void update(Connection con, Pengembalian pengembalian) throws Exception;
    public void delete(Connection con, Pengembalian pengembalian) throws Exception;
    public Pengembalian getPengembalian(Connection con, String kodeanggota, String kodebuku, String tglpinjam) throws Exception;
    public List<Pengembalian> getAllPengembalian(Connection con) throws Exception;
    public int selisihTanggal (Connection con, String tgl1, String tgl2)  throws Exception;

}
