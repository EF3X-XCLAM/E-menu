var incBtn = document.getElementsByClassName('inc');
var decBtn = document.getElementsByClassName('dec');
var total = parseFloat(document.getElementById('tot').innerHTML);

	///Increment
	for(var i = 0; i < incBtn.length; i++){
		var btn = incBtn[i];

		btn.addEventListener('click', function(event){

			var btnClicked = event.target;
			var input = btnClicked.parentElement.children[1];
			var inputValue = input.value;
			if(inputValue < parseInt(input.max)){
				input.value = parseInt(inputValue)+ 1;
				getTotal(btnClicked.parentElement.parentElement.children[1], "inc");
			}
		})
	}

	for(var i = 0; i < decBtn.length; i++){
		var btn = decBtn[i];

		btn.addEventListener('click', function(event){

			var btnClicked = event.target;
			var input = btnClicked.parentElement.children[1];
			var inputValue = input.value;
			if(inputValue >= parseInt(input.min)){
				input.value = parseInt(inputValue)-1;
				getTotal(btnClicked.parentElement.parentElement.children[1], "dec");
			}

		})
	}

	function getTotal(pPrice,ope){

		var price = pPrice.childNodes[1];;
		console.log(price.innerHTML);

		if(ope == 'inc'){
			total = parseFloat(price.innerHTML) + total;
		}else if(total > 0){
			total = total - parseFloat(price.innerHTML) ;
		}
		if(total < 0){
			document.getElementById('tot').innerHTML = 0;
		}else{
			document.getElementById('tot').innerHTML = total.toFixed(2);
		}

	}