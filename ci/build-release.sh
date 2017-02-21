#!/bin/bash 
cd basic-concourse-release
tar xvf source.tar.gz --strip 1
export
./mvnw clean package -Dmaven.test.skip=true 
mv target/*.jar ../build/
