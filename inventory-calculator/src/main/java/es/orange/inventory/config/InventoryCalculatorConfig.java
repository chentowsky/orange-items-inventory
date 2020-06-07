package es.orange.inventory.config;

import java.net.UnknownHostException;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.apache.kafka.streams.StreamsConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.orange.inventory.schema.Schemas;

@Configuration
public class InventoryCalculatorConfig {

	@Value("${schema.registry.url}")
	private String schemaRegistryUrl;

	@Value("${spring.kafka.bootstrap.servers}")
	private String bootstrapServers;

	@PostConstruct
	public void postConstructOperations() {
		Schemas.configureSerdesWithSchemaRegistryUrl(schemaRegistryUrl);
	}

	@Bean("streamsConfig")
	public Properties streamsConfig() throws UnknownHostException {

		Properties props = new Properties();

		props.put(StreamsConfig.APPLICATION_ID_CONFIG, "inventoryCalculator");
		props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		props.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, 100);

		return props;
	}

}
