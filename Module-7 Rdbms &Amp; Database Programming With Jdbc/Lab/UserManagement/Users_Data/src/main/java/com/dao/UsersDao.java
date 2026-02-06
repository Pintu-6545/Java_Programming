package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Users;
import com.util.UsersUtil;

public class UsersDao {
	public static void insertUsers(Users u)
	{
		try {
		    Connection conn = UsersUtil.creConnection();
			String sql="insert into user (username,email,password,mobile,address,zipcode,city,state) values (?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getUsername());
			pst.setString(2, u.getEmail());
			pst.setString(3, u.getPassword());
			pst.setLong(4, u.getMobile());
			pst.setString(5, u.getAddress());
			pst.setLong(6, u.getZipcode());
			pst.setString(7, u.getCity());
			pst.setString(8, u.getState());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Users> getUsers()
	{
		List<Users> list  = new ArrayList<Users>();
		try {
			Connection conn = UsersUtil.creConnection();
			String sql="select * from user";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Users u = new Users();
				u.setUser_id(rs.getInt("user_id"));
				u.setUsername(rs.getString("username"));
				u.setEmail(rs.getString("email"));
				u.setPassword(rs.getString("password"));
				u.setMobile(rs.getLong("mobile"));
				u.setAddress(rs.getString("address"));
				u.setZipcode(rs.getLong("zipcode"));
				u.setCity(rs.getString("city"));
				u.setState(rs.getString("state"));
				list.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
 public static Users getUsers(int user_id)
 {
	 Users u = null;
	 try {
		Connection conn =UsersUtil.creConnection();
		String sql="select * from user where user_id=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1,user_id);
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
		  u = new Users();
		  u.setUser_id(rs.getInt("user_id"));
		  u.setUsername(rs.getString("username"));
		  u.setEmail(rs.getString("email"));
		  u.setPassword(rs.getString("password"));
		  u.setMobile(rs.getLong("mobile"));
		  u.setAddress(rs.getString("address"));
		  u.setZipcode(rs.getLong("zipcode"));
		  u.setCity(rs.getString("city"));
		  u.setState(rs.getString("state"));
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	 return u;
 }
 public static void updateUsers(Users u )
 {
	 try {
		  Connection conn = UsersUtil.creConnection();
		  String sql="update user set username=?,email=?,password=?,mobile=?,address=?,zipcode=?,city=?,state=? where user_id=? ";
		  PreparedStatement pst = conn.prepareStatement(sql);
		  pst.setString(1, u.getUsername());
		  pst.setString(2, u.getEmail());
		  pst.setString(3, u.getPassword());
		  pst.setLong(4, u.getMobile());
		  pst.setString(5, u.getAddress());
		  pst.setLong(6, u.getZipcode());
		  pst.setString(7, u.getCity());
		  pst.setString(8, u.getState());
		  pst.setInt(9, u.getUser_id());
		  pst.executeUpdate();
				  
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
 
 public static void deleteUsers(int user_id )
 {
	 try {
		Connection conn = UsersUtil.creConnection();
		String sql="delete from user where user_id=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, user_id);
		pst.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
 }

}
