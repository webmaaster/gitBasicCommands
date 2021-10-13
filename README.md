# gitBasicCommands

Centralized version Control System

Distributed Version Control System

1) have git installed in your laptop
2) create a folder and create the necessary java files(created a java project - UtilityProject using eclipse) - this acts as the working directory
3) move into the java project folder (UtilityProject)
4) create git local repository
	- open git bash here
	- run the command  - git init
	- this command will create a .git hidden folder inside UtilityProject folder
5) move the files from working directory to the staging area
	- run the command  - git add .
6) move files from staging area to local repository
	- run the command - git commit -m "initial commit"
7) next we create a remote repository(UtilityRepository) in out github account
8) come back to the bit bash and set the remote url
	- run the command - git remote add origin https://github.com/TeamLeadDemo/UtilityRepository.git
9) push the code from local repository to the remote repository
	- run the command - git push -u origin master

Rewriting the steps if you don't have eclipse
----------------------------------------------
1) have git installed in your laptop
2) create a folder(DemoFolder) and create a file sample.doc in it , DemoFolder acts as the working directory
3) move into the folder (DemoFolder)
4) create git local repository
	- open git bash here
	- run the command  - git init
	- this command will create a .git hidden folder inside DemoFolder folder
5) move the files from working directory to the staging area
	- run the command  - git add .
6) move files from staging area to local repository
	- run the command - git commit -m "initial commit"
7) next we create a remote repository  (DemoRepository) in our github account
8) come back to the bit bash and set the remote url
	- run the command - git remote add origin https://github.com/TeamLeadDemo/DemoRepository.git
9) push the code from local repository to the remote repository
	- run the command - git push -u origin master

git status

git config --list
git config --global user.name "TeamLeadDemo"
git config --global user.email "team2021lead@gmail.com"
git config --list

git branch
git branch -a
git branch requirement1
git checkout requirement1
git branch
git push --set-upstream origin requirement1

github pull request
github issues

