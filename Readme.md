


###Docker build

1. Create the docker image using the following command
   ```
   Docker image build .
   ```

2. Run the application 
     ```
       docker run springio/user 
       
     ```

#Docker login and push to central repo

1. Login to docker hub using your credentials
    ```
           docker login 
          
    ```
2. Check the image id using
    ```
           docker login --username=yourhubusername --email=youremail@company.com
          
    ```
 

##Docker

  

If you do not want to run as ***sudo mvn***, follow the following steps
1. add group docker if not already
   ```
   sudo groupadd docker
   ```
2. add user to the group
   ``` 
    sudo gpasswd -a $USER docker
   ```

3. Either do a 
    ```
      newgrp docker 
    ```
     
     or log out/in to activate the changes to groups.
4. Just run

   ```
     docker run hello-world
   ```
   to verify your changes.

   After completing the above steps you can run mvn docker commands without sudo.