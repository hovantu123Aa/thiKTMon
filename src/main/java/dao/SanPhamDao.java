/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DbContext;
import model.SamPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SanPhamDao {

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList<SamPham> getTop10() {
        ArrayList<SamPham> ds = new ArrayList();
        String sql = "select top 10 * from sach order by ngaycapnhat desc";
        conn = new DbContext().getConnection();
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next())
            {
               ds.add(new SamPham(rs.getInt(1),rs.getString(2),rs.getInt(3),
                       rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
            }
        } catch (Exception ex) {
            System.out.println("Loi SQL:" + ex.toString());
        }
        return ds;
    }
    
     public ArrayList<SamPham> layTheoSampham(int MaSP) {
        ArrayList<SamPham> ds = new ArrayList();
        String sql = "select * from sach where macd=?";
        conn = new DbContext().getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, MaSP);
            rs = ps.executeQuery();
            while(rs.next())
            {
               ds.add(new SamPham(rs.getInt(1),rs.getString(2),rs.getInt(3),
                    rs.getInt(4),rs.getInt(5),rs.getString(6),rs.getDate(7)));
            }
        } catch (Exception ex) {
            System.out.println("Loi SQL:" + ex.toString());
        }
        return ds;
    }
    
    
    
    public static void main(String[] args) {
        for(SamPham x:  new SanPhamDao().layTheoSampham(2))
        {
            System.out.println(x); 
        }
    }
}
