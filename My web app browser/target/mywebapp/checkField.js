function checkPrice()
{
	var minimum_price = document.forms["Form"]["minimum_price"].value;
	var maximum_price = document.forms["Form"]["maximum_price"].value;
	if (minimum_price > maximum_price)
	{
		alert("ERROR! The Minimum Price must be less equal than The Maximum Price");
		return false;
	}
}