<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css" referrerpolicy="no-referrer" />
    <script defer src="https://unpkg.com/alpinejs@3.x.x/dist/cdn.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <title>MaCnss</title>
</head>
<body>
<!-- component -->
<div class="relative min-h-screen flex items-center justify-center bg-gray-50 py-12 px-4 sm:px-6 lg:px-8 bg-gray-500 bg-no-repeat bg-cover relative items-center" style="background-image: url('<c:url value="resources/images/cnssImg.jpg"/>')">
    <div class="absolute bg-black opacity-60 inset-0 z-0"></div>
    <div class="max-w-md w-full space-y-8 p-10 bg-white rounded-xl z-10">
        <div class="text-center">
            <h2 class="mt-6 text-3xl font-bold text-gray-900">
                Bon retour
            </h2>
            <p class="mt-2 text-sm text-gray-600">Connectez vous</p>
        </div>
        <form class="mt-8 space-y-6" action="/agent/signIn" method="POST">
            <input type="hidden" name="remember" value="true">
            <div class="relative">
                <div class="absolute right-0 mt-4"><svg xmlns="http://www.w3.org/2000/svg"
                                                        class="h-6 w-6 text-green-500" fill="none" viewBox="0 0 24 24" stroke="currentColor">
                    <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                          d="M9 12l2 2 4-4m6 2a9 9 0 11-18 0 9 9 0 0118 0z"></path>
                </svg>
                </div>
                <label class="text-sm font-bold text-gray-700 tracking-wide">Email</label>
                <input name="email" class=" w-full text-base py-2 border-b border-gray-300 focus:outline-none focus:border-indigo-500" type="email" placeholder="Entre votre email" >
            </div>
            <div class="mt-8 content-center">
                <label class="text-sm font-bold text-gray-700 tracking-wide">
                    Mot de passe
                </label>
                <input name="password" class="w-full content-center text-base py-2 border-b border-gray-300 focus:outline-none focus:border-indigo-500" type="password" placeholder="Enter your password" >
            </div>
            <div>
                <button type="submit" class="w-full flex justify-center bg-indigo-500 text-gray-100 p-4  rounded-full tracking-wide
                              font-semibold  focus:outline-none focus:shadow-outline hover:bg-indigo-600 shadow-lg cursor-pointer transition ease-in duration-300">
                    Connexion
                </button>
            </div>
        </form>
    </div>
</div>
</body>
</html>