Prerequisites
============
    1.spark version is 2.1.0 that requres scala version is 2.11.x
    2.set the value of logFile for input file

FAQ
========
    1.org.apache.spark.SparkException: A master URL must be set in your configuration
    open intellij idea's Run-> Edit configuration... -> + Appliton, set VM options: -Dspark.master=local

