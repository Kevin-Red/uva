@echo off
echo ---------------------------------------------------
echo %date:~0,10% %time:~0,8%    blog�ύ��ʼ
echo ---------------------------------------------------
echo:
f:
cd Blog
git add .
git commit -m "%date:~0,10% %time:~0,8%" 
git push origin master
echo:
echo:
echo:
echo ---------------------------------------------------
echo %date:~0,10% %time:~0,8%    uva�ύ��ʼ
echo --------------------------------------------------- 
echo:
d:
cd UVA
git add .
git commit -m "%date:~0,10% %time:~0,8%" 
git push origin master
echo:
echo:
pause