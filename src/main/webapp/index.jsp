<!DOCTYPE html>
<html lang="en">

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Lecznic@</title>
    <link href="styles/enter.css" rel="stylesheet" type="text/css">
  </head>
  <div id="clockbox" class="clockbox"></div>
  <script type="text/javascript">
	function GetClock(){
	var d=new Date();
	var nmonth=d.getMonth(),ndate=d.getDate(),nyear=d.getFullYear();
	var nhour=d.getHours(),nmin=d.getMinutes(),nsec=d.getSeconds();
	if(nmin<=9) nmin="0"+nmin
	if(nsec<=9) nsec="0"+nsec;

	document.getElementById('clockbox').innerHTML=""+ndate+"/"+(nmonth+1)+"/"+nyear+" "+nhour+":"+nmin+":"+nsec+"";
	}

	window.onload=function(){
	GetClock();
	setInterval(GetClock,1000);
	}
	</script>

  
  
 	 <h1>Lecznic@</h1>
 	<p class="p1">Lecznic@ jest prostym i intuicyjnym oprogramowanie<br> do zarządzania praktyką weterynaryjną.</p>
	<hr></hr>
  	<body class="body1">
	<button type="button" class="buttonAnimal" onclick="location = 'startAnimal.jsp'"><b>Zwierzęta</b></button> 
	
	<button type="button" class="buttonCustomer" onclick="location = 'startCustomer.jsp'"><b>Klienci</b></button>
	
	<button type="button" class="buttonVisit" onclick="location = 'startVisit.jsp'"><b>Wizyta</b></button>
	 
	<button type="button" class="buttonWarehouse" onclick="location = 'startWarehouse.jsp'"><b>Magazyn leków</b></button>
	
	<button type="button" class="buttonDocuments" onclick="location = 'startDocuments.jsp'"><b>Dokumenty</b></button>
	
	<button type="button" class="buttonHelp" onclick="location = 'startHelp.jsp'"><b>Pomoc</b></button>
	
  </body>
   
</html>