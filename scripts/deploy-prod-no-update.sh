#!/bin/bash
cd ..
cd target
read -sp 'Password: ' pw
fuser -k 8843/tcp
export JASYPT_ENCRYPTOR_PASSWORD=$pw
nohup java -XX:+HeapDumpOnOutOfMemoryError -Xmx1024m -jar -Dfile.encoding=UTF-8 -Dspring.profiles.active=prod alovoa-1.1.0.jar &
sleep 5
unset JASYPT_ENCRYPTOR_PASSWORD