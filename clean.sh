#!/bin/sh
for file in ./*.micservice
do
    # 如果是目录 则执行逻辑
    if test -d $file 
    then
        echo $file
        cd $file
        echo 'clean' + $file
        mvn clean
        cd ..
    fi
done
echo 'finished clean'

