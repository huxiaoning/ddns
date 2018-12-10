#!/bin/bash

project_path=~/dockerBuild/ddns/ddns

cd $project_path

mvn clean package

mv $project_path/target/ddns-0.0.1-SNAPSHOT.jar $project_path/work/build

cd $project_path/work/build

docker build -t ddns:1.0 .

docker run --rm -it -p 8080:8080 -d ddns:1.0