@echo off
SETLOCAL
SET DIRNAME=%~dp0%
IF "%DIRNAME%" == "" SET DIRNAME=.
SET APP_BASE_NAME=%~n0%
SET APP_HOME=%DIRNAME%
FOR %%i IN ("%APP_HOME%\.mvn\wrapper\maven-wrapper.jar") DO SET "MAVEN_PROJECTBASEDIR=%%~dp"
"%JAVA_HOME%\bin\java" -classpath "%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar" -Dmaven.home="%M2_HOME%" -Dmaven.multiModuleProjectDirectory="%MAVEN_PROJECTBASEDIR%" "%MAVEN_OPTS%" org.apache.maven.wrapper.MavenWrapperMain %MAVEN_CONFIG% %*
ENDLOCAL