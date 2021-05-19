var incBtn = document.getElementsByClassName('btn-outline-success');
var decBtn = document.getElementsByClassName('btn-outline-danger');
var total = parseFloat(document.getElementById('tot').innerHTML);
	console.log(incBtn);
	console.log(decBtn);
	
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
			console.log("inc");
			console.log(total);
			total = parseFloat(price.innerHTML) + total;
		}else if(total > 0){
			console.log("dec");
			console.log(total);
			total = total - parseFloat(price.innerHTML) ;
		}
		console.log(total);

		if(total < 0){
			document.getElementById('tot').innerHTML = 0;
		}else{
			document.getElementById('tot').innerHTML = total.toFixed(2);
		}

	}
function togglePopup() {
	document.getElementById("popup-1").classList.toggle("active");
}


if (document.readyState == 'loading')
{document.addEventListener( 'DOMContentLoaded', ready)}
else {
	ready(

	)
}
function ready() {

window.onload = function () {
		document.getElementById('6').click();
	}


	updatecarttotal()
	var fortotal = document.getElementById('tot')
	var newnew = fortotal.textContent;

	console.log(newnew)
	const inputs = document.getElementById('somebutn')









	var removeCartItemButtons = document.getElementsByClassName('remove')



	for (var i = 0; i < removeCartItemButtons.length; i++) {
		var button = removeCartItemButtons[i]
		button.addEventListener('click', removeCartItem)



		var quntityInputs = document.getElementsByClassName('item_quan')
		console.log(quntityInputs)
		for (var i = 0; i < quntityInputs.length;i++)
		{ var input = quntityInputs[i]
			input.addEventListener('change',quantityChanged)
		}

		var addToCartButtons = document.getElementsByClassName('btn-outline-success')
		for (var i = 0; i < addToCartButtons.length; i++)
		{var button = addToCartButtons[i]
			button.addEventListener('click',addToCartClicked)
		}


	}
}

function removeCartItem(event) {
	var buttonClicked = event.target
	buttonClicked.parentElement.parentElement.remove()
	updatecarttotal()

}

function quantityChanged(event)
{var input = event.target
	if (isNaN(input.value) || input.value <= 0)
	{ input.value = 1}
	updatecarttotal()


}

function addToCartClicked(event) {
	var button = event.target
	//console.log(button.parentElement.parentElement)
	var shopItem = button.parentElement.parentElement
	//console.log (button.parentElement.parentElement.parentElement.parentElement)
	var itemtitle = button.parentElement.parentElement.parentElement.parentElement
	var selectedtitle = itemtitle.getElementsByClassName('item_text_container')[0].innerText;
	var selectedQuantity = shopItem.getElementsByClassName('item_quan')[0].value;
	var ItemsPrice = shopItem.getElementsByClassName('text-center')[0].innerText;
	console.log(selectedtitle)
	addItemToCart(selectedQuantity,ItemsPrice,selectedtitle)

}

function addItemToCart(titles, prices, title1)
{
	var cartRow = document.createElement('div')
	console.log(titles,prices)
	cartRow.classList.add('cart-row')
	var cartItems = document.getElementsByClassName('cart-items')[0]
	var cartItemNames = cartItems.getElementsByClassName('cart-item-title')


	for (var i = 0; i < cartItemNames.length; i++)
	{if (cartItemNames[i].innerHTML == title1)
	{alert('This item is already in the order')
		return
	}
	}
	var cartRowContents = `<div class="cart-item cart-column">
\t\t\t\t\t\t\t<span class="cart-item-title">${title1}</span>
\t\t\t\t\t\t</div>
\t\t\t\t\t\t<span class="cart-price cart-column">${prices}</span>
\t\t\t\t\t\t<div class="cart-quantity cart-column">
\t\t\t\t\t\t\t<button type="button" class="btn btn-outline-danger rounded-circle plus-minus-btn dec">
\t\t\t\t\t\t\t\t−
\t\t\t\t\t\t\t</button>
\t\t\t\t\t\t\t<input type="number" class="form-control item_quan" value=1 min="1" max="10" name="qty" id="1">
\t\t\t\t\t\t\t<button type="button" class="btn btn-outline-success rounded-circle plus-minus-btn inc">
\t\t\t\t\t\t\t\t+
\t\t\t\t\t\t\t</button>
\t\t\t\t\t\t\t<button class="btn btn-outline-danger rounded-circle plus-minus-btn remove" type="button">X</button>
\t\t\t\t\t\t</div>

`



	cartRow.innerHTML = cartRowContents
	cartItems.append(cartRow)

	cartRow.getElementsByClassName('remove')[0].addEventListener('click',removeCartItem)
	cartRow.getElementsByClassName('item_quan')[0].addEventListener('change',quantityChanged)
	updatecarttotal()
}
var valuecount;
document.querySelector(".btn-outline-success").addEventListener('click',function ()
{valuecount = document.getElementsByClassName('item_quan').value;
	valuecount++;
	document.getElementsByClassName('item_quan').value = valuecount})

function updatecarttotal()
{   var cartcontainer = document.getElementsByClassName('cart-items')[0]
	var carrtross = cartcontainer.getElementsByClassName('cart-row')
	var total = 0;
	for (var i = 0; i < carrtross.length; i++){

		var cartRrow = carrtross[i]
		var priceelemnt = cartRrow.getElementsByClassName('cart-price')[0]
		var quanele = cartRrow.getElementsByClassName('form-control item_quan')[0].value;
		var price = parseFloat(priceelemnt.innerText.replace('€',''))

		total = total + (price * quanele)

	}
	total = Math.round(total * 100 ) / 100
	document.getElementsByClassName('cartel-total-price')[0].innerText = "$" + total
	document.getElementById('tot').innerHTML = total.toFixed(2);

	console.log(total)

	var fortotal = document.getElementById('tot')
	var newnew = fortotal.textContent;

	console.log(newnew)
	const inputs = document.getElementById('somebutn')





	if (newnew > 0)
	{inputs.disabled = false;}
	else
	{inputs.disabled = true;}




}