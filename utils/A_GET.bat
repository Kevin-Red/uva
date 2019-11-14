@echo off
set /p n=
md D:\UVA\%n%
xcopy /E F:\UVA\%n% D:\UVA\%n%
rd /s/q F:\UVA\%n%
pause