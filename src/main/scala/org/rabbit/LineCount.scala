package org.rabbit

import org.apache.spark.{SparkConf, SparkContext}

object LineCount {
  def main(args: Array[String]) {
    System.setProperty("HADOOP_USER_NAME", "adaas")
    val logFile = "README.md" // Should be some file on your system
    val conf = new SparkConf()
      .setMaster("local[2]")
//            .setMaster("spark://localhost:7077")
      .setAppName("Count lines")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    sc.stop()
  }

}
