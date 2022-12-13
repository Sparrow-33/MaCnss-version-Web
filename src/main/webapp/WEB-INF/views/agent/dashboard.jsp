<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:import url="components/head.jsp"></c:import>
<style>
    .accordion {
        background: #1FABAD;
        color: aliceblue;
    }
</style>
<body>
<c:import url="components/header.jsp"></c:import>


<ul class="flex justify-center flex-wrap text-sm font-medium text-center text-gray-500 mt-10 border-b border-gray-200 ">
    <li class="mr-2 ">
        <a href="#" class="accordion inline-block p-4 text-gray-800 bg-white rounded-t-lg active ">
            Patient
        </a>
    </li>
    <li class="mr-2">
        <a href="#" class="inline-block p-4 rounded-t-lg hover:text-gray-600 hover:bg-teal-100 ">
            Consultation
        </a>
    </li>
    <li class="mr-2">
        <a href="#" class="inline-block p-4 rounded-t-lg hover:text-gray-600 hover:bg-gray-50 ">
            Medicament
        </a>
    </li>

</ul>

<section class="w-full flex flex-col items-center justify-center">

 <c:if test="${patient == null}">
  <c:import url="dossier/patient.jsp"></c:import>
 </c:if>

 <c:if test="${consultation != null && consultation}">
  <c:import url="dossier/consultation.jsp"></c:import>
 </c:if>

<c:if test="${medicament != null && medicament}">
  <c:import url="dossier/medicaments.jsp"></c:import>
</c:if>

<c:if test="${radio != null}">
  <c:import url="dossier/radio.jsp"></c:import>
</c:if>

<c:if test="${analyse != null}">
  <c:import url="dossier/analyse.jsp"></c:import>
</c:if>
</section>
</body>
</html>
