pwd // pet dalle al kwey 

ls  // law shenay ka leyma chy haya

cd (url) / (name) // bo chwna naw  folder  

cd ../  // garanawa bo shewny peshw

cd  // datgarenetawa bo sarata

mkdir (name)  // bo drwst krdny folder

touch (name).txt / java / python / jpg  // bo drwst krdny file

git clone (away datawe copy bkay)   // bo copy krdn

start nawyfile.txt  / java / jpg  // bo krdnway file

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
 //THIS IS WHEN YOU ARE COPY THE REPO  
  
1- cd nameoffile  // dachya naw aw filey ka datawe
  
2- git clone (away ka datawe copy bkay)   // aw repository ka datawe copy bkay

3- bro la editorek bkawa (agar pesh away dast kary bkay git status bkay pet dalle )

4- dastkary bka  (pash awya dast karyt krd git status bka pet dalle )

5-git add . / git add nawyfile // "nameoffile" is normal

6- git commit -m "lera marja shtek bnwsy" 

7- git push

/*
agar repoy xot nabet dabet wakw Collaborator zyad krbit agar na natwaany push bkait
*/ 

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS IS WHEN YOU ARE NOT COPY THE REPO

1- cd nameoffolder

2- bro la editorek bkawa (git starus bka pet dalle goran kary krawa ya nan ) 
  
3- dastkary bka (git starus bka pet dalle goran kary krawa ya nan )

4- git add . / git add nameoffile  // "nameoffile" is normal

5- git commit -m "marja shtek bnwsy" 

6- git pull origin main --rebase

7- git push -u origin main 

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

git config --global core.autocrlf true  // write it once , Don't let make confuse when many developers working on different OS 

git config -help  // when you don't know how it work 

git config -h    //  when you know about it , but forget how to write

