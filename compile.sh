#!/bin/sh
folder="package"
checkpackage(){
    if [ ! -d $folder ];
    then
        mkdir $folder
    fi
    rm -rf $folder/*
}

movefile(){
    cd ./target
    for jarfile in ./*.jar
    do
        echo $jarfile
        cp $jarfile ../../$folder
    done
    for warfile in ./*.war
        do
            echo $warfile
            cp $warfile ../../$folder
        done
    cd ..
}
checkpackage $folder
for file in ./*.microservice
do
    # 如果是目录 则执行逻辑
    if test -d $file  
    then
        #echo $file
        cd $file
        echo 'clean' + $file
        mvn clean package
        movefile $file
        cd ..
    fi
done
echo 'finished compile'


