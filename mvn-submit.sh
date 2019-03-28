#!/usr/bin/env bash

mvn clean package

~/opt/spark-2.4.0-bin-hadoop2.7/bin/spark-submit \
--class org.rabbit.LineCount \
--master local \
--conf "spark.executor.extraJavaOptions=-XX:+UseG1GC" \
~/spark-ab-linecount/target/spark-ab-linecount-0.1.jar