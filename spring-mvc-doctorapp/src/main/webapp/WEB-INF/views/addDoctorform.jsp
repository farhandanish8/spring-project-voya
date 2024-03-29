<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addDoctor">

DoctorName:<input type="text" name="doctorname"> <br> <br>
Speciality:<select name ="speciality" >
                    <option value="ORTHOPEDIC">ORTHOPEDIC</option>
                    <option value="PEDIATRICIAN">PEDIATRICIAN</option>
					<option value="GYNAECOLOGIST">GYNAECOLOGIST</option>
					 <option value="NEUROLOGIST">NEUROLOGIST</option>
</select>
<br><br>
fees:<input type="text" name="fees"><br><br>
Ratings:<input type="text" name="ratings"><br><br>
Experience:<input type="text" name="experience"><br><br>

<input type="submit" value="add Doctor">
</form>
</body>
</html>