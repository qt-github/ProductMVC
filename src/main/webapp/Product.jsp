<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 3/18/2023
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Product</title>
</head>
<body>
<h1>Product</h1>
<a href="addProduct">Add Product</a>
<table>
  <thead>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Description</th>
    <th>Manufacturer ID</th>
    <th>Action</th>
  </tr>
  </thead>
  <tbody>
  <!-- Loop through products -->
  <tr>
    <td>{productId}</td>
    <td>{productName}</td>
    <td>{description}</td>
    <td>{manId}</td>
    <td>
      <a href="editProduct/{productId}">Edit</a>
      <a href="deleteProduct/{productId}">Delete</a>
    </td>
  </tr>
  </tbody>
</table>
</body>
</html>

