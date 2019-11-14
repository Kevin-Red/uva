@echo off
f:
echo ---------------------------------------------------
echo %date:~0,10% %time:~0,8%    blog提交开始
echo ---------------------------------------------------
echo:
cd github/blog
git add .
git commit -m "%date:~0,10% %time:~0,8%" 
git push origin master
echo:
echo:
echo:
echo ---------------------------------------------------
echo %date:~0,10% %time:~0,8%    uva提交开始
echo --------------------------------------------------- 
echo:
cd ../uva
git add .
git commit -m "%date:~0,10% %time:~0,8%" 
git push origin master
echo:
echo:
pause