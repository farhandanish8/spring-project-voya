<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <h2>Update Doctor Details</h2>
       <form action="updateDoctor">
       Doctor Name = <input type ="text" name="doctorName" readonly value=${doctor.doctorName}"><br><br>
       Doctor Id = <input type ="number" name="doctorId" readonly value=${doctor.doctorId}"><br><br>
       Doctor Speciality = <input type ="text" name="speciality" readonly value=${doctor.speciality}"><br><br>
       Doctor Fees = <input type ="number" name="fees" readonly value=${doctor.fees}"><br><br>
       Doctor Ratings = <input type ="number" name="ratings" readonly min="1" max="5" value=${doctor.ratings}"><br><br>
       Doctor Experience = <input type ="number" name="experience" readonly value=${doctor.experience}"><br><br>
       <input type ="submit" value="submit">
       </form>
</body>
</html>