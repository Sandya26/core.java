class Supermarket
{
	public static String[] searchBrandByProduct(String productName)
	{
		if(productName=="brands")
		{
			String brandsBrands[]={"Parle-G","Britannia Marie Gold","Bourbon","Oreo","Digestive","Britannia Tiger",
			"Marie","Rich Tea","Oreo","Bourbon","Custard Cream","Sunfeast Dark Fantasy","Nutri-Choice","Ragi Cookies",
			"Sunfeast","Anmol","Patanjali","Krackjack","Jim Jam","Hide and Seek","Monaco","Priya Gold","20-20 biscuit",
			"Mango Bite","Googly","Rich Marie","Sugar free Marie","Petit Beurre","The Top","Top Peppy"};
			return brandsBrands;
		}
		if(productName=="shampoo")
		{
			String shampooBrands[]={"Dove","L'Oreal Paris","Tresemme","Pantene","Head & Sholders","Clinic Plus","Sunsilk",
			"Beauty Cave Cosmetics","Good Vibes","Mamaearth","Wow Skin Science","Biotique Advanced Ayurveda","VLCC Natureal Science",
			"Tresemme","Dove","Head & Shoulders","Lotus","Pantene","Nexxus","Frizz Ease","Caviar","Meera","Ayush","Vatika","Nyle",
			"Fructis","Naturali","CeraVe","Oompo beauty","Amika"};
			return shampooBrands;
		}
		if(productName=="soap")
		{
			String soapBrands[]={"Medimix","Dove","Pears","Mysore Sandal","Santoor","Chandrika Ayurvedic","Godrej No. 1","Dettol","Cinthol",
			"Lifebuoy","Margo","Kimirica","Areev","SoapNest","Lux","Chandrika","Lifeboy","Bella Vita","Neem","Vivel","Park Avenue",
			"Rexona","Fiama","Savlon","Dabur Gulabari","Dermatouch","Nat Habit","Palmolive","Yardley","JO Lime Fresh Soap"};
			return  soapBrands;
		}
		if(productName=="paste")
		{
			String pasteBrands[]={"Sensodyne","Colgate","Himalaya","Patanjali Dant Kanti","Neem","Dabur Red Paste","Vicco","CloseUp",
			"Pepsodent","White Plus","Fresh gel","Colgate active Salt","Medi plus","Colgate herbal","Meril baby","Kodomo","Meswak",
			"Clove Revive Toothpaste","SHY-NM","Dabur Dabur Rakshak","Colgate Charcol Clean","Sensora","Parodontax","Vantej","Perfora",
			"Paradontax","Jagat Devsutra","Dente91","Curaprox","Elsenz"};
			return pasteBrands;
		}
		if(productName=="bakeryItems")
		{
			String bakeryItemsBrands[]={"Bread","Baguettes","Cupcake","Toast","Sandwich","Biscuits","Cookies","Croissant","Bagel",
			"Roll","Pie","Pretzel","Pancakes","Cake","Doughnuts","Crackers","Cake Rusk","Buns","Pastry","Muffin","Vegetable Puffs",
			"Patties","HotDog","Pudding","Pizza Base","Cream Roll","Sourdough Bread","Mixed Grain","Brown Bread","Milk Bread"};
			return bakeryItemsBrands;
		}
		if(productName=="fruit")
		{
			String fruitBrands[]={"Apples","Bananas","Oranges","Grapes","Strawberries","Pineapple","Watermelon","Limes",
			"Blueberries","Cantaloupe","Lemons","Peaches","Rashberries","Honeydew","Plums","Lychee","Cherries","Mangooes",
			"Pears","Kiwi","Avacados","Corn","Pomegranate","Gooseberry","Dragon fruit"};
			return fruitBrands;
		}
		if(productName=="vegetables")
		{
			String vegetableBrands[]={"Spinanch","Kale","Bell peppers","Onions","Garlic","Potatoes","Sweet Potatoes","Zucchini",
			"Eggplant","Mushrooms","Green beans","Peas","Corn","Asparagus","Avocados","Cabbage","Celery","Raddish",
			"Beers","Turnips","Spinach Bunch","Tomoato Roma","Squash","Okra","Pumpkin","Eggplant","Beets",
			"White Potatoes","Bell Peppers","Jalapenos"};
			return vegetableBrands;
		}
		if(productName=="dairyProducts")
		{
			String dairyProductsBrands[] = {"Milk","Curd","Yogurt","Butter","Ghee","Cheese","Paneer","Cream","Buttermilk","Flavored Milk","Milk Powder","Condensed Milk",
			"Ice Cream","Frozen Yogurt","Whipping Cream","Sour Cream","Cottage Cheese","Processed Cheese","Cheese Spread","Lassi",
			"Milk Shake","Kulfi","Skimmed Milk","Toned Milk", "Full Cream Milk","Chocolate Milk","Vanilla Yogurt",
			"Fruit Yogurt","Butter Milk","Desi Ghee"};
			return dairyProductsBrands;
		}
		if(productName=="frozenFoods")
		{
			String frozenFoodsBrands[] = {
			"Frozen Peas","Frozen Corn","Frozen Carrots","Frozen Beans", "Frozen Mixed Vegetables","Frozen Spinach","Frozen Broccoli",
			"Frozen Cauliflower","Frozen French Fries","Frozen Potato Wedges", "Frozen Nuggets","Frozen Chicken Wings","Frozen Fish Fillets",
			"Frozen Prawns","Frozen Momos","Frozen Spring Rolls", "Frozen Paratha","Frozen Naan","Frozen Pizza Base",
			"Frozen Pizza","Frozen Burger Patty","Frozen Sausages",  "Frozen Cutlets","Frozen Samosa","Frozen Pakora",
			"Frozen Idli","Frozen Dosa","Frozen Chapati",  "Frozen Garlic Bread","Frozen Desserts"};
			return frozenFoodsBrands;
		}
		if(productName=="beverages")
		{
			String beveragesBrands[] = {"Coca-Cola","Pepsi","Sprite","Fanta","Thumbs Up","7 Up","Maaza","Slice","Frooti","Appy Fizz","Mountain Dew",
			"Limca","Mirinda","Red Bull","Sting Energy Drink","Real Mixed Fruit Juice","Tropicana Orange","Minute Maid Pulpy Orange",
			"Paper Boat Aamras","Paper Boat Jaljeera","Bru Coffee","Nescafe Classic","Tata Tea Gold","Red Label Tea","Lipton Green Tea",
			"Nestea Iced Tea","Horlicks","Boost","Bournvita","Complan"};
			return beveragesBrands;
		}
		if(productName=="snacks")
		{
			String snacksBrands[] = {"Lays Classic Salted","Lays Magic Masala","Kurkure Masala Munch","Kurkure Chilli Chatka","Bingo Mad Angles",
			"Bingo Tedhe Medhe","Uncle Chips","Pringles Original","Pringles Sour Cream","Haldiram's Aloo Bhujia","Haldiram's Sev","Haldiram's Moong Dal",
			"Balaji Wafers","Too Yumm Multigrain Chips","Too Yumm Veggie Stix","Cornitos Nacho Crisps","Doritos Nacho Cheese","Cheetos Masala Balls",
			"Mad Angles Achari Masti","Peppy Tomato Discs","Britannia Little Hearts","Britannia Little Rolls","Sunfeast Yippee Noodles","Maggi 2-Minute Noodles",
			"Top Ramen Curry","Ching's Secret Manchurian","Ching's Secret Schezwan","Act II Popcorn Butter","Act II Popcorn Cheese","Garden Vada Pav Chutney"};
			return snacksBrands;
		}
		if(productName=="grains")
		{
			String grainsBrands[] = {"Basmati Rice","Sona Masoori Rice","Brown Rice","Raw Rice","Idli Rice","Wheat Grain","Whole Wheat",
			"Broken Wheat(Dalia)","Maize","Corn","Barley","Oats","Pearl Millet (Bajra)","Finger Millet (Ragi)","Sorghum (Jowar)","Foxtail Millet",
			"Little Millet","Kodo Millet","Barnyard Millet","Proso Millet","Chickpeas","Green Gram (Moong)","Black Gram (Urad)","Red Lentils (Masoor)",
			"Pigeon Pea (Toor Dal)","Bengal Gram (Chana Dal)","Kidney Beans (Rajma)","Black Eyed Peas","Soybeans","Peas"};
			return grainsBrands;
		}
		if(productName=="condiments")
		{
			String condimentsBrands[] = {
			"Salt","Sugar","Jaggery","Black Pepper","Red Chilli Powder","Turmeric Powder","Coriander Powder","Cumin Seeds","Mustard Seeds","Garam Masala",
			"Chat Masala","Sambar Powder","Rasam Powder","Vinegar","Soy Sauce","Tomato Ketchup","Chilli Sauce","Green Chilli Sauce","Mayonnaise",
			"Mustard Sauce","Pickle","Mixed Fruit Jam","Honey","Tamarind Paste","Ginger Garlic Paste","Coconut Oil","Olive Oil","Sunflower Oil","Ghee","Butter"};
			return condimentsBrands;
		}
		if(productName=="rices")
		{
			String ricesBrands[] = {"Basmati Rice","Sona Masoori Rice","Raw Rice","Boiled Rice","Brown Rice","Wheat Grain","Whole Wheat Flour","Maida","Rava (Sooji)",
			"Rice Flour","Corn","Maize Flour","Barley","Oats","Bajra","Ragi","Jowar,","Foxtail Millet","Little Millet","Kodo Millet","Barnyard Millet","Proso Millet",
			"Broken Wheat","PohaSabudana"};
			return ricesBrands;
		}
		if(productName=="pules")
		{
			String pulesBrands[] = {"Toor Dal","Moong Dal","Whole Green Gram","Urad Dal","Whole Black Gram","Masoor Dal","Chana Dal","Chickpeas","Kabuli Chana","Rajma",
			"Black Eyed Peas","Cowpeas","Soybeans","Peas","Yellow Peas","Horse Gram","Lobia","Field Beans","Lentils","Sprouts"};
			return pulesBrands;
		}
		if(productName=="OilsandCookingEssentials")
		{
			String OilsandCookingEssentialsBrands[] = {"Sunflower Oil","Groundnut Oil","Coconut Oil","Olive Oil","Mustard Oil","Rice Bran Oil","Sesame Oil","Butter Oil","Cooking Spray",
			"Cooking Spray","Ghee Oil","Baking Soda","Baking Powder","Yeast","Corn Flour","Custard Powder"};
			return OilsandCookingEssentialsBrands;
		}
		if(productName=="householdsandMuiscs")
		{
			String householdsandMuiscsBrands[]={"Detergent Powder","Dish Wash Liquid","Dish Wash Bar","Floor Cleaner","Hand Wash","Soap","Shampoo","Toothpaste","Toothbrush",
			"Paper Towels","Tissues","Aluminium Fo","Cooking Spray Cling Wra","o78Garbage Bags"};
			return householdsandMuiscsBrands;
		}
		if(productName=="Meats")
		{
			String MeatsBrands[]={"Chicken","Mutton","Fish","Prawns","Crab","Eggs","Chicken Sausage","Chicken Nuggets","Fish Fingers","Minced Meat","Chicken Wings","Chicken Breast",
			"Chicken Liver","Chicken Curry Cut","Fish Curry Cut","Dry Fish","Smoked Fish","Frozen Chicken","Frozen Fish","Chicken Meatballs","Mutton Keema",
		"Turkey","Duck Meat","Quail Eggs","Sausage Links"};
		return MeatsBrands;
		}
		if(productName=="pulsesandLentils")
		{
			String pulsesandLentilsBrands[] = {
			"Toor Dal","Moong Dal","Whole Green Gram","Urad Dal","Whole Black Gram","Masoor Dal","Chana Dal","Chickpeas","Kabuli Chana","Rajma","Black Eyed Peas","Cowpeas",
			"Soybeans","Peas","Yellow Peas","Horse Gram","Field Beans","Lobia","Lentils","Sprouts"};
			return pulsesandLentilsBrands;
		}
		if(productName=="OilsandAssentils")
		{
			String OilsandAssentilsBrands[] = {
			"Sunflower Oil","Groundnut Oil","Coconut Oil","Olive Oil","Mustard Oil","Rice Bran Oil","Sesame Oil","Baking Soda","Baking Powder","Yeast","Corn Starch",
			"Custard Powder","Cooking Spray","Ghee Oil","Butter Oil"};
			return OilsandAssentilsBrands;
		}
		if(productName=="SweetsanddryFruits")
		{
			String SweetsanddryFruitsBrands[] = {"Chocolate Bar","Dark Chocolate","Milk Chocolate","Candy","ToffeeAlmonds","Cashews","Raisins","Pistachios","Walnuts","Peanuts",
			"Dates","Figs","Fox Nuts","Mixed Nuts"};
			return SweetsanddryFruitsBrands;
		}
		if(productName=="householdItems")
		{
			String householdItemsBrands[] = {"Surf Excel","Ariel","Tide","Rin","Wheel","Vim","Pril","Giffy","Exo","Scrub Pad","Harpic","Lizol","Phenyl","Domex","Colin",
			"Dettol Liquid","Dettol Soap","Lifebuoy Soap","Lux Soap","Pears Soap","Scotch Brite","Mop Stick","Floor Cleaner","Toilet Cleaner","Room Freshener",
			"Garbage Bags","Aluminium Foil","Plastic Wrap","Napkins","Tissue Paper"};
			return householdItemsBrands;
		}
		if(productName=="flourBrands")
		{
			String flourBrandsBrands[] = {"Aashirvaad Atta","Pillsbury Atta","Fortune Chakki Fresh","Annapurna Atta","Patanjali Atta","Nature Fresh Atta","Sujata Chakki Atta",
			"24 Mantra Organic Atta","Organic Tattva Atta","BB Royal Atta","Ashirwad Multigrain Atta","Pillsbury Multigrain","Fortune Multigrain Atta","Annapurna Multigrain",
			"Patanjali Whole Wheat Atta","Aashirvaad Select Atta","Aashirvaad Sharbati Atta","Sharbati Gold Atta","Elite Chakki Atta","Lion Chakki Atta",
			"Rajdhani Chakki Atta","Shree Akshara Atta","Vikram Chakki Atta","Manna Atta","Gramiyum Atta","Just Organik Atta","Safe Harvest Atta","Pro Nature Atta",
			"True Elements Atta","Organic India Atta"};
			return flourBrandsBrands;
		}
		if(productName=="n4s")
		{
			String n4sBrands[] = {
			"Aashirvaad Atta","Pillsbury Atta","Fortune Chakki Fresh","Annapurna Atta","Patanjali Atta",
			"Nature Fresh Atta","Sujata Chakki Atta","24 Mantra Organic Atta","Organic Tattva Atta","BB Royal Atta",
			"Ashirwad Multigrain Atta","Pillsbury Multigrain","Fortune Multigrain Atta","Annapurna Multigrain",
			"Patanjali Whole Wheat Atta","Aashirvaad Select Atta","Aashirvaad Sharbati Atta","Sharbati Gold Atta",
			"Elite Chakki Atta","Lion Chakki Atta",
			"Rajdhani Chakki Atta","Shree Akshara Atta","Vikram Chakki Atta","Manna Atta","Gramiyum Atta",
			"Just Organik Atta","Safe Harvest Atta","Pro Nature Atta","True Elements Atta","Organic India Atta"};
			return n4sBrands;
		}
		if(productName=="personalCare")
		{
			String personalCareBrands[] = {
			"Dove Soap","Lux Soap","Pears Soap","Lifebuoy Soap","Dettol Soap",
			"Nivea Body Lotion","Vaseline Body Lotion","Ponds Cold Cream","Johnson Baby Lotion","Himalaya Baby Lotion",
			"Clinic Plus Shampoo","Head & Shoulders Shampoo","Dove Shampoo","Pantene Shampoo","Sunsilk Shampoo",
			"Nivea Deodorant","Engage Deodorant","Fogg Deodorant","Park Avenue Deodorant","Axe Deodorant",
			"Gillette Shaving Cream","Park Avenue Shaving Cream","Old Spice After Shave","Nivea After Shave","Bombay Shaving Company Cream",
			"Lakme Face Wash","Garnier Face Wash","Himalaya Face Wash","Clean & Clear Face Wash","Ponds Face Wash"};
			return personalCareBrands;
		}
		if(productName=="cleaningProduct")
		{
			String cleaningProductBrands[] = {
			"Surf Excel","Ariel","Tide","Rin","Wheel",
			"Vim Dishwash Gel","Pril Dishwash Liquid","Exo Dishwash Bar","Giffy Dishwash Gel","Scotch Brite Scrub",
			"Harpic Toilet Cleaner","Domex Toilet Cleaner","Lizol Floor Cleaner","Dettol Floor Cleaner","Phenyl",
			"Colin Glass Cleaner","Mr Muscle Surface Cleaner","Cif Cream Cleaner","Vanish Stain Remover","Comfort Fabric Conditioner",
			"Good Knight Liquid","All Out Liquid","Hit Insect Killer","Mortein Spray","Maxo Coil",
			"Odonil Air Freshener","Godrej Aer","Ambi Pur","Room Freshener Spray","Garbage Bags"};
			return cleaningProductBrands;
		}
		if(productName=="poojaPower")
		{
			String poojaPowerBrands[] = {
			"Agarbatti","Dhoop Sticks","Dhoop Cones","Sambrani Cups","Sambrani Powder",
			"Camphor","Kapoor Tablets","Ghee Diya","Oil Diya","Brass Diya",
			"Cotton Wicks","Pooja Oil","Sesame Oil","Cow Ghee","Panchamrit",
			"Kumkum","Vibhuti","Chandan Powder","Chandan Sticks","Turmeric Powder",
			"Betel Leaves","Betel Nuts","Incense Burner","Pooja Thali","Bell",
			"Kalash","Rangoli Powder","Flower Garland","Coconut","Pooja Matchbox"};
			return poojaPowerBrands;
		}
		if(productName=="spice")
		{
			String spiceBrands[] = {"MDH","Everest","Catch","Badshah","Ramdev",
			"Eastern","Suhana","MTR","Aachi","Sakthi",
			"Keya","Goldiee","Pushp","Zoff","Patanjali",
			"Organic Tattva","24 Mantra","Tata Sampann","Snapin","Natureland",
			"Lion","Suruchi","Priya","Annai Arasi","GRB",
			"JK Masale","Saffola Masala","Vahdam","Urban Platter","Conscious Food"
			};
			return spiceBrands;
		}
		if(productName=="sweet")
		{
			String sweetBrands[] = {
			"Haldiram's","Bikanervala","Bikaji","Mithaiwala","KC Das",
			"Ganguram","Chitale Bandhu","Prakash Sweets","Sri Krishna Sweets","Anand Sweets",
			"Kanti Sweets","Pulla Reddy","Agrawal Sweets","Rawat Mishtan Bhandar","Brijnandan",
			"Gopal Sweets","Kanwarji's","Nathu's","Evergreen Sweets","Heera Sweets",
			"Monginis","Britannia Little Hearts","Cadbury Dairy Milk","Nestle Munch","Ferrero Rocher",
			"Rasiklal M Dhariwal","Gits Sweets","Haldiram Soan Papdi","Bikano Rasgulla","Patanjali Sweets"
			};
			return sweetBrands;
		}
		if(productName=="dryFruit")
		{
			String dryFruitBrands[] = {
			"Happilo","Nutraj","Farmley","Rostaa","True Elements",
			"Vedaka","Solimo","Tata Sampann","Organic Tattva","24 Mantra",
			"Urban Platter","Nutty Gritties","Wonderland","Lion Dates","Del Monte",
			"BB Royal","Max Protein","Natureland","Conscious Food","GoodDiet",
			"Flyberry","Open Secret","Orchard Lane","Nature Vit","Sattviko",
			"Ambrosia","Patanjali","Dhampure","Dry Fruit Hub","Royal Dry Fruits"
			};
			return dryFruitBrands;
		}
		if(productName=="masala")
		{
			String masalaBrands[] = {
			"MDH","Everest","Catch","Badshah","Ramdev",
			"Eastern","Suhana","MTR","Aachi","Sakthi",
			"Keya","Goldiee","Pushp","Zoff","Patanjali",
			"Organic Tattva","24 Mantra","Tata Sampann","Snapin","Natureland",
			"Lion","Suruchi","Priya","Annai Arasi","GRB",
			"JK Masale","Vahdam","Urban Platter","Conscious Food","BB Royal"
			};
			return masalaBrands;
		}
		if(productName=="accompaniment")
		{
			String accompanimentBrands[] = {
			"Maggi","Kissan","Veeba","Del Monte","Heinz",
			"Mother's Recipe","Priya","Patanjali","Ching's Secret","Knorr",
			"Smith & Jones","Keya","Urban Platter","Wingreens","Tops",
			"Sundrop","Veeram","Gits","MTR","Aachi",
			"Sakthi","Eastern","Bedekar","Nilon's","Bikaji",
			"Haldiram's","Lijjat","Golden Crown","Double Horse","Annapurna"
			};
			return accompanimentBrands;
		}
		if(productName=="ghee")
		{
			String gheeBrands[] = {
			"Amul","Nandini","Aashirvaad","Mother Dairy","Patanjali",
			"Ananda","Gowardhan","Vita","Sagar","Paras",
			"Britannia","Verka","Arokya","Milky Mist","Sri Sri Tattva",
			"Vedic Ghee","Organic India","24 Mantra","Country Delight","Gir Organic",
			"Kapiva","Baidyanath","Dabur","Natureland","Conscious Food",
			"Jivika","Jiva Ayurveda","Vedika Organics","Humpy Farms","Just Organik"
			};
			return gheeBrands;
		}
		if(productName=="milk")
		{
			String milkBrands[] = {
			"Amul","Nandini","Mother Dairy","Aavin","Vita",
			"Verka","Milma","Saras","Parag","Gokul",
			"Arokya","Heritage","Hatsun","Jersey","Dodla",
			"Ananda","Country Delight","Patanjali","Britannia","Nestle",
			"Akshayakalpa","Govardhan","VRS","Tirumala","Reliance Smart",
			"Fresh & Honest","Milky Mist","Namaste India","Big Basket","BB Royal"
			};
			return milkBrands;
		}
		if(productName=="groundnuts")
		{
			String groundnutsBrands[] = {
			"Haldiram's","Bikaji","Bikano","Balaji",
			"MTR","Aachi","Sakthi","Annapurna",
			"BB Royal","24 Mantra","Organic Tattva",
			"Natureland","Conscious Food","Just Organik",
			"Urban Platter","Farmley","Rostaa","Nutraj",
			"Happilo","Vedaka","Solimo","Lion",
			"Suruchi","Patanjali","Keya",
			"Eastern","Double Horse","Priya",
			"Gits","Tata Sampann"
			};
			return groundnutsBrands;
		}
		if(productName=="groundnutss")
		{
			String groundnutssBrands[] = {
			"Haldiram's","Bikaji","Bikano","Balaji",
			"MTR","Aachi","Sakthi","Annapurna",
			"BB Royal","24 Mantra","Organic Tattva",
			"Natureland","Conscious Food","Just Organik",
			"Urban Platter","Farmley","Rostaa","Nutraj",
			"Happilo","Vedaka","Solimo","Lion",
			"Suruchi","Patanjali","Keya",
			"Eastern","Double Horse","Priya",
			"Gits","Tata Sampann"
			};
			return groundnutssBrands;
		}
		if(productName=="frozenFood")
		{
			String frozenFoodBrands[] = {
			"McCain","ITC Master Chef","Yummiez","Godrej Yummiez","Safal",
			"Amul","Mother Dairy","Al Kabeer","Sumeru","Venky's",
			"Prasuma","Meatzza","ID Fresh Frozen","Keventer","MTR Frozen",
			"Haldiram's Frozen","Bikaji Frozen","Everest Frozen","Gits Frozen","Sakthi Frozen",
			"Eastern Frozen","Aachi Frozen","Licious Frozen","FreshToHome","BigBasket Fresho",
			"BB Royal Frozen","Reliance Smart Frozen","Catch Frozen","Tata Sampann Frozen","Patanjali Frozen"
			};
			return frozenFoodBrands;
		}
		if(productName=="powder")
		{
			String powderBrands[] = {
			"Horlicks","Bournvita","Boost","Complan","Ensure",
			"PediaSure","Milo","Tang","Glucon-D","Enerzal",
			"Nestle Everyday","Amulya","Nescafe","Bru","Bru Green Label",
			"Tata Tea Masala Chai","Girnar Tea","Vahdam","Wagh Bakri Instant",
			"MTR Rasam Powder","Aachi Idli Podi","Sakthi Chutney Powder",
			"Eastern Sambar Powder","Everest Chaat Masala",
			"Weikfield Custard Powder","Brown & Polson Cornflour",
			"Patanjali Haldi Powder","24 Mantra Ragi Malt","Organic Tattva Wheat Grass"
			};
			return powderBrands;
		}
		if(productName=="babyPowder")
		{
			String babyPowderBrands[] = {
			"Johnson's Baby","Himalaya Baby","Mamaearth","Chicco","Sebamed",
			"Mee Mee","Mothercare","Pigeon","Dabur Baby","Lotus Baby+",
			"Tedibar","Sebamed Baby","Baby Dove","Johnson's Cornstarch",
			"Himalaya Gentle Baby","Patanjali Shishu Care","Little's",
			"Mee Mee Natural","Earthbaby","Sebamed Extra Soft",
			"Baby Forest","Rustic Art","Softsens","Mom & World",
			"The Moms Co.","Mamaearth Milky Soft","Chicco Talcum",
			"Johnson's Blossom","Dabur Lal Tail Powder","Himalaya Refreshing Baby"
			};
			return babyPowderBrands;
		}
		if(productName=="milkshake")
		{
			String milkshakeBrands[] = {
			"Cavin's","Amul Kool","Britannia Winkin' Cow","Hershey's",
			"Paper Boat","Mother Dairy","Vadilal","Havmor",
			"Kwality Walls","Nestle","Cadbury Lickables",
			"ITC Sunfeast","B Natural","Real","Tropicana",
			"Minute Maid","Keventer","Epigamia","Milky Mist",
			"Country Delight","Arokya","Heritage",
			"Jersey","Hatsun","Dodla","Verka",
			"Nandini","Patanjali","Big Basket Fresho","BB Royal"
			};
			return milkshakeBrands;
		}
		if(productName=="cashew")
		{
			String cashewBrands[] = {
			"Happilo","Nutraj","Farmley","Rostaa","Nutty Gritties",
			"Vedaka","Solimo","BB Royal","24 Mantra","Organic Tattva",
			"Urban Platter","Natureland","Conscious Food","Just Organik",
			"Lion","Suruchi","Keya","Patanjali","Tata Sampann",
			"Wonderland","Flyberry","Open Secret","True Elements",
			"Ambrosia","Orchard Lane","Nature Vit","GoodDiet",
			"Royal Dry Fruits","Dry Fruit Hub","Karmiq"
			};
			return cashewBrands;
		}
		if(productName=="playingItem")
		{
			String playingItemBrands[] = {
			"Lego","Hot Wheels","Barbie","Nerf","Fisher-Price",
			"Mattel","Hasbro","Funskool","Hamleys","Toyzone",
			"Play-Doh","Marvel Toys","Disney Toys","Chicco Toys",
			"VTech","Little Tikes","Frank","Skillmatics","Smartivity",
			"Webby","Ratnas","Mitashi","Imagimake","Playgro",
			"R for Rabbit","Mee Mee Toys","Babyhug","FirstCry",
			"Decathlon","Cosco","SG","SS","Yonex"
			};
			return playingItemBrands;
		}
		if(productName=="childrenReadingBooks")
		{
			String childrenReadingBooksBrands[] = {
			"Amar Chitra Katha","Puffin","Scholastic","Ladybird","Usborne",
			"DK Children","Oxford Children","Cambridge Young Readers","Pearson Kids",
			"Pratham Books","Tulika Publishers","Karadi Tales","Katha",
			"National Book Trust","NBT India","Tarang Books","Navneet",
			"Ratna Sagar","Orient BlackSwan","Macmillan Children",
			"HarperCollins Children","Penguin Young Readers","Campbell Books",
			"Walker Books","Egmont","Hachette Children","Simon & Schuster Kids",
			"Random House Children","Disney Press","Marvel Press"
			};
			return childrenReadingBooksBrands;
		}
		if(productName=="childrenItems")
		{
			String childrenItemsBrands[] = {
			"Johnson's Baby","Himalaya Baby","Mamaearth Baby","Dabur Baby",
			"Chicco","Mee Mee","Mothercare","Pigeon","Baby Dove",
			"Sebamed Baby","Tedibar","Softsens","Little's","Babyhug",
			"FirstCry","R for Rabbit","LuvLap","Farlin",
			"Funskool","Hamleys","Lego","Barbie","Hot Wheels",
			"Fisher-Price","Mattel","Hasbro","Play-Doh",
			"Pampers","Huggies","MamyPoko","Supples","Patanjali Shishu Care"
			};
			return childrenItemsBrands;
		}
		if(productName=="childrenPowder")
		{
			String childrenPowderBrands[] = {
			"Johnson's Baby","Himalaya Baby","Mamaearth","Dabur Baby",
			"Chicco","Mee Mee","Sebamed Baby","Baby Dove",
			"Tedibar","Softsens","Little's","Patanjali Shishu Care",
			"Mothercare","Pigeon","Earthbaby","Baby Forest",
			"Rustic Art","Mom & World","The Moms Co.",
			"Johnson's Cornstarch","Himalaya Gentle Baby",
			"Mee Mee Natural","Chicco Talcum","Sebamed Extra Soft",
			"Lotus Baby+","Dabur Lal Tail Powder",
			"Mamaearth Milky Soft","Himalaya Refreshing Baby",
			"Softsens Baby","Babyhug"
			};
			return childrenPowderBrands;
		}
		if(productName=="drawingItems")
		{
			String drawingItemsBrands[] = {
			"Camel","Faber-Castell","DOMS","Apsara","Classmate",
			"Reynolds","Luxor","Staedtler","Crayola","Brustro",
			"Kokuyo Camlin","Pentel","Maped","Pilot","Sakura",
			"Winsor & Newton","Artline","Sharpie","Mont Marte","Ohuhu",
			"Pidilite","Fevicryl","Fevicol","Bianyo","Derwent",
			"Canson","Strathmore","Scholar","Navneet","ITC Classmate"
			};
			return drawingItemsBrands;
		}
		if(productName=="drawingUtilities")
		{
			String drawingUtilitiesBrands[] = {
			"Pencils","Erasers","Sharpeners","Crayons","Color Pencils",
			"Sketch Pens","Oil Pastels","Water Colors","Poster Colors","Acrylic Colors",
			"Paint Brushes","Canvas Boards","Drawing Sheets","Sketch Books","Chart Papers",
			"Rulers","Scales","Compasses","Protractors","Stencils",
			"Palette","Palette Knife","Apron","Drawing Board","Clip Board",
			"Glue","Fevicol","Fevistik","Tape","Scissors"
			};
			return drawingUtilitiesBrands;
		}
		if(productName=="dailyUtilities")
		{
			String dailyUtilitiesBrands[] = {
			"Soap","Shampoo","Conditioner","Toothpaste","Toothbrush",
			"Bathing Bar","Handwash","Face Wash","Face Cream","Body Lotion",
			"Hair Oil","Hair Gel","Deodorant","Perfume","Talcum Powder",
			"Detergent Powder","Detergent Liquid","Dishwash Bar","Dishwash Liquid","Scrubber",
			"Floor Cleaner","Toilet Cleaner","Phenyl","Room Freshener","Mosquito Repellent",
			"Sanitary Pads","Tissues","Wet Wipes","Cotton Buds","Cotton Rolls"
			};
			return dailyUtilitiesBrands;
		}
		if(productName=="faceWash")
		{
			String faceWashBrands[] = {
			"Himalaya","Garnier","Nivea","Pond's","Clean & Clear",
			"Cetaphil","Simple","Neutrogena","WOW","Mamaearth",
			"Biotique","Plum","The Face Shop","Lakme","Lotus Herbals",
			"Minimalist","Re'equil","Dot & Key","Aroma Magic","Khadi Natural",
			"Ayush","Patanjali","Forest Essentials","Derma Co",
			"Good Vibes","MCaffeine","Beardo","Ustraa",
			"Vaseline","Sebamed"
			};
			return faceWashBrands;
		}
		if(productName=="faceCream")
		{
			String faceCreamBrands[] = {
			"Pond's","Nivea","Lakme","Fair & Lovely","Olay",
			"Garnier","L'Oreal","Himalaya","Lotus Herbals","Biotique",
			"Mamaearth","WOW","Plum","Minimalist","Dot & Key",
			"Neutrogena","Cetaphil","Simple","The Face Shop","Forest Essentials",
			"Khadi Natural","Aroma Magic","Ayush","Patanjali","Vaseline",
			"MCaffeine","Good Vibes","Re'equil","The Derma Co","Sebamed"
			};
			return faceCreamBrands;
		}
		if(productName=="lipBalm")
		{
			String lipBalmBrands[] = {
			"Nivea","Vaseline","Maybelline","Baby Lips","Himalaya",
			"Biotique","Lotus Herbals","Lakme","Plum","Mamaearth",
			"WOW","MCaffeine","Dot & Key","Neutrogena","The Body Shop",
			"Forest Essentials","Khadi Natural","Aroma Magic","Ayush","Patanjali",
			"Sebamed","Cetaphil","Laneige","Carmex","EOS",
			"ChapStick","Burt's Bees","Palmer's","Blue Heaven","Swiss Beauty"
			};
			return lipBalmBrands;
		}
		if(productName=="kajal")
		{
			String kajalBrands[] = {
			"Lakme","Maybelline","L'Oreal","Plum","Sugar Cosmetics",
			"Faces Canada","Colorbar","Blue Heaven","Swiss Beauty","Mars",
			"Insight","Elle 18","Mamaearth","WOW","Biotique",
			"Himalaya","Lotus Herbals","Forest Essentials","Khadi Natural",
			"Kay Beauty","Nykaa","M.A.C","Huda Beauty","Fenty Beauty",
			"Bobbi Brown","Clinique","Revlon","Wet n Wild","Makeup Revolution","Pac"
			};
			return kajalBrands;
		}
		if(productName=="compact")
		{
			String compactBrands[] = {
			"Lakme","Maybelline","L'Oreal","Faces Canada","Colorbar",
			"Revlon","Blue Heaven","Swiss Beauty","Mars","Insight",
			"Sugar Cosmetics","Plum","Mamaearth","WOW","Biotique",
			"Pond's","Lotus Herbals","Himalaya","Elle 18","Miss Claire",
			"Nykaa","Kay Beauty","M.A.C","Huda Beauty","Fenty Beauty",
			"Bobbi Brown","Clinique","Wet n Wild","Makeup Revolution","Pac"
			};
			return compactBrands;
		}
		if(productName=="mascara")
		{
			String mascaraBrands[] = {
			"Maybelline","Lakme","L'Oreal","Colorbar","Faces Canada",
			"Sugar Cosmetics","Plum","Blue Heaven","Swiss Beauty","Mars",
			"Insight","Elle 18","Mamaearth","WOW","Biotique",
			"Lotus Herbals","Himalaya","Kay Beauty","Nykaa","M.A.C",
			"Huda Beauty","Fenty Beauty","Bobbi Brown","Clinique","Revlon",
			"Wet n Wild","Makeup Revolution","Pac","Essence","Benefit"
			};
			return mascaraBrands;
		}
		if(productName=="iceCream")
		{
			String iceCreamBrands[] = {
			"Amul","Kwality Walls","Mother Dairy","Vadilal","Havmor",
			"Arun Icecreams","Naturals Ice Cream","Baskin Robbins","London Dairy","NIC Ice Creams",
			"Cream Bell","Dairy Day","Ibaco","Gelato Vinto","Haagen-Dazs",
			"Ben & Jerry's","Polar Bear","Dinshaw's","Top 'N Town","Rollick",
			"Milky Mist","Apsara Ice Creams","Tender Coconut Ice Cream","Giani's",
			"Corner House","Pabrai's Fresh & Naturelle","Cold Stone Creamery",
			"Hocco","Minus 30","Grameen Kulfi"
			};
			return iceCreamBrands;
		}
		if(productName=="juice")
		{
			String juiceBrands[] = {
			"Real","Tropicana","Minute Maid","B Natural","Paper Boat",
			"Frooti","Maaza","Slice","Appy","Appy Fizz",
			"Del Monte","Safal","Dabur Real Activ","Patanjali",
			"24 Mantra","Organic India","Vita Coco","Raw Pressery",
			"Coldpress","Kapiva","Vedica","Jus Amazin",
			"Ceres","Rauch","Ocean Spray","Welch's",
			"Happy Day","Simply Orange","Uncle Matt's",
			"Big Basket Fresho"
			};
			return juiceBrands;
		}
		if(productName=="faceCreams")
		{
			String faceCreams[] = {
			"Pond's","Nivea","Lakme","Olay","Garnier",
			"L'Oreal","Himalaya","Lotus Herbals","Biotique","Mamaearth",
			"Plum","WOW","Minimalist","Dot & Key","Neutrogena",
			"Cetaphil","Simple","The Face Shop","Forest Essentials","Khadi Natural",
			"Ayush","Patanjali","Vaseline","MCaffeine","Good Vibes",
			"Re'equil","The Derma Co","Sebamed","Clinique","Bobbi Brown"
			};
			return faceCreams;
		}
		if(productName=="hairWash")
		{
			String hairWashBrands[] = {
			"Head & Shoulders","Dove","Pantene","Clinic Plus","Sunsilk",
			"Tresemme","L'Oreal","Garnier","Himalaya","WOW",
			"Mamaearth","Biotique","Khadi Natural","Patanjali","Ayush",
			"Meera","Chik","Indulekha","Sebamed","Re'equil",
			"Matrix","Schwarzkopf","Moroccanoil","OGX","Kerastase",
			"Vaseline","Nyle","Herbal Essences","Bare Anatomy","Plum"
				};
			return hairWashBrands;
		}
		if(productName=="chips")
		{
			String chipsBrands[] = {
			"Lays","Bingo","Kurkure","Uncle Chipps","Balaji",
			"Haldiram's","Bikaji","Pringles","Too Yumm","Doritos",
			"Cornitos","Crax","TakaTak","Mad Angles","Peppy",
			"Ruffles","Sunfeast Yippee Chips","ITC Bingo Tedhe Medhe",
			"Garden","Yellow Diamond","Mr Makhana Chips","Tasties",
			"Rinbee","Goosebumps","Good Day Chips",
			"Popchips","Simply 7","Eat Real","Act II Chips","Urban Platter Chips"
			};
			return chipsBrands;
		}
		if(productName=="hairOil")
		{
			String hairOilBrands[] = {
			"Parachute","Dabur Amla","Indulekha","Bajaj Almond Drops","Navratna",
			"Kesh King","Himalaya","Patanjali","Mamaearth","WOW",
			"Biotique","Khadi Natural","Meera","Nihar","Clinic Plus",
			"Emami 7 Oils","Ayush","Indulekha Bringha","Trichup","VVD Coconut Oil",
			"Jasmine","Anmol","Mahabhringraj","Forest Essentials","Kama Ayurveda",
			"Soulflower","StBotanica","Vedix","Plum","Bare Anatomy"
			};
			return hairOilBrands;
		}
		if(productName=="cup")
		{
			String cupBrands[] = {
			"Cello","Milton","Tupperware","Signoraware","Borosil",
			"Prestige","Pigeon","Butterfly","Hawkins","Vega",
			"Lock & Lock","Wonderchef","La Opala","Corelle","Luminarc",
			"Ocean","Clay Craft","Claytan","Duralex","IKEA",
			"Decathlon","AmazonBasics","Solimo","BB Home","Home Centre",
			"Godrej Interio","Nilkamal","Cello World","Princeware","Nayasa"
			};
			return cupBrands;
		}
		if(productName=="dishwasher")
		{
			String dishwasherBrands[] = {
			"Vim","Pril","Exo","Giffy","Scrubz",
			"Axion","Saff","Xpert","Rin Dishwash","Surf Excel Dishwash",
			"Patanjali Super Dishwash","Nirma Dishwash","Wheel Dishwash",
			"Henko Dishwash","Ezee Dishwash",
			"Scotch-Brite","Colin Dishwash","Mr Muscle Dishwash",
			"Born Good","Better Life",
			"IFB Dishwash","Finish","Godrej Ezee",
			"Ariel Dishwash","Tru Earth",
			"Dettol Dishwash","Lizol Dishwash",
			"BB Royal Dishwash","AmazonBasics Dishwash","Solimo Dishwash"
			};
			return dishwasherBrands;
		}
		if(productName=="detergent")
		{
			String detergentBrands[] = {
			"Surf Excel","Ariel","Tide","Rin","Wheel",
			"Nirma","Ghadi","Fena","Henko","Ujala",
			"Santoor","Vanish","Ezee","Godrej No.1",
			"Patanjali","Reliance Smart","BB Royal","AmazonBasics","Solimo",
			"Sunlight","Xpert","Mr White","Tata Sampann Detergent",
			"Genteel","Rin Supreme","Surf Excel Easy Wash",
			"Ariel Matic","Tide Plus","Henko Matic","Ghadi Detergent"
			};
			return detergentBrands;
		}
		if(productName=="kitchenProducts")
		{
			String kitchenProductsBrands[] = {
			"Pressure Cooker","Non-Stick Pan","Tawa","Kadai","Sauce Pan",
			"Gas Stove","Induction Cooktop","Mixer Grinder","Blender","Juicer",
			"Rice Cooker","Electric Kettle","Toaster","Sandwich Maker","Microwave Oven",
			"Refrigerator","Water Purifier","Chimney","Dish Rack","Cutting Board",
			"Knife Set","Spoons","Ladles","Spatula","Peeler",
			"Grater","Rolling Pin","Chopping Knife","Storage Containers","Spice Box"
			};
			return kitchenProductsBrands;
		}
		if(productName=="kitchenAppliance")
		{
			String kitchenApplianceBrands[] = {
			"Prestige","Philips","Bajaj","Butterfly","Pigeon",
			"Hawkins","Usha","Morphy Richards","Bosch","IFB",
			"LG","Samsung","Whirlpool","Panasonic","Godrej",
			"Crompton","Kent","Aquaguard","Eureka Forbes","Havells",
			"Wonderchef","Singer","Inalsa","Maharaja Whiteline","Orient",
			"Sunflame","Lifelong","Milton","Cello","V-Guard"
			};
			return kitchenApplianceBrands;
		}
		if(productName=="kitchenUtilities")
		{
			String kitchenUtilitiesBrands[] = {
			"Knife","Chopping Board","Peeler","Grater","Ladle",
			"Spatula","Tongs","Whisk","Strainer","Sieve",
			"Measuring Cups","Measuring Spoons","Rolling Pin","Dough Kneader","Mortar & Pestle",
			"Spice Box","Storage Containers","Dish Rack","Sink Strainer","Trash Bin",
			"Paper Towel Holder","Cling Film","Aluminium Foil","Baking Tray","Oven Mitts",
			"Apron","Dish Cloth","Scrubber","Bottle Opener","Can Opener"
			};
			return kitchenUtilitiesBrands;
		}
		if(productName=="accessories")
		{
			String accessoriesBrands[] = {
            "Watch", "Sunglasses", "Belt", "Wallet", "Handbag",
            "Necklace", "Earrings", "Bracelet", "Ring", "Hair Clip",
            "Scarf", "Hat", "Gloves", "Keychain", "Tie",
            "Cufflinks", "Brooch", "Phone Case", "Backpack", "Laptop Sleeve",
            "Umbrella", "Shoelaces", "Headband", "Face Mask", "Socks",
            "Suspenders", "Anklet", "Hairband", "Beaded Bracelet", "Pocket Square"
			};
			return accessoriesBrands;
		}
		if(productName=="dailyProducts")
		{
			String dailyProductsBrands[] = {
            "Toothpaste", "Toothbrush", "Soap", "Shampoo", "Conditioner",
            "Hair Oil", "Face Wash", "Moisturizer", "Deodorant", "Perfume",
            "Hand Sanitizer", "Tissue Paper", "Sanitary Pads", "Shaving Cream", "Razor",
            "Cotton Swabs", "Cotton Pads", "Nail Cutter", "Comb", "Hair Brush",
            "Lotion", "Sunscreen", "Lip Balm", "Body Wash", "Mouthwash",
            "Laundry Detergent", "Dish Soap", "Floor Cleaner", "Air Freshener", "Insect Repellent"
			};
			return dailyProductsBrands;
		}
		if(productName=="dailyUses")
		{
			 String dailyUsesBrands[] = {
            "Toothpaste", "Toothbrush", "Soap", "Shampoo", "Conditioner",
            "Hair Oil", "Face Wash", "Moisturizer", "Deodorant", "Perfume",
            "Hand Sanitizer", "Tissue Paper", "Sanitary Pads", "Shaving Cream", "Razor",
            "Cotton Swabs", "Cotton Pads", "Nail Cutter", "Comb", "Hair Brush",
            "Lotion", "Sunscreen", "Lip Balm", "Body Wash", "Mouthwash",
            "Laundry Detergent", "Dish Soap", "Floor Cleaner", "Air Freshener", "Insect Repellent"
			};
			return dailyUsesBrands;
		}
		if(productName=="drawingSupplies")
		{
			String drawingSuppliesBrands[] = {
            "Pencil", "Eraser", "Sharpener", "Colored Pencils", "Crayons",
            "Watercolor Paints", "Acrylic Paints", "Oil Paints", "Paint Brushes", "Sketch Pens",
            "Markers", "Charcoal Sticks", "Pastels", "Drawing Paper", "Canvas",
            "Palette", "Ruler", "Compass", "Protractor", "Stencil",
            "Drawing Board", "Ink Pens", "Calligraphy Pens", "Graphite Pencils", "Blending Stumps",
            "Masking Tape", "Fixative Spray", "Paint Tray", "Palette Knife", "Apron"
			};
			return drawingSuppliesBrands;
		}
		if(productName=="tShirts")
		{
			String tShirtsBrands[] = {
            "Plain White T-Shirt", "Plain Black T-Shirt", "Graphic Tee", "Striped T-Shirt", "V-Neck T-Shirt",
            "Crew Neck T-Shirt", "Polo T-Shirt", "Long Sleeve T-Shirt", "Oversized T-Shirt", "Slim Fit T-Shirt",
            "Printed T-Shirt", "Tie-Dye T-Shirt", "Raglan T-Shirt", "Henley T-Shirt", "Pocket T-Shirt",
            "Sports T-Shirt", "Performance T-Shirt", "Cotton T-Shirt", "Linen T-Shirt", "Organic Cotton T-Shirt",
            "Sleeveless T-Shirt", "Cap Sleeve T-Shirt", "Mock Neck T-Shirt", "Ruffled T-Shirt", "Buttoned T-Shirt",
            "Color Block T-Shirt", "Embroidery T-Shirt", "Vintage T-Shirt", "Washed T-Shirt", "Cropped T-Shirt"
			};
			return tShirtsBrands;
		}
		if(productName=="steelItems")
		{
			String steelItemsBrands[] = {
            "Steel Knife", "Steel Spoon", "Steel Fork", "Steel Plate", "Steel Bowl",
            "Steel Glass", "Steel Tumbler", "Steel Tray", "Steel Ladle", "Steel Strainer",
            "Steel Pan", "Steel Kettle", "Steel Mug", "Steel Container", "Steel Water Bottle",
            "Steel Tongs", "Steel Spatula", "Steel Skimmer", "Steel Pressure Cooker", "Steel Frying Pan",
            "Steel Chopping Board", "Steel Cup", "Steel Serving Spoon", "Steel Measuring Cup", "Steel Measuring Spoon",
            "Steel Whisk", "Steel Mortar & Pestle", "Steel Grater", "Steel Dustbin", "Steel Cooking Pot"
			};

			return steelItemsBrands;
		}
		if(productName=="handbags")
		{
			String handbagsBrands[] = {
            "Tote Bag", "Shoulder Bag", "Crossbody Bag", "Satchel", "Hobo Bag",
            "Clutch", "Backpack", "Messenger Bag", "Bucket Bag", "Mini Bag",
            "Laptop Bag", "Evening Bag", "Duffel Bag", "Sling Bag", "Belt Bag",
            "Top Handle Bag", "Shopping Bag", "Beach Bag", "Cosmetic Bag", "Travel Bag",
            "Wristlet", "Drawstring Bag", "Envelope Bag", "Camera Bag", "Canteen Bag",
            "Bucket Tote", "Structured Bag", "Boho Bag", "Chain Strap Bag", "Quilted Bag"
			};

			return handbagsBrands;
		}
		if(productName=="bottles")
		{
			String bottlesBrands[] = {
            "Water Bottle", "Steel Bottle", "Plastic Bottle", "Glass Bottle", "Sports Bottle",
            "Insulated Bottle", "Travel Bottle", "Juice Bottle", "Milk Bottle", "Oil Bottle",
            "Perfume Bottle", "Spray Bottle", "Soda Bottle", "Thermal Bottle", "Flip-top Bottle",
            "Dropper Bottle", "Shaker Bottle", "Baby Bottle", "Wine Bottle", "Beer Bottle",
            "Medication Bottle", "Cosmetic Bottle", "Travel-sized Bottle", "Protein Bottle", "Reusable Bottle",
            "Collapsible Bottle", "Pump Bottle", "Infuser Bottle", "Vacuum Bottle", "Luxury Bottle"
			};

			return bottlesBrands;
		}
		if(productName=="jeans")
		{
			String jeansBrands[] = {
            "Skinny Jeans", "Slim Fit Jeans", "Regular Fit Jeans", "Straight Leg Jeans", "Bootcut Jeans",
            "Flared Jeans", "Boyfriend Jeans", "Mom Jeans", "High-Waist Jeans", "Low-Rise Jeans",
            "Distressed Jeans", "Ripped Jeans", "Stretch Jeans", "Cargo Jeans", "Denim Jeggings",
            "Wide Leg Jeans", "Cropped Jeans", "Tapered Jeans", "Vintage Jeans", "Washed Jeans",
            "Dark Wash Jeans", "Light Wash Jeans", "Black Jeans", "White Jeans", "Colored Jeans",
            "Patchwork Jeans", "Overalls Jeans", "Jogger Jeans", "Relaxed Fit Jeans", "Faded Jeans"
			};

			return jeansBrands;
		}
		if(productName=="lipsticks")
		{
			String lipsticksBrands[] = {
            "Matte Lipstick", "Glossy Lipstick", "Cream Lipstick", "Liquid Lipstick", "Satin Lipstick",
            "Sheer Lipstick", "Lip Stain", "Long-Lasting Lipstick", "Waterproof Lipstick", "Velvet Lipstick",
            "Metallic Lipstick", "Shimmer Lipstick", "Peach Lipstick", "Red Lipstick", "Pink Lipstick",
            "Nude Lipstick", "Coral Lipstick", "Berry Lipstick", "Plum Lipstick", "Brown Lipstick",
            "Orange Lipstick", "Mauve Lipstick", "Fuchsia Lipstick", "Wine Lipstick", "Cherry Lipstick",
            "Lip Crayon", "Lip Tint", "Lip Balm with Color", "Lip Gloss Stick", "Lip Pencil"
			};

			return lipsticksBrands;
		}
		if(productName=="lipBalms")
		{
			String lipBalmsBrands[] = {
            "Tinted Lip Balm", "Moisturizing Lip Balm", "Matte Lip Balm", "Glossy Lip Balm", "Sheer Lip Balm",
            "SPF Lip Balm", "Organic Lip Balm", "Medicated Lip Balm", "Lip Butter", "Lip Cream",
            "Lip Oil", "Vanilla Lip Balm", "Mint Lip Balm", "Berry Lip Balm", "Coconut Lip Balm",
            "Chocolate Lip Balm", "Honey Lip Balm", "Aloe Vera Lip Balm", "Rose Lip Balm", "Vitamin E Lip Balm",
            "Lip Tint Stick", "Hydrating Lip Balm", "Lip Balm with SPF 15", "Natural Lip Balm", "Beeswax Lip Balm",
            "Cherry Lip Balm", "Strawberry Lip Balm", "Orange Lip Balm", "Lavender Lip Balm", "Shea Butter Lip Balm"
			};

			return lipBalmsBrands;
		}
		if(productName=="perfumes")
		{
			String perfumesBrands[] = { 
			"Chanel No. 5","Dior Sauvage","Calvin Klein Eternity","Gucci Bloom","Versace Eros",
			"Armani Code","Jo Malone Peony & Blush Suede","Tom Ford Black Orchid","Yves Saint Laurent Libre",
			"Burberry Her","Marc Jacobs Daisy","Hugo Boss Bottled","Lancome La Vie Est Belle",
			"Prada Candy","Giorgio Armani Si","Dolce & Gabbana Light Blue","Creed Aventus",
			"Ralph Lauren Romance","Jean Paul Gaultier Le Male","Hermes Terre d'Hermes",
			"Viktor & Rolf Flowerbomb","Elizabeth Arden Red Door","Bvlgari Omnia","Paco Rabanne Lady Million",
			"Clinique Happy","Issey Miyake L'Eau d'Issey","Gucci Guilty","Chloe Eau de Parfum",
			"Versace Bright Crystal","Calvin Klein CK One","Tommy Hilfiger Tommy Girl","Givenchy Ange ou Demon"
			};

			return perfumesBrands;
		}
		if(productName=="slippers")
		{
			String slippersBrands[] = {
			"Adidas Slides","Nike Benassi","Puma Leadcat","Reebok Classic Slippers","Skechers Memory Foam",
			"Crocs Classic Clog","Havaianas Flip Flops","Birkenstock Arizona","Liberty Sports Slippers",
			"Bata Comfy Slippers","Relaxo Floater","Paragon Slippers","Quechua Hiking Slippers",
			"Woodland Outdoor Slippers","Fila Slides","Power Sports Slippers","Metro Casual Slippers",
			"Red Chief Leather Slippers","Hush Puppies Comfort Slippers","VKC Fancy Slippers",
			"Puma Surf Slides","Adidas Adilette","Nike Kawa Slides","Skechers Go Walk","Crocs LiteRide",
			"Bata Eva Slippers","Relaxo Rubber Slippers","Fila Rubber Slides","Liberty Trendy Slippers",
			"Woodland Trekker Slippers"
			};

			return slippersBrands;
		}
		if(productName=="shoes")
		{
			String shoesBrands[] = {
			"Nike Air Max","Adidas Ultraboost","Puma RS-X","Reebok Classic","Skechers Go Walk",
			"New Balance 990","Asics Gel-Kayano","Converse Chuck Taylor","Vans Old Skool","Jordan Air Force 1",
			"Under Armour HOVR","Fila Disruptor","Crocs LiteRide","Timberland 6-Inch Boots","Clarks Desert Boot",
			"Dr. Martens 1460","Hush Puppies Casuals","Woodland Trekker","Metro Loafers","Bata Comfy Shoes",
			"Power Running Shoes","Red Chief Leather Shoes","Fila Sport Shoes","Skechers Memory Foam","Adidas Samba",
			"Nike Cortez","Puma Suede Classic","Converse One Star","Reebok Nano","New Balance 574"
			};

			return shoesBrands;
		}
		if(productName=="bags")
		{
			String bagsBrands[] = {
			"Nike Backpack","Adidas Gym Bag","Puma Duffel Bag","Reebok Sling Bag","Herschel Little America",
			"Fossil Leather Tote","Kate Spade Satchel","Michael Kors Handbag","Coach Shoulder Bag","Gucci GG Marmont",
			"Prada Nylon Backpack","Louis Vuitton Neverfull","Timberland Hiking Backpack","Wildcraft Rucksack",
			"American Tourister Travel Bag","Samsonite Cabin Bag","Fila Sports Backpack","Woodland Sling Bag",
			"Bata Casual Bag","Tommy Hilfiger Tote","Calvin Klein Laptop Bag","Vans Old Skool Backpack",
			"Under Armour Gym Sack","Crocs Beach Bag","Fila Crossbody Bag","Nike Sports Duffel","Adidas Originals Backpack",
			"Puma Casual Tote","Hush Puppies Handbag","Metro Shoulder Bag"
		};

			return bagsBrands;
		}
		if(productName=="books")
		{
			String booksBrands[] = {
			"To Kill a Mockingbird","1984","The Great Gatsby","Pride and Prejudice","The Catcher in the Rye",
			"Harry Potter and the Sorcerer's Stone","The Hobbit","The Lord of the Rings","The Da Vinci Code",
			"The Alchemist","The Kite Runner","Animal Farm","The Chronicles of Narnia","Moby Dick",
			"War and Peace","Jane Eyre","Wuthering Heights","Little Women","The Odyssey","Brave New World",
			"Fahrenheit 451","Gone with the Wind","Crime and Punishment","The Book Thief","The Hunger Games",
			"Life of Pi","Memoirs of a Geisha","Twilight","The Girl with the Dragon Tattoo","Charlotte's Web",
			"The Shining","Angels & Demons","The Secret Garden"
			};

			return booksBrands;
		}
		if(productName=="boxes")
		{
			String boxesbrands[] = {"Cardboard Box","Plastic Storage Box","Gift Box","Jewelry Box","Shoe Box","Toy Box","Metal Box", "Wooden Box",
            "Food Storage Box","Lunch Box","Tool Box","First Aid Box","Storage Crate","Magazine Box","Document Box","Coin Box","Keepsake Box",
            "Drawer Box","Organizer Box","Shipping Box","Collapsible Box","Decorative Box", "Stackable Box","Mini Box","Storage Bin",
            "Packing Box","Letter Box","Chest Box", "Container Box","Toy Organizer Box"
			};

			return boxesbrands;
		}
		if(productName=="chairs")
		{
			String chairsBrands[] = {
            "Dining Chair","Armchair",  "Recliner Chair", "Rocking Chair", "Office Chair", "Folding Chair", "Lounge Chair", "Bar Stool", "Stackable Chair","Gaming Chair",
            "Bean Bag Chair",  "Wingback Chair", "Swivel Chair", "Adirondack Chair","Director's Chair","Accent Chair","Slipper Chair", "Chaise Lounge",
            "Massage Chair", "Patio Chair", "Conference Chair", "Task Chair","Club Chair", "Side Chair", "Desk Chair",  "Executive Chair",
            "Plastic Chair", "Wooden Chair",   "Metal Chair","Cushioned Chair"
			};

			return chairsBrands;
		}
		if(productName=="diapers")
		{
			String diapersBrands[] = {
			"Pamper Premium Care","Pamper Active Baby","Pamper Baby Dry","Huggies Wonder Pants","Huggies Dry Pants",
			"MamyPoko Pants Standard","MamyPoko Extra Absorb","Little Angel Baby Pants","Little Angel Comfort Pants","Pigeon Baby Diapers",
			"Johnson's Baby Diapers","Snuggy Baby Diapers","Teddyy Baby Easy Pants","Supples Baby Pants","Mee Mee Baby Diapers",
			"Chicco Baby Moments Diapers","Bella Baby Happy Diapers","LuvLap Baby Diapers","Soft Love Baby Diapers","Bambo Nature Baby Diapers",
			"Libero Comfort Baby Diapers","Mama Bear Baby Diapers","Little's Baby Pants","Pampers All Round Protection","Pampers Cruisers",
			"Huggies Little Movers","Huggies Snug & Dry","Babyhug Advanced Pant","Babyhug Premium Pants","Babyhug Cloth Diapers"
			};

			return diapersBrands;
		}
		if(productName=="plates")
		{
			String platesBrands[] = {
			"Steel Dinner Plate","Stainless Steel Plate","Ceramic Dinner Plate","Melamine Plate","Glass Plate",
			"Plastic Serving Plate","Disposable Paper Plate","Bone China Plate","Porcelain Dinner Plate","Wooden Plate",
			"Square Dinner Plate","Round Dinner Plate","Compartment Plate","Kids Cartoon Plate","Microwave Safe Plate",
			"Unbreakable Plate","Serving Platter","Designer Dinner Plate","Printed Plate","Eco Friendly Plate",
			"Areca Leaf Plate","Silver Coated Plate","Copper Plate","Brass Plate","Non Stick Plate",
			"Restaurant Style Plate","Buffet Plate","Snack Plate","Dessert Plate","Mini Plate"
			};

			return platesBrands;
		}
		if(productName=="bowls")
		{
			String bowlsBrands[] = {
			"Steel Bowl","Stainless Steel Bowl","Ceramic Bowl","Melamine Bowl","Glass Bowl",
			"Plastic Bowl","Soup Bowl","Rice Bowl","Serving Bowl","Mixing Bowl",
			"Salad Bowl","Dessert Bowl","Fruit Bowl","Kids Cartoon Bowl","Microwave Safe Bowl",
			"Unbreakable Bowl","Designer Bowl","Printed Bowl","Square Bowl","Round Bowl",
			"Deep Bowl","Mini Bowl","Large Serving Bowl","Snack Bowl","Ice Cream Bowl",
			"Copper Bowl","Brass Bowl","Porcelain Bowl","Bone China Bowl","Eco Friendly Bowl"
			};

			return bowlsBrands;
		}
		if(productName=="moisturizer")
		{
			String moisturizerBrands[] = {
			"Nivea Soft Cream","Nivea Creme","Vaseline Intensive Care","Pond's Light Moisturizer","Dove Deep Moisture Cream",
			"Lakme Peach Milk Moisturizer","Olay Total Effects Moisturizer","Garnier Skin Naturals Moisturizer","Himalaya Nourishing Skin Cream","Biotique Morning Nectar Moisturizer",
			"Lotus Herbals WhiteGlow Moisturizer","Mamaearth Oil Free Moisturizer","WOW Skin Science Aloe Moisturizer","Cetaphil Moisturizing Cream","Neutrogena Hydro Boost Water Gel",
			"Aveeno Daily Moisturizing Lotion","The Body Shop Vitamin E Moisturizer","Plum Green Tea Oil Free Moisturizer","Minimalist Sepicalm Moisturizer","Simple Kind To Skin Moisturizer",
			"Forest Essentials Soundarya Cream","Khadi Natural Aloe Vera Moisturizer","Vicco Turmeric Skin Cream","Emolene Moisturizing Cream","Boroline Skin Cream",
			"Fair & Lovely Moisturizer","Patanjali Saundarya Cream","Jergens Ultra Healing Moisturizer","Vaseline Aloe Fresh Lotion","Nivea Cocoa Nourish Lotion"
			};

			return moisturizerBrands;
		}
		if(productName=="pillows")
		{
			String pillowsBrands[] = {
			"Cotton Pillow","Memory Foam Pillow","Feather Pillow","Microfiber Pillow","Latex Pillow",
			"Orthopedic Pillow","Neck Support Pillow","Travel Pillow","Contour Pillow","Cooling Gel Pillow",
			"King Size Pillow","Queen Size Pillow","Standard Size Pillow","Body Pillow","Pregnancy Pillow",
			"Kids Soft Pillow","Decorative Cushion Pillow","Silk Pillow","Bamboo Fiber Pillow","Hypoallergenic Pillow",
			"Luxury Hotel Pillow","Firm Support Pillow","Soft Comfort Pillow","Adjustable Pillow","Down Alternative Pillow",
			"Polyester Fiber Pillow","Round Cushion Pillow","Square Cushion Pillow","Printed Pillow","Velvet Cushion Pillow"
			};

			return pillowsBrands;
		}
		if(productName=="earbuds")
		{
			String earbudsBrands[] = {
			"Apple AirPods","Samsung Galaxy Buds","Sony WF-1000XM4","JBL Tune 130NC","Boat Airdopes 131",
			"Realme Buds Air","OnePlus Buds Z","Noise Air Buds","Oppo Enco Buds","Skullcandy Dime Buds",
			"Anker Soundcore Life P2","Sennheiser CX True Wireless","Beats Studio Buds","Mi True Wireless Earbuds",
			"Boult Audio AirBass","Boat Airdopes 441","Noise Buds VS102","Realme Buds Q2","OnePlus Nord Buds",
			"Samsung Galaxy Buds Live","Sony WF-C500","JBL Wave 200TWS","Boat Airdopes 141","Boult Audio Z40",
			"Noise Buds X","Oppo Enco Air","Mi Redmi Earbuds S","Boat Airdopes 121v2","Realme Buds Air 3","JBL Tune 230NC"
			};

			return earbudsBrands;
		}
		if(productName=="serum")
		{
			String serumBrands[] = {
			"Lakme Absolute Argan Oil Serum","Livon Hair Serum","Streax Hair Serum","L'Oreal Paris Extraordinary Oil Serum","Matrix Biolage Smoothproof Serum",
			"Garnier Fructis Sleek & Shine Serum","TRESemme Keratin Smooth Serum","Schwarzkopf Professional Hair Serum","BBlunt Intense Moisture Hair Serum","Biotique Mountain Ebony Serum",
			"Khadi Natural Hair Serum","WOW Skin Science Onion Black Seed Oil Serum","Mamaearth Onion Hair Serum","Dove Nourishing Oil Care Serum","Pantene Pro-V Hair Serum",
			"Minimalist Vitamin C Face Serum","The Ordinary Niacinamide Serum","Plum Vitamin C Serum","Mamaearth Skin Illuminate Face Serum","Lotus Herbals WhiteGlow Serum",
			"Biotique Vitamin C Dark Spot Solution","Olay Regenerist Micro Sculpting Serum","Neutrogena Rapid Wrinkle Repair Serum","L'Oreal Paris Revitalift Serum","Garnier Bright Complete Vitamin C Serum",
			"Dot & Key Vitamin C Serum","Good Vibes Rosehip Face Serum","Pilgrim Red Vine Face Serum","Mamaearth Retinol Face Serum","WOW Skin Science Vitamin C Serum"
			};

			return serumBrands;
		}
		return null;
	}
}
		
