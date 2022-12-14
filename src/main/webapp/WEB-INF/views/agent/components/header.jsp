<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header class="text-gray-600 body-font">
    <div class="container mx-auto flex flex-wrap py-5 px-8 flex-col md:flex-row items-center shadow-sm">
        <a class="flex title-font font-medium items-center text-gray-900 mb-4 md:mb-0">
            <img src="<c:url value='../../../../resources/images/logo_ar.png'/> " alt="">
            <span class="ml-3 text-xl">CNSS</span>
        </a>
        <nav class="md:ml-auto md:mr-auto flex flex-wrap items-center text-base justify-center">
            <a class="mr-5 font-semibold hover:text-gray-900">Dossier</a>
            <a class="mr-5 font-semibold hover:text-gray-900">Ajouter Dossier</a>
<%--            <a class="mr-5 hover:text-gray-900">Third Link</a>--%>
<%--            <a class="mr-5 hover:text-gray-900">Fourth Link</a>--%>
        </nav>
        <button class="inline-flex items-center bg-gray-100 border-0 py-1 px-3 focus:outline-none hover:bg-gray-200 rounded text-base mt-4 md:mt-0">logout
            <svg fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="w-4 h-4 ml-1" viewBox="0 0 24 24">
                <path d="M5 12h14M12 5l7 7-7 7"></path>
            </svg>
        </button>
    </div>
</header>