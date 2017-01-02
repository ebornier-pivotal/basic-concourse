#!/bin/bash 
export http_proxy=http://10.12.9.165:8080
export https_proxy=http://10.12.9.165:8080
cd basic-concourse-repo
./mvnw clean package -Dmaven.test.skip=true 
mv target/*.jar ../build/
