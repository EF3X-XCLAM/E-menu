var incBtn = document.getElementsByClassName('inc');
var decBtn = document.getElementsByClassName('dec');
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
			}
			//input.value = parseInt(inputValue)+ 1;
			//console.log(input.value);
		})
	}

	///Decrement
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
			}
			//input.value = parseInt(inputValue)+ 1;
			//console.log(input.value);
		})
	}