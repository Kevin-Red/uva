@echo off
set /p n=
md D:\UVA\Uva%n%
xcopy /E D:\UVA\Uva%n% F:\github\uva\Uva%n%
rd /s/q D:\UVA\Uva%n%
pause