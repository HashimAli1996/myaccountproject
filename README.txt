Hi Guys, Welcome to my account manager webapp

To get things going please clone the repository to wherever comfortable!

Once cloned, please move the folder within the repo (runapp)...
...into your eclipse-workspace folder as this is the actual Maven-Java Project

From there, open your MySQL Workbench and create a local instance!

Once created, head over to the toolbar and go to:

Server -> Data Import -> Import from Self-Contained file(Second option)

insert/manually find the file path to db_scheme located within the runapp folder

you can then click on Start Import (located bottom right) and it will generate the db and tables!

From there you can launch eclipse, import the project and run as a Java Application...
...(this might take a while due to it being an inital build!)

Once built, head over to your preferred browser and go to localhost:8080 and you've made it!

Hope you enjoy it and I welcome all feedback!
I will be adding in further functionality to it within the week :)