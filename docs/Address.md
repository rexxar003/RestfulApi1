# Address API Spec

## Create Address

Endpoint : POST /api/contacts/{idContacts}/addresses    

Request Header : 
- X-API-TOKEN : Token (Mandatory)

Request body :

    {
        "street":"jalan",
        "city":"kota",
        "province":"provinsi",
        "country":"negara",
        "postalCode":"123123"
    }

Response body (Succes) :

    {
        "data":{
            "id":"random String",
            "street":"jalan",
            "city":"kota",
            "province":"provinsi",
            "country":"negara",
            "postalCode":"123123"
        }
    }

Response body (Failed) :

    {
        "error:"Contact is not found"
    }
## Update Address
Endpoint : PUT /api/contacts/{idAddress}/adresses/{idAddress}

Request Header : 
- X-API-TOKEN : Token (Mandatory)

{
        "street":"jalan",
        "city":"kota",
        "province":"provinsi",
        "country":"negara",
        "postalCode":"123123"
    }

Response body (Succes) :

    {
        "data":{
            "id":"random String",
            "street":"jalan",
            "city":"kota",
            "province":"provinsi",
            "country":"negara",
            "postalCode":"123123"
        }
    }

Response body (Failed) :

    {
        "error:"address is not found"
    }

## Get Address
Endpoint : GET /api/contacts/{idContact}/addreses/{idAddress}

Request Header : 
- X-API-TOKEN : Token (Mandatory)


Response body (Succes) :

    {
        "data":{
            "id":"random String",
            "street":"jalan",
            "city":"kota",
            "province":"provinsi",
            "country":"negara",
            "postalCode":"123123"
        }
    }

Response body (Failed) :

    {
        "error:"address is not found"
    }

## Remove Address
Endpoint : DELETE /api/contacts/{idContact}/addresses/{idAddress}

Request Header : 
- X-API-TOKEN : Token (Mandatory)


Response body (Succes) :

    {
        "data":"OK"
    }

Response body (Failed) :

    {
        "error:"address is not found"
    }

## List Address
Endpoint : GET /api/contacts/{idContact}/addresses

Request Header : 
- X-API-TOKEN : Token (Mandatory)

Response body (Succes) :

    {
        "data":[
            {
            "id":"random String",
            "street":"jalan",
            "city":"kota",
            "province":"provinsi",
            "country":"negara",
            "postalCode":"123123"
             }
        ]
    }

Response body (Failed) :

    {
        "error:"Contact is not found"
    }
