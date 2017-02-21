#!/bin/bash 
export MAVEN_OPTS="-Dhttp.proxyHost=10.12.9.165 -Dhttp.proxyPort=8080 -Dhttps.proxyHost=10.12.9.165 -Dhttps.proxyPort=8080"
cd basic-concourse-release
tar xvf source.tar.gz --strip 1
export
./mvnw clean package -Dmaven.test.skip=true 
mv target/*.jar ../build/
