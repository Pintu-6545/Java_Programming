<%@page import="com.dao.UsersDao"%>
<%@page import="com.bean.Users"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>User Management Dashboard</title>

<!-- Font Awesome -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

<!-- ======= NEXT-LEVEL CSS DESIGN ======= -->
<style>
:root {
  --primary: #4f46e5;
  --secondary: #00bcd4;
  --danger: #f44336;
  --success: #4caf50;
  --background: #f4f7fb;
  --white: #ffffff;
  --shadow: rgba(0,0,0,0.1);
}

/* ===== GLOBAL STYLES ===== */
body {
  font-family: 'Poppins', sans-serif;
  background: var(--background);
  margin: 0;
  padding: 30px;
  color: #333;
  animation: fadeIn 1s ease-in-out;
}

h2 {
  text-align: center;
  font-weight: 600;
  color: var(--primary);
  letter-spacing: 1px;
  margin-bottom: 25px;
  text-shadow: 0 0 8px rgba(79,70,229,0.3);
}

/* ===== TABLE CONTAINER ===== */
.table-container {
  width: 100%;
  overflow-x: auto;
  background: var(--white);
  border-radius: 15px;
  box-shadow: 0 10px 25px var(--shadow);
  padding: 10px 0;
  animation: slideUp 1s ease;
}

/* ===== TABLE STYLES ===== */
table {
  width: 100%;
  border-collapse: collapse;
  min-width: 1000px;
}

th {
  background: linear-gradient(90deg, var(--primary), var(--secondary));
  color: white;
  padding: 14px;
  font-size: 14px;
  text-transform: uppercase;
  letter-spacing: 1px;
  position: relative;
}

td {
  padding: 12px;
  text-align: center;
  border-bottom: 1px solid #e0e0e0;
  transition: all 0.4s ease;
}

/* ===== ROW EFFECTS ===== */
tr {
  transition: all 0.4s ease;
}

tr:hover {
  background: linear-gradient(90deg, #e8f0fe, #f0f9ff);
  transform: scale(1.01);
  box-shadow: inset 0 0 10px rgba(0,0,0,0.05);
  cursor: pointer;
}

/* Add subtle animated border when hovered */
tr:hover td {
  border-bottom: 1px solid var(--primary);
}

/* ===== BUTTONS ===== */
button {
  border: none;
  border-radius: 30px;
  padding: 8px 14px;
  font-size: 14px;
  font-weight: 500;
  color: #fff;
  cursor: pointer;
  transition: all 0.3s ease;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  box-shadow: 0 4px 10px var(--shadow);
}

/* Edit Button */
button[name="action"][value="Edit"] {
  background: linear-gradient(45deg, var(--success), #66bb6a);
}

button[name="action"][value="Edit"]:hover {
  background: linear-gradient(45deg, #66bb6a, var(--success));
  box-shadow: 0 0 12px rgba(76,175,80,0.6);
  transform: scale(1.08) translateY(-2px);
}

/* Delete Button */
button[name="action"][value="Delete"] {
  background: linear-gradient(45deg, var(--danger), #ef5350);
}

button[name="action"][value="Delete"]:hover {
  background: linear-gradient(45deg, #ef5350, var(--danger));
  box-shadow: 0 0 12px rgba(244,67,54,0.6);
  transform: scale(1.08) translateY(-2px);
}

/* ===== RESPONSIVENESS ===== */
@media (max-width: 768px) {
  th, td {
    padding: 8px;
    font-size: 12px;
  }
  button {
    font-size: 12px;
    padding: 6px 10px;
  }
}

/* ===== ANIMATIONS ===== */
@keyframes fadeIn {
  from {opacity: 0;}
  to {opacity: 1;}
}

@keyframes slideUp {
  from {opacity: 0; transform: translateY(30px);}
  to {opacity: 1; transform: translateY(0);}
}
</style>
</head>

<body>
<h2><i class="fa-solid fa-users"></i> User Management Dashboard</h2>

<div class="table-container">
  <table>
    <tr>
      <th><i class="fa-solid fa-id-card"></i> ID</th>
      <th><i class="fa-solid fa-user"></i> Username</th>
      <th><i class="fa-solid fa-envelope"></i> Email</th>
      <th><i class="fa-solid fa-lock"></i> Password</th>
      <th><i class="fa-solid fa-phone"></i> Mobile</th>
      <th><i class="fa-solid fa-location-dot"></i> Address</th>
      <th><i class="fa-solid fa-mail-bulk"></i> Zipcode</th>
      <th><i class="fa-solid fa-city"></i> City</th>
      <th><i class="fa-solid fa-map-location-dot"></i> State</th>
      <th><i class="fa-solid fa-pen-to-square"></i> Edit</th>
      <th><i class="fa-solid fa-trash-can"></i> Delete</th>
    </tr>

    <%
      List<Users> list = UsersDao.getUsers();
      for (Users u : list) {
    %>
    <tr>
      <td><%= u.getUser_id() %></td>
      <td><%= u.getUsername() %></td>
      <td><%= u.getEmail() %></td>
      <td><%= u.getPassword() %></td>
      <td><%= u.getMobile() %></td>
      <td><%= u.getAddress() %></td>
      <td><%= u.getZipcode() %></td>
      <td><%= u.getCity() %></td>
      <td><%= u.getState() %></td>

      <td>
        <form action="UsersController" method="post">
          <input type="hidden" name="user_id" value="<%= u.getUser_id() %>" />
          <button type="submit" name="action" value="Edit">
            <i class="fa-solid fa-pen"></i> Edit
          </button>
        </form>
      </td>

      <td>
        <form action="UsersController" method="post">
          <input type="hidden" name="user_id" value="<%= u.getUser_id() %>" />
          <button type="submit" name="action" value="Delete">
            <i class="fa-solid fa-trash"></i> Delete
          </button>
        </form>
      </td>
    </tr>
    <% } %>
  </table>
</div>
</body>
</html>
