#!/bin/bash 
cd basic-concourse-repo
./mvnw clean package -Dmaven.test.skip=true 
mv target/*.jar build/
