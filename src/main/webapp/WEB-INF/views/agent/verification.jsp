
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:import url="components/head.jsp"></c:import>
<body>
<!-- component -->
<div class="relative flex min-h-screen flex-col justify-center overflow-hidden bg-gray-50 py-12">
    <div class="relative bg-white px-6 pt-10 pb-9 shadow-xl mx-auto w-full max-w-lg rounded-2xl">
        <div class="mx-auto flex w-full max-w-md flex-col space-y-16">
            <div class="flex flex-col items-center justify-center text-center space-y-2">
                <div class="font-semibold text-3xl">
                    <p>Email Verification</p>
                </div>
            </div>

            <div>
                <form action="/agent/codeVerification" method="post">
                    <div class="flex flex-col space-y-16">
                        <div class="flex flex-row items-center justify-between mx-auto w-full max-w-xs">
                            <div class="w-full h-16 ">
                                <input  class="w-full h-full flex flex-col items-center justify-center text-center px-5 outline-none rounded-xl border border-gray-200 text-lg bg-white focus:bg-gray-50 focus:ring-1 ring-blue-700" type="text" maxlength="6" name="code" id="">
                            </div>

                        </div>

                        <div class="flex justify-center items-center flex-col space-y-5">
                                <button class="flex flex-row items-center justify-center text-center w-2/3 font-semibold border rounded-xl outline-none py-3 bg-blue-700 border-none text-white text-lg shadow-sm">
                                    Verifier
                                </button>
                            <div class="flex flex-row items-center justify-center text-center text-sm font-medium space-x-1 text-gray-500">
                                <p>vous n'avez pas recu le code?</p> <a class="flex flex-row items-center text-blue-600"  rel="">Reconnexion</a>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
