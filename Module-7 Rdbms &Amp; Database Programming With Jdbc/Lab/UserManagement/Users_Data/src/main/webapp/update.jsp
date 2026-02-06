<%@page import="com.bean.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>User Registration Form</title>
  <style>
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      font-family: "Poppins", sans-serif;
    }

    body {
      min-height: 100vh;
      display: flex;
      justify-content: center;
      align-items: center;
      background: linear-gradient(135deg, #8e2de2, #4a00e0);
      padding: 20px;
    }

    .form-container {
      width: 100%;
      max-width: 450px;
      padding: 40px 35px;
      border-radius: 20px;
      background: rgba(255, 255, 255, 0.15);
      backdrop-filter: blur(20px);
      border: 1px solid rgba(255, 255, 255, 0.3);
      box-shadow: 0 10px 40px rgba(0, 0, 0, 0.3);
      color: #fff;
      animation: fadeIn 1.2s ease;
    }

    @keyframes fadeIn {
      from {opacity:0; transform: translateY(-40px);}
      to {opacity:1; transform: translateY(0);}
    }

    h2 { text-align:center; margin-bottom:25px; font-size:28px; color:#fff; }

    .form-group {
      position: relative;
      margin-bottom: 25px;
    }

    .form-group input,
    .form-group textarea,
    .form-group select {
      width: 100%;
      padding: 12px 15px;
      border: none;
      outline: none;
      border-radius: 10px;
      background: rgba(255, 255, 255, 0.1);
      color: #fff;
      font-size: 15px;
      resize: none;
      transition: all 0.4s ease;
    }

    .form-group label {
      position: absolute;
      top: 12px;
      left: 15px;
      color: rgba(255,255,255,0.8);
      font-size: 14px;
      pointer-events: none;
      transition: 0.3s ease;
    }

    .form-group input:focus + label,
    .form-group input:valid + label,
    .form-group textarea:focus + label,
    .form-group textarea:valid + label,
    .form-group select:focus + label,
    .form-group select:valid + label {
      top: -10px;
      left: 10px;
      font-size: 12px;
      color: #00e6ff;
      background: rgba(0,0,0,0.3);
      padding: 2px 6px;
      border-radius: 6px;
    }

    .form-group input:focus,
    .form-group textarea:focus,
    .form-group select:focus {
      background: rgba(255, 255, 255, 0.2);
      box-shadow: 0 0 10px #00e6ff;
      transform: scale(1.03);
    }

    .btn {
      width:100%; padding:12px; border:none; border-radius:10px; font-size:16px; font-weight:600;
      color:#fff; background: linear-gradient(135deg,#00c6ff,#0072ff); cursor:pointer; position:relative; overflow:hidden; transition: all 0.4s ease;
    }

    .btn::before {
      content:""; position:absolute; top:0; left:-100%; width:100%; height:100%;
      background: linear-gradient(120deg, transparent, rgba(255,255,255,0.6), transparent);
      transition: all 0.6s ease;
    }

    .btn:hover::before { left:100%; }
    .btn:hover { box-shadow:0 0 20px rgba(0,198,255,0.6); transform: translateY(-3px); }
    .btn:active { transform: scale(0.97); }

    .form-footer { text-align:center; margin-top:20px; font-size:14px; }
    .form-footer a { color:#00e6ff; text-decoration:none; }
    .form-footer a:hover { text-decoration:underline; }

    @media(max-width:480px){
      .form-container{ padding:30px 20px; }
      h2{ font-size:24px; }
    }
  </style>
</head>
<body>
  <div class="form-container">
    <h2>User Registration</h2>
    <b style="color:green">
    <%
    	Users u = (Users)request.getAttribute("u");
        if(request.getAttribute("msg")!=null)
        {
        	out.println(request.getAttribute("msg"));
        }
    %>
    </b>

    <form name="frm" method="post" action="UsersController"> 
		
	<div class="form-group">
        <input type="hidden" name="user_id" value="<%= u.getUser_id() %>" required />
      </div>	
      <!-- Username -->
      <div class="form-group">
        <input type="text" name="username" value="<%= u.getUsername() %>" required />
        <label>Username</label>
      </div>

      <!-- Email -->
      <div class="form-group">
        <input type="email" name="email" value="<%= u.getEmail() %>" required />
        <label>Email</label>
      </div>

      <!-- Password -->
      <div class="form-group">
        <input type="password" name="password" value="<%= u.getPassword() %>" required />
        <label>Password</label>
      </div>

      <!-- Mobile -->
      <div class="form-group">
        <input type="text" name="mobile" value="<%= u.getMobile() %>" required />
        <label>Mobile</label>
      </div>

      <!-- Address -->
      <div class="form-group">
        <textarea name="address" rows="3" required><%= u.getAddress() %></textarea>
        <label>Address</label>
      </div>

      <div class="form-group">
        <input type="text" name="zipcode" value="<%= u.getZipcode() %>" required />
        <label>Zipcode</label>
      </div>

      <!-- City -->
      <div class="form-group">
        <input type="text" name="city" value="<%= u.getCity() %>" required />
        <label>City</label>
      </div>

      <!-- State -->
      <div class="form-group">
        <input type="text" name="state" value="<%= u.getState() %>" required  />
        <label>State</label>
      </div>

      <button type="submit" name="action" class="btn" value="update">Update</button>
    </form>

    <div class="form-footer">
       <a href="show.jsp">Display Registered Users</a>
    </div>
  </div>
</body>
</html>
