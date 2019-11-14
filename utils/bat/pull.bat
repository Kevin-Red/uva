@echo off
echo ---------------------------------------------------
echo %date:~0,10% %time:~0,8%    blog更新开始
echo --------------------------------------------------- 
echo:
f:
cd Blog
git pull 
echo:
echo:
echo:
echo ---------------------------------------------------
echo %date:~0,10% %time:~0,8%    uva更新开始
echo --------------------------------------------------- 
echo:
d:
cd UVA
git pull
echo:
echo: