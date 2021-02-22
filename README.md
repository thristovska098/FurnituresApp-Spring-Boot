# FurnituresApp 


## Description

This application accepts data in JSON format with the following 
structure: 

furniture type, wood kilograms, glass kilograms, plastic kilograms

Ex. {"type": "chair",
"wood": 8,
"glass": 23,
"plastic": 1}

The furniture type can be cupboard, table or chair. 

The cupboard must be manufactured only from wood, The chair must be manufactured only from wood and glass, and the table must be manufactured with wood, glass and plastic. 

The application calculates the cost of each furniture object from the JSON object and returns which type of furniture is the most expensive type.

The invalid objects are ignored.

## Demo
After the start of the application, the application will listen on port 8080.

HTTP POST localhost:8080/api

Payload JSON Body

"furnitures": [

		{
			"type": "chair",
			"wood": 18
		},

		{
			"type": "chair",
			"wood": 18,
			"glass": 4
		},

		{
			"type": "table",
			"wood": 3,
			"glass": 2,
			"plastic": 4
		},
		{
			"type": "cupboard",
			"wood": 1
		},
		{
			"type": "chair",
			"wood": 6,
			"glass": 4
		},
		{
			"type": "table",
			"wood": 3,
			"glass": 3,
			"plastic": 2
		}
	]
}


## Built with

-Spring Boot

-Maven 



