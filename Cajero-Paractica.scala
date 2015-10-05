

Blank@Blank-PC MINGW32 ~ (master)
$

Blank@Blank-PC MINGW32 ~ (master)
$ mk dir poo1-1
bash: mk: command not found

Blank@Blank-PC MINGW32 ~ (master)
$ mkdir poo1-1
mkdir: cannot create directory ‘poo1-1’: File exists

Blank@Blank-PC MINGW32 ~ (master)
$ dir poo1-1
Ejercicio1.scala  Ejercicio3.scala  Proceso-Tareas.md.txt
Ejercicio2.scala  LICENSE           README.md

Blank@Blank-PC MINGW32 ~ (master)
$ mkdir poo1-1
mkdir: cannot create directory ‘poo1-1’: File exists

Blank@Blank-PC MINGW32 ~ (master)
$ cd poo1-1

Blank@Blank-PC MINGW32 ~/poo1-1 (master)
$ git add Proceso-Tareas.md
fatal: pathspec 'Proceso-Tareas.md' did not match any files

Blank@Blank-PC MINGW32 ~/poo1-1 (master)
$ git add .

Blank@Blank-PC MINGW32 ~/poo1-1 (master)
$ git add Proceso-Tareas.md
fatal: pathspec 'Proceso-Tareas.md' did not match any files

Blank@Blank-PC MINGW32 ~/poo1-1 (master)
$ git status
On branch master
Your branch is up-to-date with 'origin/master'.
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

        new file:   Ejercicio1.scala
        new file:   Ejercicio2.scala
        new file:   Ejercicio3.scala
        new file:   Proceso-Tareas.md.txt


Blank@Blank-PC MINGW32 ~/poo1-1 (master)
$ git add Proceso-Tareas.md.txt

Blank@Blank-PC MINGW32 ~/poo1-1 (master)
$ git commit -m "Pasos para realizar un PR"
[master bf93e10] Pasos para realizar un PR
 4 files changed, 75 insertions(+)
 create mode 100644 Ejercicio1.scala
 create mode 100644 Ejercicio2.scala
 create mode 100644 Ejercicio3.scala
 create mode 100644 Proceso-Tareas.md.txt

Blank@Blank-PC MINGW32 ~/poo1-1 (master)
$ git push origin master
Counting objects: 6, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (6/6), 1.26 KiB | 0 bytes/s, done.
Total 6 (delta 0), reused 0 (delta 0)
To git@github.com:diana170309/poo1-1.git
   b8bcdea..bf93e10  master -> master

