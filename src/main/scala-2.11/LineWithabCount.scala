import org.apache.spark.{SparkConf, SparkContext}

object LineWithabCount {
  def main(args: Array[String]) {
    val logFile = "README.md" // Should be some file on your system
    val conf = new SparkConf().setAppName("Count lines")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    sc.stop()
  }

}
