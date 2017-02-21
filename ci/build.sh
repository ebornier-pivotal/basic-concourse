#!/bin/bash 
cd basic-concourse-repo
export
./mvnw clean package -Dmaven.test.skip=true 
mv target/*.jar ../build/
