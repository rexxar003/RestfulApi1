# Contact API Spec

## Create Contact

Endpoint : POST /api/contacts

Request Header : 

- API-KEY-TOKEN : Token (Mandatory)

Request Body :

    {
        "firstName":"Kanza",
        "lastName":"Az Zahrawani",
        "email":"kanza@gmail.com",
        "phone":"085161292809"
    }

Response Body (Succes) :

    {
        "data":{
            "id":"random string",
            "firstName":"Kanza",
            "lastName":"Az Zahrawani",
            "email":"kanza@gmail.com",
            "phone":"085161292809"
        }
    }

Response Body (Failed) :

    {
        "errors":"Email/phone format invalid, ..."
    }

## Update Contact
Endpoint : PUT /api/contacs/{idContact}

Request Header : 

- API-KEY-TOKEN : Token (Mandatory)

Request Body :

    {
        "firstName":"Kanza",
        "lastName":"Az Zahrawani",
        "email":"kanza@gmail.com",
        "phone":"085161292809"
    }

Response Body (Succes) :

    {
        "data":{
            "id":"random string",
            "firstName":"Kanza",
            "lastName":"Az Zahrawani",
            "email":"kanza@gmail.com",
            "phone":"085161292809"
        }
    }

Response Body (Failed) :

    {
        "errors":"Email/phone format invalid, ..."
    }

## Get Contact
Endpoint : GET /api/contact/{idContact}

Request Header : 

- API-KEY-TOKEN : Token (Mandatory)

Response Body (Succes) :

    {
        "data":{
            "id":"random string",
            "firstName":"Kanza",
            "lastName":"Az Zahrawani",
            "email":"kanza@gmail.com",
            "phone":"085161292809"
        }
    }

Response Body (Failed, 404) :

    {
        "errors":"Contact is not found"
    }


## Search Contact
Endpoint : GET /api/contacts

query param : 

- name : String, contact firstName or lastName, using like query,optional
- phone : Stirng, contact phone, using like query
- email : Sting, contact email, using like query, optional
- page : Integer, start from 0
- size : Integer, default 10 



Request Header : 

- API-KEY-TOKEN : Token (Mandatory)


Response Body (Succes) :

    {
        "data" : [
            {
            "id":"random string",
            "firstName":"Kanza",
            "lastName":"Az Zahrawani",
            "email":"kanza@gmail.com",
            "phone":"085161292809"
            }
        ],
        "paging" : {
            "currentPage":0,
            "totalPage": 10,
            "size" : 10 
        }
    }

Response Body (Failed) :
    {
        "error":"Unauthorized"
    }

## Remove Contact
Endpoint : DELETE /api/contacts/{idContact}

Request Header : 

- API-KEY-TOKEN : Token (Mandatory)


Response Body (Succes) :

    {
        "data":"OK"
    }

Response Body (Failed) :

    {
        "errors":"Contact is not found"
    }
