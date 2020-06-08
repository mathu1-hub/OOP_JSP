package com.jsp.bean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.jsp.bean.*;
public class UserDao {
public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useTimezone=true&serverTimezone=UTC","root","");
		System.out.println("connected!");
	}catch(Exception e)
	{
		System.out.println("error in"+e);
	}
	return con;
}
public static int save(Payment_Bean u){
	int status=0;
	try{
		Connection con=getConnection();
		
		PreparedStatement ps=con.prepareStatement("INSERT INTO `payment`(`id`, `fullName`, `email`, `address`, `city`, `state`, `zip`, `cardname`, `cardnumber`, `expmonth`, `expyear`, `cvv`) VALUES (null,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,u.getFullName());
		ps.setString(2,u.getEmail());
		ps.setString(3,u.getAddress());
		ps.setString(4,u.getCity());
		ps.setString(5,u.getState());
		ps.setString(6,u.getZip());
		ps.setString(7,u.getCardname());
		ps.setString(8,u.getCardnumber());
		ps.setString(9,u.getExpmonth());
		ps.setString(10,u.getExpyear());
		ps.setString(11,u.getCvv());
		
		/*
		 * "update payment set `fullName`=?,`email=?`, `address`=?, `city`=?, `state`=?, `zip`=?, `cardname`=?, `cardnumber`=?, `expmonth`=?, `expyear`=?, `cvv`=? where `id`=?"
		 */		
		
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int Update(Payment_Bean u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("UPDATE `payment` SET `fullName`=?,`email`=?,`address`=?,`city`=?,`state`=?,`zip`=?,`cardname`=?,`cardnumber`=?,`expmonth`=?,`expyear`=?,`cvv`=? WHERE `id`=?");
		
		ps.setString(1,u.getFullName());
		ps.setString(2,u.getEmail());
		ps.setString(3,u.getAddress());
		ps.setString(4,u.getCity());
		ps.setString(5,u.getState());
		ps.setString(6,u.getZip());
		ps.setString(7,u.getCardname());
		ps.setString(8,u.getCardnumber());
		ps.setString(9,u.getExpmonth());
		ps.setString(10,u.getExpyear());
		ps.setString(11,u.getCvv());
		ps.setInt(12, u.getId());
		
	
		status=ps.executeUpdate();
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
}
public static int delete(Payment_Bean u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from payment where `id`=?");
		ps.setInt(1,u.getId());
		status=ps.executeUpdate();
	}catch(Exception e)
	{
		System.out.println(e);
	}

	return status;
}
public static List<Payment_Bean> getAllRecords(){
	List<Payment_Bean> list=new ArrayList<Payment_Bean>();
	
	try{
		Connection con=getConnection();		
		PreparedStatement ps=con.prepareStatement("select * from payment");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()){
		Payment_Bean u=new Payment_Bean();
			u.setId(rs.getInt("id"));
			u.setFullName(rs.getString("fullName"));
			u.setEmail(rs.getString("email"));
			u.setAddress(rs.getString("address"));
			u.setCity(rs.getString("city"));
			u.setState(rs.getString("state"));
			u.setZip(rs.getString("zip"));
			u.setCardname(rs.getString("cardname"));
			u.setCardnumber(rs.getString("cardnumber"));
			u.setExpmonth(rs.getString("expmonth"));
			u.setExpyear(rs.getString("expyear"));
			u.setCvv(rs.getString("cvv"));
			
		list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}

public static Payment_Bean getRecordById(int id){
	Payment_Bean u=null;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from payment where id=?");
		
		ps.setInt(1,id);
		
		ResultSet rs=ps.executeQuery();
		
	while(rs.next())
	{
		u=new Payment_Bean();
		
		u.setId(rs.getInt("id"));
		u.setFullName(rs.getString("fullName"));
		u.setEmail(rs.getString("email"));
		u.setAddress(rs.getString("address"));
		u.setCity(rs.getString("city"));
		u.setState(rs.getString("state"));
		u.setZip(rs.getString("zip"));
		
		u.setCardname(rs.getString("cardname"));
		u.setCardnumber(rs.getString("cardnumber"));
		u.setExpmonth(rs.getString("expmonth"));
		u.setExpyear(rs.getString("expyear"));
		u.setCvv(rs.getString("cvv"));
		

	}
	}catch(Exception e){System.out.println(e);}
	return u;

}

    /*----------------------------------------------------------------------------------------------------------------------------------------------------*/


public static int Add_Contactus(contactus u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into contactus(fullname,email,phonenumber,messgae) values(?,?,?,?)");
		ps.setString(1,u.getFullname());
		ps.setString(2,u.getEmail());
		ps.setString(3,u.getPhonenumber());
		ps.setString(4,u.getMessgae());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}

public static List<contactus> getAllRecordsContact(){
	List<contactus> list=new ArrayList<contactus>();
	
	try{
		Connection con=getConnection();		
		PreparedStatement ps=con.prepareStatement("select * from contactus");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()){
		contactus u=new contactus();
			u.setFullname(rs.getString("fullname"));
			u.setEmail(rs.getString("email"));
			u.setPhonenumber(rs.getString("phonenumber"));
			u.setMessgae(rs.getString("messgae"));
		list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}


}
