package com.lzw.dao;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import com.lzw.Item;
import com.lzw.dao.model.*;

public class Dao {
    //Dao全称为data access object-数据访问对象
    protected static String dbClassName = "net.sourceforge.jtds.jdbc.Driver";
    protected static String dbUrl = "jdbc:jtds:sqlserver://localhost:1433/"+"db_database28;SelectMethod=Cursor"；
    protected static String dbUser = "root";
    protected static String dbPwd = "password";
    public static Connection conn = null;
    static{
        try{
            if(conn==null){
                Class.forName(dbClassName).newInstance();
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
            }
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    private Dao(){

    }
    //读取客户信息
    public static TbKhinfo getKhInfo(Item item){
        //获取item对象的name属性
        String where = "name=" + item.getName() +"";
        if(item.getId()!=null)
            where = "id=" +item.getId()+"";
        TbKhinfo info = new TbKhinfo();
        ResultSet set = findForResultSet("select * from tb_khinfo where"+where);
        try{
            if(set.next()){
                info.setId(set.getString("id").trim());
                info.setName(set.getString("name").trim());
                info.setAddress(set.getString("address").trim());
                info.setBianma(set.getString("bianma").trim());
                info.setLian(set.getString("lian").trim());
                info.setTel(set.getString("tel").trim());
                info.setMail(set.getString("mail").trim());
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return info;
    }
    public static TbGysinfo getGysInfo(Item item){
        //获取item对象的name属性
        String where = "name=" + item.getName() +"";
        if(item.getId()!=null)
            where = "id=" +item.getId()+"";
        TbGysinfo info = new TbGysinfo();
        ResultSet set = findForResultSet("select * from tb_gysinfo where"+where);
        try{
            if(set.next()){
                info.setId(set.getString("id").trim());
                info.setName(set.getString("name").trim());
                info.setAddress(set.getString("address").trim());
                info.setBianma(set.getString("bianma").trim());
                info.setLian(set.getString("lian").trim());
                info.setTel(set.getString("tel").trim());
                info.setMail(set.getString("mail").trim());
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return info;
    }
    public static TbSpinfo getSpinfo(Item item){
        //获取item对象的name属性
        String where = "spname=" + item.getName() +"";
        if(item.getId()!=null)
            where = "id=" +item.getId()+"";
        ResultSet rs = findForResultSet("select * from tb_gysinfo where"+where);
        TbSpinfo info = new TbSpinfo();
        try{
            if(rs.next()){
                info.setId(rs.getString("id").trim());
                info.setXh(rs.getString("xh").trim());
                info.setGysname(rs.getString("gysname").trim());
                info.setCd(rs.getString("cd").trim());
                info.setSpname(rs.getString("spname").trim());
                info.setMemo(rs.getString("memo").trim());
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return info;
    }
    public static boolean getLogin(String name, String password)
            throws SQLException{
        ResultSet rs= findForResultSet("select * from tb_userlist where name="+name+"and pass="+password+"");
        return rs.next();
            }
    public static boolean insertSellInfo(TbSellMain sellMain){
        try{
            boolean autoCommit = conn.getAutoCommit();
            conn.setAutoCommit(false);
            //添加销售主表记录
            insert("insert into tb_sell_main values("+sellMain.getSellID()
                        +","+sellMain.getPzs()+","+sellMain.getJe()
                        +","+sellMain.getJsr()+","+sellMain.getDatetime()+")");
            Set<TbSellDetail>rkDetails = sellMain.getTbSellDetails();
            for (Iterator<TbSellDetail> iter = rkDetails.Iterator();iter.hasNext();){
                TbSellDetail details = iter.next();
                insert("insert ")
            }
        }
    }

}
