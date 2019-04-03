#!/usr/bin/env bash

sbt clean package

~/opt/spark-2.4.0-bin-hadoop2.7/bin/spark-submit \
--class org.rabbit.LineCount \
#--master spark://207.184.161.138:7077 \
--master local \
--conf "spark.executor.extraJavaOptions=-XX:+UseG1GC" \
~/spark-ab-linecount/target/scala-2.11/simple-project_2.11-1.0.jar