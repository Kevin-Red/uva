@echo off
f:
echo ---------------------------------------------------
echo %date:~0,10% %time:~0,8%    blog���¿�ʼ
echo --------------------------------------------------- 
echo:
cd github/blog
git pull 
echo:
echo:
echo:
echo ---------------------------------------------------
echo %date:~0,10% %time:~0,8%    uva���¿�ʼ
echo --------------------------------------------------- 
echo:
cd ../uva
git pull
echo:
echo:
pause