## Steps to run the application

1. Place your csv file (users.csv) containing list of users in following directory 
2. Directory for input file : "src/main/resources/"
3. Run the following command 
4.  `./mvnw compile exec:java -Dexec.mainClass=org.example.Main -Dexec.args="users"`
5. If your input file has a different name, say "example.csv", then change the run command as follows
6. `./mvnw compile exec:java -Dexec.mainClass=org.example.Main -Dexec.args="example"`
7. Output file "assignments.csv" will be generated in the same location
8. Directory for input file : "src/main/resources/"
