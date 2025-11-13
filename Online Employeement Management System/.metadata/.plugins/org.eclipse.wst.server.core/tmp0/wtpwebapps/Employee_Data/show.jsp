<%@page import="com.dao.EmployeeDao"%>
<%@page import="com.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Records</title>

<!-- Font Awesome for Icons -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css">

<style>
/* ====== Global Styles ====== */
body {
    font-family: 'Poppins', sans-serif;
    background: linear-gradient(135deg, #667eea, #764ba2);
    margin: 0;
    padding: 20px;
    color: #333;
}

/* ====== Page Title ====== */
h2 {
    text-align: center;
    color: #fff;
    font-weight: 600;
    letter-spacing: 1px;
    margin-bottom: 25px;
    animation: fadeIn 1s ease-in-out;
}

/* ====== Table Container ====== */
.table-container {
    overflow-x: auto;
    background-color: #fff;
    border-radius: 12px;
    padding: 15px;
    box-shadow: 0 6px 20px rgba(0,0,0,0.15);
    animation: slideUp 0.8s ease;
}

/* ====== Table Styles ====== */
table {
    width: 100%;
    border-collapse: collapse;
    min-width: 900px;
}

th, td {
    text-align: center;
    padding: 12px 10px;
}

th {
    background: linear-gradient(135deg, #5563de, #7c84f5);
    color: white;
    text-transform: uppercase;
    font-size: 14px;
    letter-spacing: 0.5px;
}

td {
    background-color: #fff;
    color: #333;
    border-bottom: 1px solid #e8e8e8;
    transition: background-color 0.3s ease, transform 0.3s ease;
}

tr:hover td {
    background-color: #f3f4ff;
    transform: scale(1.01);
}

/* ====== Button Styles ====== */
.btn {
    border: none;
    padding: 8px 14px;
    border-radius: 8px;
    font-size: 14px;
    cursor: pointer;
    color: white;
    display: flex;
    align-items: center;
    justify-content: center;
    gap: 6px;
    transition: all 0.3s ease;
}

/* Edit Button */
.btn-edit {
    background: linear-gradient(135deg, #00c6ff, #0072ff);
}
.btn-edit:hover {
    transform: translateY(-3px);
    box-shadow: 0 4px 12px rgba(0,114,255,0.4);
}

/* Delete Button */
.btn-delete {
    background: linear-gradient(135deg, #ff416c, #ff4b2b);
}
.btn-delete:hover {
    transform: translateY(-3px);
    box-shadow: 0 4px 12px rgba(255,65,108,0.4);
}

/* Icon animations on hover */
.btn i {
    transition: transform 0.3s ease;
}
.btn:hover i {
    transform: rotate(15deg) scale(1.1);
}

/* ====== Animations ====== */
@keyframes fadeIn {
    from {opacity: 0;}
    to {opacity: 1;}
}

@keyframes slideUp {
    from {opacity: 0; transform: translateY(20px);}
    to {opacity: 1; transform: translateY(0);}
}

/* ====== Responsive Design ====== */
@media (max-width: 768px) {
    th, td {
        padding: 10px 6px;
        font-size: 13px;
    }

    .btn {
        font-size: 12px;
        padding: 6px 10px;
    }

    h2 {
        font-size: 20px;
    }
}

@media (max-width: 600px) {
    table {
        min-width: unset;
    }

    td, th {
        display: block;
        text-align: right;
    }

    tr {
        display: block;
        margin-bottom: 15px;
        border-bottom: 2px solid #ddd;
    }

    th {
        background-color: transparent;
        color: #5563de;
        text-align: left;
    }

    td::before {
        content: attr(data-label);
        float: left;
        font-weight: bold;
        color: #444;
    }
}
</style>
</head>
<body>

<h2>Employee Records</h2>

<div class="table-container">
<table>
    <tr>
        <th>EMP_ID</th>
        <th>FNAME</th>
        <th>LNAME</th>
        <th>GENDER</th>
        <th>EMAIL</th>
        <th>MOBILE</th>
        <th>ADDRESS</th>
        <th>CITY</th>
        <th>STATE</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <%
        List<Employee> list = EmployeeDao.getEmployees();
        for(Employee s : list) {
    %>
    <tr>
        <td data-label="EMP_ID"><%=s.getEmp_id() %></td>
        <td data-label="FNAME"><%=s.getFname() %></td>
        <td data-label="LNAME"><%=s.getLname() %></td>
        <td data-label="GENDER"><%=s.getGender() %></td>
        <td data-label="EMAIL"><%=s.getEmail() %></td>
        <td data-label="MOBILE"><%=s.getMobile() %></td>
        <td data-label="ADDRESS"><%=s.getAddress() %></td>
        <td data-label="CITY"><%=s.getCity()%></td>
        <td data-label="STATE"><%=s.getState() %></td>
        <td data-label="Edit">
            <form action="EmployeeController" method="post">
                <input type="hidden" name="emp_id" value="<%=s.getEmp_id()%>" />
                <button type="submit" name="action" value="Edit" class="btn btn-edit">
                    <i class="fa-solid fa-pen-to-square"></i> Edit
                </button>
            </form>
        </td>
        <td data-label="Delete">
            <form action="EmployeeController" method="post">
                <input type="hidden" name="emp_id" value="<%=s.getEmp_id()%>" />
                <button type="submit" name="action" value="Delete" class="btn btn-delete">
                    <i class="fa-solid fa-trash-can"></i> Delete
                </button>
            </form>
        </td>
    </tr>
    <% } %>
</table>
</div>
</body>
</html>
