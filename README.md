Setup MongoDB in Docker:

docker pull mongo
docker run -d -p 27017:27019:27017-27019 --name mongodb mongo


The last command will start a new detached mongodb container named "mongodb" and maps the ports so we can access the database from our springboot app.

You can access the mongo shell by executing the following command

docker exec -it mongodb bash

Once in the container bash, enter

mongo


You can then execute mongodb commands

show dbs
use rest_tutorial

db.createCollection("pets");
db.pets.save({name: "Surly", species: "Cat", breed: "Tabby"});
db.pets.save({name: "Summit", species: "Cat", breed: "Tabby"});

db.pets.find({name: "Surly"})
db.pets.find({})