//A class that allows us to pass specific error messages to the Input classe's functions, allowing them to display the right error messages if the user enters input wrong
//Designed by Luka January 2022. Everyone contributed error messages for different errors that could happen.

class ErrorMessages {

  Colours colours = new Colours(); // instance of colours class

  Input FoodSelectionError = new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nHere's a quick list of your options:\n1. fries $4\n2. soup $3\n3. salad $4\n4. pizza $7\n5. sandwhich $5\n6. pasta $10\n10. View Detailed Menu\n20. Finish Ordering\n");

  Input FoodlistSelectionError = new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\n1. Confirm Order\n2. Add More To Your Order\n3. Delete An Item From Your Order\n");

  //Sandwich error messages
  Input SandwichVegOrMeatError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour sandwich options are:\n1. Veggie\n2. Meat\n");

  Input BreadTypeError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour bread type options are:\nWhite, wholewheat, rye.\n(Type in your choice)\n");

  Input SandwichSauceError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour sauce options are:\nMayo, mustard, ranch.\n(Type in your choice)\n");

  Input SandwichCheeseError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour cheese options are:\nCheddar, mozerella, blue.\n(Type in your choice)\n");

  Input SandwichMeatError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour meat options are:\nTurkey, ham, bacon.\n(Type in your choice)\n");

  Input SandwichVegError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour vegetable options are:\nLettuce, pickle, or tomato.\n(Type in your choice)\n");

  //Pizza error messages
  Input PizzaVegOrMeatError = new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour options are:\n1. Veggie\n2. Meat\n");

  Input CrustTypeError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour crust type options are:\nThin, stuffed, regular.\n(Type in your choice)\n");

  Input PizzaSauceError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour sauce type options are:\nTomato, alfredo, pesto, BBQ.\n(Type in your choice)\n");

  Input PizzaCheeseError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour cheese options are:\nCheddar, mozerella, swiss.\n(Type in your choice)\n");

  Input PizzaVegError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour vegetable options are:\nBroccoli, pepper, mushroom, tomato\n(Type in your choice)\n");

  Input MeatPizzaError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour meat type options are:\nPepperoni, sausage, chicken.\n(Type in your choice)\n");

  //Pasta error messages
  Input PastaVegOrMeatError = new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour pasta options are:\n1. Veggie\n2. Meat\n");

  Input PastaSauceError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour sauce type options are:\nTomato, alfredo, spicy.\n(Type in your choice)\n");

  Input PastaMeatError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour meat type options are:\nChicken, beef, shrimp.\n(Type in your choice)\n");

  Input PastaError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nYour pasta type options are:\n Macoroni, spaghetti, fettuccine.\n(Type in your choice)\n");

  //Tip error messages
  Input TipError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\n1. Leave a Tip\n2. Do Not Leave a Tip\n");

  Input TipPercentError =  new Input(colours.RED_BOLD_UNDERLINED + "Uh-oh, looks like something went wrong." + colours.TEXT_RESET + "\nEnter the percentage in order to tip. For example 10% would be inputted as" + colours.GREEN_BOLD_BRIGHT + " '10'" + colours.TEXT_RESET + ".\n");
}