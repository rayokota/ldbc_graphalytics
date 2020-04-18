# Graphalytics KafkaGraphs platform driver

KafkaGraphs... (TODO: provide a short description on KafkaGraphs). To execute Graphalytics benchmark on KafkaGraphs, follow the steps in the Graphalytics tutorial on [Running Benchmark](https://github.com/ldbc/ldbc_graphalytics/wiki/Manual%3A-Running-Benchmark) with the KafkaGraphs-specific instructions listed below.

### Obtain the platform driver
There are two possible ways to obtain the KafkaGraphs platform driver:

 1. **Download the (prebuilt) [KafkaGraphs platform driver](http://graphalytics.site/dist/stable/) distribution from our website.

 2. **Build the platform drivers**: 
  - Download the source code from this repository.
  - Execute `mvn clean package` in the root directory (See details in [Software Build](https://github.com/ldbc/ldbc_graphalytics/wiki/Documentation:-Software-Build)).
  - Extract the distribution from  `graphalytics-{graphalytics-version}-kgraphs-{platform-version}.tar.gz`.

### Verify the necessary prerequisites
The softwares listed below are required by the KafkaGraphs platform driver, which should be properly configured in the cluster environment....

### Adjust the benchmark configurations
Adjust the KafkaGraphs configurations in `config/platform.properties`...

