<html>
<title>Spirit Pokemon</title>
<head>
	<link rel="stylesheet" href="./css/index.css"/>
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
<body class="blacks comfortaa">
<div class="relative z-10 w-full">
                
                <div>
                    <img
                    src="./assets/banner.jpg"
                    alt="Banner"
                    class="w-full h-3/4 shadow-lg shadow-[#646465]"
                    />
                </div>
                <div class="flex items-center w-full absolute top-0 left-0 bg-black opacity-80 shadow-lg shadow-[#04f6ea]">
                    
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
                        <a href="/SpiritPokemon/signin.jsp" class="text-md text-white">Sign In</a>
                        <a href="/SpiritPokemon/signup.jsp" class="text-md text-white">Sign Up</a>
                        
                    </div>
                    

                </div>
            </div>
            
            <div class = " flex items center m-10">
            	<img
                    src="./assets/clefairy2.jpg"
                    alt="clefairy"
                    class="w-1/3 h-3/4 shadow-lg shadow-[#646465] rounded-2xl"
                    />
                  <div>
	                  <div class="text-3xl text-center text-white my-5">
	                  	Head Over to the <a href="\SpiritPokemon\Help.jsp" class="hover:text-blue hover:underline">Help</a> Section to kickstart your journey.
	                  </div>
	                  <div class="text-3xl text-center text-white my-5">
	                  	To know more about us, head over to the <a href="\SpiritPokemon\AboutUs.jsp" class="hover:text-blue hover:underline">About Us</a> Section.
	                  </div>
	                  <div class="text-3xl text-center text-white my-5">
	                  	Finally head over to <a href="\SpiritPokemon\signin.jsp" class="hover:text-blue hover:underline">Spirit Pokemon</a> Section and EXPLORE!.<br>
	                  	OR<br>
	                  	Know about your pokemons in the <a href="\SpiritPokemon\signin.jsp" class="hover:text-blue hover:underline">Pokedex</a>
	                  </div>
	                  <div class="text-3xl text-center text-white my-5">
	                  Answer some simple questions in the spirit <br>
	                  pokemon personality test and find your spirit pokemon<br>
	                  </div>
                  </div>
            </div>
</body>
</html>
