<html>
<head>
	<link rel="stylesheet" href="./css/signin.css"/>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;400;500;600;700&family=Orbitron:wght@400;500;600;700;800;900&display=swap" rel="stylesheet">
	<script src="https://cdn.tailwindcss.com"></script>
	<script>
	    tailwind.config = {
	      theme: {
	        extend: {
	          colors: {
	            clifford: '#da373d',
	            sandy : '#c6ceb0',
	            insta: '#b52ea9',
	            twitter: '#1da1f2',
	            linkedin: '#0077b5',
	            leaf: "#033f03",
	          }
	        }
	      }
	    }
	</script>
	<style type="text/tailwindcss">
    @layer utilities {
      .content-auto {
        content-visibility: auto;
      }
    }
  </style>
</head>
<body class='back-img'>
<div class="flex items-center w-full bg-black opacity-80 shadow-lg shadow-[#115c00] orbitron">
                    
        <div class="w-5/6 flex items-center gap-5">
            <div class="w-10 h-10 ml-3 my-3">
                <img
                src="./assets/logo.png"
                alt="Logo"
                class="w-full h-full"
                />
            </div>
            
            <h1 class="text-3xl text-white m-4">Spirit Pokemon</h1>
           	<a href="/SpiritPokemon/index.jsp" class="text-md text-white">Home</a>
            <a href="\SpiritPokemon\signin.jsp" class="text-md text-white">Pokedex</a>
            <!--  <a href="\#" class="text-md text-white"></a> -->
            <a href="\SpiritPokemon\signin.jsp" class="text-md text-white">Spirit Pokemon</a>
            <a href="\SpiritPokemon\Help.jsp" class="text-md text-white">Help</a>
            <a href="\SpiritPokemon\AboutUs.jsp" class="text-md text-white">About Us</a>
         
        </div>

        <div class="flex items-center justify-end mx-10 w-1/6 gap-5">
            <a href="/SpiritPokemon/jsp/signin.jsp" class="text-md text-white">Sign In</a>
            <a href="\SpiritPokemon" class="text-md text-white">Sign Up</a>
            
        </div>
        
</div>

<div class='bg-[#267f8f] rounded-lg w-2/5 right-align shadow-[#267f8f] shadow-md'>
	<div class='my-6'><h1 class='text-center text-3xl orbitron'>Sign In</h1></div>
	<form method='post' action='SignIn' class='text-center text-xl mb-6'>
	  <label for="email" class='orbitron'>Email: </label>
	  <input type="email" id="email" name="email" class='rounded-md h-12 comfortaa'><br><br><br>
	  <label for="Password" class='mb-6 orbitron'>Password: </label>
	  <input type="password" id="password" name="password" class='mb-6 rounded-md h-12 comfortaa'><br>
	  <input type='submit' value='Log In' class='mb-6 rounded-md h-12 orbitron rounded-lg bg-[#115c00] px-4 text-white hover:bg-white hover:text-black'>
	</form>
</div>
</body>
</html>