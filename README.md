# SpringKafka-producer

1)Download **Kafka** from the official website and install it.

2)Run **zookeeper** through the terminal. `.\zookeeper-server-start.bat ..\..\config\\zookeeper.properties`

3)Run **kafka** through the terminal. `.\kafka-server-start.bat ..\..\config\\server.properties`

4)Create a **topic**. `./kafka-topics.bat --create --topic NewTopic --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1`

5)Start the project🚀️

Then run SpringKafka-consumer  https://github.com/554455/SpringKafka-consumer
