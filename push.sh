#!/usr/bin/env bash

sshpass -p '123456' scp -o StrictHostKeyChecking=no -o UserKnownHostsFile=/dev/null \
    /Users/zach/spark-ab-linecount/target/spark-ab-linecount-0.1.jar root@172.16.9.246:/apps