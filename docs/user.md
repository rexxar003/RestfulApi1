# User API Spec

## Register User

Endpoint :POST /api/users

Request Body :


    {
    "username":"kanza",
    "password":"rahasia",
    "name":"kanza az zahrawani"
    }


Response Body(succes) :

    {
    "data":"OK"
    }


Response Body(failed) :

    {
    "error":"Username must not blank, etc"
    }



## Login User


Endpoint :POST /api/auth/login

Request Body :

    {
    "username":"kanza",
    "password":"rahasia"
    }


Response Body(succes) :

    {
    "data":{
        "token":"TOKEN",
        "expiredAt": 202029302902 //milisecond
           }
    }



Response Body(failed,401) :

    {
    "data":"KO",
    }


## Get User
Endpoint :GET /api/user/current

Request Header:

- X-API-TOKEN : Token (mandatory)

Response Body(succes) :

    {
    "data":{
        "username" : "kanza",
        "name" : "kanza az zahrawani
           }
    }


Response Body(failed,401) :

    {
    "data":"Unauthorized"
    }


## Update User
Endpoint :PATCH /api/user/current


Request Header:

- X-API-TOKEN : Token (mandatory)


Request body:

    {
        "name":"kanza zahrawani", // put if only want to update name
        "password":"new password" // put if only want to update password
    }

Response Body(succes) :

    {
    "data":{
        "username" : "kanza",
        "name" : "kanza az zahrawani
           }
    }


Response Body(failed,401) :

    {
    "data":"Unauthorized"
    }

## Logout User

Endpoint : DELETE /api/auth/logout

Request Header:

- X-API-TOKEN : Token (mandatory)

Response Body (Succes):

    {
        "data":"OK"
    }





