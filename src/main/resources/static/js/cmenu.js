var incBtn = document.getElementsByClassName('inc');
var decBtn = document.getElementsByClassName('dec');
var total = parseFloat(document.getElementById('tot').innerHTML);
	//console.log(incBtn);
	//console.log(decBtn);

	///Increment
	for(var i = 0; i < incBtn.length; i++){
		var btn = incBtn[i];

		btn.addEventListener('click', function(event){

			var btnClicked = event.target;
			//console.log(btnClicked);
			var input = btnClicked.parentElement.children[1];
			//console.log(input);
			var inputValue = input.value;
			//console.log(inputValue);
			if(inputValue < parseInt(input.max)){
				input.value = parseInt(inputValue)+ 1;
				//console.log(input.value);
				getTotal(btnClicked.parentElement.parentElement.children[1], "inc");
			}
			//console.log(input.value);

		})
	}

	for(var i = 0; i < decBtn.length; i++){
		var btn = decBtn[i];

		btn.addEventListener('click', function(event){

			var btnClicked = event.target;
			//console.log(btnClicked);
			var input = btnClicked.parentElement.children[1];
			//console.log(input);
			var inputValue = input.value;
			//console.log(inputValue);
			if(inputValue >= parseInt(input.min)){
				input.value = parseInt(inputValue)-1;
				//console.log(input.value);
				getTotal(btnClicked.parentElement.parentElement.children[1], "dec");
			}
			//console.log(input.value);

		})
	}

	function getTotal(pPrice,ope){

		//	console.log(ope);


		var price = pPrice.childNodes[1];;
		console.log(price.innerHTML);

		if(ope == 'inc'){
			//console.log("inc");
			//console.log(total);
			total = parseFloat(price.innerHTML) + total;
		}else if(total > 0){
			//console.log("dec");
			//console.log(total);
			total = total - parseFloat(price.innerHTML) ;
		}
		//console.log(total);
		if(total < 0){
			document.getElementById('tot').innerHTML = 0;
		}else{
			document.getElementById('tot').innerHTML = total.toFixed(2);
		}

	}