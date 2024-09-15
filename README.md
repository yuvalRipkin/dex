# dex course
### Homework lesson 1

virtualbox installed:
![image](https://github.com/user-attachments/assets/fea2df6b-5b80-4a49-8b7b-71293af0801c)

Virtual machine with the latest Ubuntu Server:
![ubuntu-installed](https://github.com/user-attachments/assets/b103f351-953c-4303-bf5d-50f50eb9de64)

The commands:

![image](https://github.com/user-attachments/assets/fe4b7a05-283a-493d-9e20-cd09a415126a)

explanation:
mkdir homework - create a directory named homework.

cd homework - move to homework directory

mkdir {dir1,dir2,dir3} - create 3 files in homework folder

touch dir1/file1.txt,file2.txt.file3.txt - create files called file1.txt,file2.txt.file3.txt inside dir1 directory

echo "dex course" >> file1.txt - edit file1.txt and add into it the words dex course

grep "dex" ~/homework/dir1/*.txt - searches for all of the mentions of dex word in the files contains suffix of .txt inside dir1

find ~/homework/dir1/ -type f - looking for all the files in di1 directory

find ~/homework/dir1/ -type f -mtime -7  - looking for all the files in di1 directory that modified within the last 7 days
