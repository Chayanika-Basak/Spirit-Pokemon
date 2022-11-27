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

				<%
            		String name = (String)session.getAttribute("name");
					String abilities = (String)session.getAttribute("abilities");
					String type1 = (String)session.getAttribute("type1");
					String type2 = (String)session.getAttribute("type2");
					double against_bug= (double)session.getAttribute("against_bug");
					double against_dark = (double)session.getAttribute("against_dark");
					double against_dragon = (double)session.getAttribute("against_dragon");
					double against_electric = (double)session.getAttribute("against_electric");
					double against_fairy = (double)session.getAttribute("against_fairy");
					double against_fight = (double)session.getAttribute("against_fight");
					double against_fire = (double)session.getAttribute("against_fire");
					double against_flying = (double)session.getAttribute("against_flying");
					double against_ghost = (double)session.getAttribute("against_ghost");
					double against_grass = (double)session.getAttribute("against_grass");
					double against_ground = (double)session.getAttribute("against_ground");
					double against_ice = (double)session.getAttribute("against_ice");
					double against_normal = (double)session.getAttribute("against_normal");
					double against_poison = (double)session.getAttribute("against_poison");
					double against_psychic = (double)session.getAttribute("against_psychic");
					double against_rock = (double)session.getAttribute("against_rock");
					double against_steel = (double)session.getAttribute("against_steel");
					double against_water = (double)session.getAttribute("against_water");
            		
            	%>

<div class='bg-[#267f8f] rounded-lg right-align shadow-[#267f8f] shadow-md m-10'>
	<div class='my-6'><h1 class='text-center text-3xl orbitron'><% out.println(name); %></h1></div>
	<table class="border-2 border-black border-separate">
	<tr>
			
		<th>name</th>	
		<th>type1</th>	
		<th>type2</th>	
		<th>abilities</th>	
		<th>against_bug</th>	
		<th>against_dark</th>	
		<th>against_dragon</th>	
		<th>against_electric</th>	
		<th>against_fairy</th>	
		<th>against_fight</th>	
		<th>against_fire</th>	
		<th>against_flying</th>	
		<th>against_ghost</th>	
		<th>against_grass</th>	
		<th>against_ground</th>	
		<th>against_ice</th>	
		<th>against_normal</th>	
		<th>against_poison</th>	
		<th>against_psychic</th>	
		<th>against_rock</th>	
		<th>against_steel</th>	
		<th>against_water</th>
		
	</tr>
	<tr>
		<td><% out.println(name); %></td>	
		<td><% out.println(type1); %></td>	
		<td><% out.println(type2); %></td>	
		<td><% out.println(abilities); %></td>	
		<td><% out.println(against_bug); %></td>	
		<td><% out.println(against_dark); %></td>	
		<td><% out.println(against_dragon); %></td>	
		<td><% out.println(against_electric); %></td>	
		<td><% out.println(against_fairy); %></td>	
		<td><% out.println(against_fight); %></td>	
		<td><% out.println(against_fire); %></td>	
		<td><% out.println(against_flying); %></td>	
		<td><% out.println(against_ghost); %></td>	
		<td><% out.println(against_grass); %></td>	
		<td><% out.println(against_ground); %></td>	
		<td><% out.println(against_ice); %></td>	
		<td><% out.println(against_normal); %></td>	
		<td><% out.println(against_poison); %></td>	
		<td><% out.println(against_psychic); %></td>	
		<td><% out.println(against_rock); %></td>	
		<td><% out.println(against_steel); %></td>	
		<td><% out.println(against_water); %></td>
	</tr>

	</table>
</div>
</body>
</html>